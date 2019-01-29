package com.Codecool;

public class Question {

    private Answer answer;
    private String question;
    private String id;

    public Question(String id, String question, Answer answer) {
        this.question = question;
        this.answer = answer;
        this.id = id;
    }

    public String getId() {
        return this.id;
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

}

