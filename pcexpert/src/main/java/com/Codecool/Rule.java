package com.Codecool;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Rule {

    private String id;
    private String question;
    private HashMap<String, Boolean> evals = new HashMap<>();

    public Rule(String id, String question) {
        this.id = id;
        this.question = question;
    }

    public Set<String> getIdSet() {
        return evals.keySet();
    }

    public Collection<Boolean> getAnswerSet() {
        return evals.values();
    }


    public void setRuleValueById(String id, boolean value) {
        evals.put(id, value);
    }

    public boolean getValueById(String id) {
        return evals.get(id);
    }

    public String getQuestion() {
        return this.question;
    }

    @Override
    public String toString() {
        return id + " " + question;
    }
}