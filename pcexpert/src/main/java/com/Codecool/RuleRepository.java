package com.Codecool;

import java.util.*;

public class RuleRepository {

    RuleIterator ruleIter;
    List<Rule> rulesList = new ArrayList<>();
    HashMap<Rule, Boolean> theMap;

    public void addRule(Rule rule) {
        rulesList.add(rule);
    }

    public List<Rule> getRulesList() {
        return rulesList;
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

        @Override
        public void remove() {

        }
    }
}
