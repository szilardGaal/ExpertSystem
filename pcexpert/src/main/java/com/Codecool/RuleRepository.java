package com.Codecool;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class RuleRepository {

    RuleIterator ruleIter;
    Rule rule;
    HashMap<Fact, Boolean> theMap;

    public void addRule(Rule rule) {
        //maphoz adunk valahogy
    }

    public RuleIterator getIterator() {
        return ruleIter;
    }

    private class RuleIterator implements Iterator {

        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public Object next() {
            return null;
        }
    }
}
