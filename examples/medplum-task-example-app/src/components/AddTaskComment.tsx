import { Modal } from '@mantine/core';
import { createReference, getQuestionnaireAnswers } from '@medplum/core';
import { Annotation, QuestionnaireResponse } from '@medplum/fhirtypes';
import { QuestionnaireForm, useMedplumProfile } from '@medplum/react';
import { useState } from 'react';
import { commentQuestionnaire } from '../data/questionnaires';

interface AddTaskCommentProps {
  onAddComment: (comment: Annotation) => void;
  isOpen: boolean;
  onClose: () => void;
}

export function AddTaskComment(props: AddTaskCommentProps): JSX.Element {
  const author = useMedplumProfile();
  const [comment, setComment] = useState<Annotation>({});

  const handleSubmit = () => {
    if (comment?.text) {
      const newComment: Annotation = {
        ...comment,
        authorReference: author && createReference(author),
      };

      props.onAddComment(newComment);
      props.onClose();
    }
  };

  const onQuestionnaireSubmit = (formData: QuestionnaireResponse) => {
    // Get the answers from the QuestionnaireResponse. See https://www.medplum.com/docs/bots/bot-for-questionnaire-response#4-write-the-bot
    const answer = getQuestionnaireAnswers(formData)['new-comment'].valueString;

    // Create a new note
    if (answer) {
      const newNote: Annotation = {
        ...comment,
        text: answer,
        authorReference: author && createReference(author),
        time: new Date().toISOString(),
      };

      // Add the note to the task
      props.onAddComment(newNote);
    }

    // Close the modal
    props.onClose();
  };

  return (
    <Modal onSubmit={handleSubmit} opened={props.isOpen} onClose={props.onClose}>
      <QuestionnaireForm questionnaire={commentQuestionnaire} onSubmit={onQuestionnaireSubmit} />
    </Modal>
  );
}