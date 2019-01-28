package com.Codecool;

public class App 
{
    public static void main( String[] args ) {

        FactParser fParser = new FactParser("src/main/data/Facts.xml");
        RuleParser rParser = new RuleParser("src/main/data/Rules.xml");
        ESProvider provider = new ESProvider(fParser, rParser);
    }
}
