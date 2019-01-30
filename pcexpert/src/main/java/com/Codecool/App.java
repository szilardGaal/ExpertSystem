package com.Codecool;

import java.util.List;

public class App {
    public static void main(String[] args) {

        FactParser fParser = new FactParser("src/main/data/Facts.xml");
        RuleParser rParser = new RuleParser("src/main/data/Rules.xml");
        ESProvider provider = new ESProvider(fParser, rParser);

        provider.getRRepo().getAnswers();
        System.out.println(provider.getRRepo().getQuestionsList());
        List<String> compsForYou = provider.matchAnswersIterator();
        for (String comp : compsForYou) {
            System.out.println(comp);
        }
    }
}
