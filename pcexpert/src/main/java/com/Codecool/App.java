package com.Codecool;

public class App 
{
    public static void main( String[] args ) {

        FactParser fParser = new FactParser();
        RuleParser rParser = new RuleParser();
        ESProvider provider = new ESProvider(fParser, rParser);

    }
}
