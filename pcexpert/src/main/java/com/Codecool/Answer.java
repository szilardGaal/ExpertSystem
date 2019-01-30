package com.Codecool;

import java.util.HashMap;

public class Answer {

    private Value value;
    private HashMap<String, Boolean> theMap;


    public Answer(String input, HashMap<String, Boolean> inputMap) {
        theMap = inputMap;
        value = new SingleValue(input, evaluateAnswerByInput(input));
    }

    public boolean evaluateAnswerByInput(String input) {
        return theMap.get(input);
    }

    public Value getValue() {
        return value;
    }
}
