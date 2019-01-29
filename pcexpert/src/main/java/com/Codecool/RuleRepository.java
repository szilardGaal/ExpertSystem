package com.Codecool;

import java.util.*;

public class RuleRepository {

    private RuleIterator ruleIter = new RuleIterator();
    private List<Rule> rulesList = new ArrayList<>();

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

        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < rulesList.size();
        }

        @Override
        public Object next() {
            Rule rule = rulesList.get(currentIndex);
            currentIndex ++;
            return rule;
        }

        @Override
        public void remove() {

        }
    }
}
