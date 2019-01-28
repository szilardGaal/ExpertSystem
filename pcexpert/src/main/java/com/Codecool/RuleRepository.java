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
}
