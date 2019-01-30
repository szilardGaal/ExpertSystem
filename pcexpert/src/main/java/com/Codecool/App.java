package com.Codecool;

import java.util.List;

public class App {
    public static void main(String[] args) {

        FactParser fParser = new FactParser("src/main/data/Facts.xml");
        RuleParser rParser = new RuleParser("src/main/data/Rules.xml");
        ESProvider provider = new ESProvider(fParser, rParser);

        provider.getRRepo().getAnswers();
        List<String> compsForYou = provider.matchAnswersIterator();
        if(compsForYou.size() == 0) {
            System.out.println("No such computer.");
        }
        for (String comp : compsForYou) {
            System.out.println(comp);
        }
    }
}
