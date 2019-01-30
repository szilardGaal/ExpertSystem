package com.Codecool;

import java.util.List;

public class SingleValue extends Value {

    private Boolean value;
    private String param;

    public SingleValue(String param, boolean selectionType) {
        this.value = selectionType;
        this.param = param;
    }



    @Override
    public String getInputPattern() {
        return param;
    }

    @Override
    public boolean getSelectionType() {
        return value;
    }
}