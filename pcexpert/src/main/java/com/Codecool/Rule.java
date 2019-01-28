package com.Codecool;

import java.util.Set;

public class Rule {

    String id;
    String question;

    public Rule(String id, String question) {
        this.id = id;
        this.question = question;
    }

    public Set<String> getIdSet() {
        return null;
    }

    public void setFactValueById(String id, boolean value) {
    }

    public boolean getValueById(String id) {
        return false;
    }

    public String getQuestion() {
        return this.question;
    }
}