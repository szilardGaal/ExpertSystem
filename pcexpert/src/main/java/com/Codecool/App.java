package com.Codecool;

import java.util.List;

public class App
{
    public static void main( String[] args ) {

        FactParser fParser = new FactParser("src/main/data/Facts.xml");
        RuleParser rParser = new RuleParser("src/main/data/Rules.xml");
        ESProvider provider = new ESProvider(fParser, rParser);
        List<Fact> whatever = provider.getFRepo().getFactsList();
        for (Fact fact : whatever) {
            System.out.println(fact);
            System.out.println(fact.getIdSet());
        }
        List<Rule> whatever2 = provider.getRRepo().getRulesList();
        for (Rule rule : whatever2) {
            System.out.println(rule);
            System.out.println(rule.getIdSet());
            System.out.println(rule.getAnswerSet());
        }

        provider.getRRepo().getAnswers();
        System.out.println(provider.getRRepo().getQuestionsList());
        List<String> compsForYou = provider.matchAnswersIterator();
        for (String comp : compsForYou) {
            System.out.println(comp);
        }
    }
}
