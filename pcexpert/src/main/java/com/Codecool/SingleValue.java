package com.Codecool;

import java.util.List;

public class SingleValue extends Value {

    public SingleValue(String param, boolean selectionType) {
    }

    @Override
    public List<String> getInputPattern() {
        return null;
    }

    @Override
    public boolean getSelectionType() {
        return false;
    }
}