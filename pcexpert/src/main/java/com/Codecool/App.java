package com.Codecool;

import java.util.List;

public class App {
    public static void main(String[] args) {

        FactParser fParser = new FactParser("src/main/data/Facts.xml");
        RuleParser rParser = new RuleParser("src/main/data/Rules.xml");
        ESProvider provider = new ESProvider(fParser, rParser);

        provider.getRRepo().getAnswers();
        List<String> compsForYou = provider.matchAnswersIterator();
        System.out.println("Let me check the stock...");
        try{
            Thread.sleep(2000);
        }catch(InterruptedException e){
        }
        if(compsForYou.size() == 0) {
            System.out.println("We don't have any computers that would suit your needs, Sir.");
        }
        for (String comp : compsForYou) {
            System.out.println("Our recommendation is: " + comp);
        }
    }
}
