package com.Codecool;

import java.util.Iterator;
import java.util.List;

public class RuleRepository {

    Question question;
    QuestionIterator questionIter;

    public void addQuestion(Question question) {
    }

    public QuestionIterator getIterator() {
        return questionIter;
    }

    public class QuestionIteraton implements Iterator {

        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public Object next() {
            return null;
        }
    }

    public class Question {

        Answer answer;
        String question;
        String id;

        public Question(String id, String question, Answer answer) {
            this.question = question;
            this.answer = answer;
            this.id = id;
        }

        public String getId() {
            return "";
        }

        public String getQuestion() {
            return this.question;
        }

        public Answer getAnswer() {
            return this.answer;
        }

        public boolean getEvaluatedAnswer(String input) {
            return false;
        }


        public class Answer {

            Value value;

            public boolean evaluateAnswerByInput(String input) {
                return false;
            }

            public void addValue(Value value) {
            }

            public abstract class Value {

                public List<String> getInputPatter() {
                    return null;
                }

                public boolean getSelectionType() {
                    return false;
                }

            }
            public class MultipleValue extends Value {



                public MultipleValue(List<String> param, boolean selectionType) {
                }

            }

            public class SingleValue extends Value {

                public SingleValue(String param, boolean selectionType) {

                }

            }
        }

    }
}
