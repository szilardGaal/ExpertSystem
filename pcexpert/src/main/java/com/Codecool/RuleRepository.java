package com.Codecool;

import java.util.*;

public class RuleRepository {

    private QuestionIterator qIter = new QuestionIterator();
    private List<Rule> rulesList = new ArrayList<>();
    private List<Question> questionsList = new ArrayList<>();

    public void addRule(Rule rule) {
        rulesList.add(rule);
    }

    public List<Rule> getRulesList() {
        return rulesList;
    }

    public List<Question> getQuestionsList() {
        return questionsList;
    }

    public void getAnswers() {
        Scanner sc = new Scanner(System.in);
        for (int j = 0; j < rulesList.size(); j++) {
            System.out.println(rulesList.get(j).getQuestion());
            while (true) {
                System.out.println("Please answer: " + rulesList.get(j).getIdSet());
                String input = sc.nextLine().toLowerCase();
                if (rulesList.get(j).getIdSet().contains(input)) {
                    questionsList.add(new Question(rulesList.get(j).getId(),
                                                   rulesList.get(j).getQuestion(),
                                                   new Answer(input, rulesList.get(0).getTheMap())));
                    break;
                }
            }
        }
    }

    public QuestionIterator getIterator() {
        return qIter;
    }

    private class QuestionIterator implements Iterator {

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
