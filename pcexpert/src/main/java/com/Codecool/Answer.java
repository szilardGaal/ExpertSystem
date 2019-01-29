package com.Codecool;

import java.util.Scanner;

public class Answer {

    Value value;


    public Answer(String input) {
        value = new SingleValue(input, evaluateAnswerByInput(input));
    }

    public boolean evaluateAnswerByInput(String input) {
        return false;
    }

    public void addValue(Value value) {
    }


}
