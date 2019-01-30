package com.Codecool;

import java.util.Set;
import java.util.HashMap;

public class Fact {

    private String id;
    private String description;
    private HashMap<String, Boolean> evals = new HashMap<>();

    public Fact(String id, String description) {
        this.id = id;
        this.description = description;
    }

    public Set<String> getIdSet() {
        return evals.keySet();
    }

    public void setFactValueById(String id, boolean value) {
        evals.put(id, value);
    }

    public boolean getValueById(String id) {
        return evals.get(id);
    }

    public String getDescription() {
        return this.description;
    }

    @Override
    public String toString() {
        return id + "" + description;
    }
}