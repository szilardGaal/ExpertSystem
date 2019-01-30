package com.Codecool;

import java.util.*;

public class RuleRepository {

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

    public Question getQuestionByID(String id) {
        for (Question question : questionsList) {
            if (question.getId().equals(id)) {
                return question;
            }
        }
        return null;
    }


    public void getAnswers() {
        Scanner sc = new Scanner(System.in);
        for (int j = 0; j < rulesList.size(); j++) {
            System.out.println(rulesList.get(j).getQuestion());
            while (true) {
                System.out.println("Please answer: " + rulesList.get(j).getIdSet());
                String input = sc.nextLine();
                if (rulesList.get(j).getIdSet().contains(input)) {
                    questionsList.add(new Question(rulesList.get(j).getId(),
                            rulesList.get(j).getQuestion(),
                            new Answer(input, rulesList.get(j).getTheMap())));
                    break;
                }
            }
        }
    }

    public QuestionIterator getIterator() {
        return new QuestionIterator(questionsList);
    }

    public class QuestionIterator implements Iterator {

        private int currentIndex = 0;
        private List<Question> qList;

        public QuestionIterator(List<Question> qList) {
            this.qList = qList;
        }

        @Override
        public boolean hasNext() {
            return currentIndex < qList.size();
        }

        @Override
        public Question next() {
            Question question = qList.get(currentIndex);
            currentIndex++;
            return question;
        }

        @Override
        public void remove() {

        }
    }
}
