package com.Codecool;

import java.util.List;

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
}
