package com.Codecool;

import java.util.Set;

public class Fact {

    String id;
    String description;

    public Fact(String id, String description) {
        this.id = id;
        this.description = description;
    }

    public Set<String> getIdSet() {
        return null;
    }

    public void setFactValueById(String id, boolean value) {
    }

    public boolean getValueById(String id) {
        return false;
    }

    public String getDescription() {
        return this.description;
    }
}
