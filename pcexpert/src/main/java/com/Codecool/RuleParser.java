package com.Codecool;

public class RuleParser extends XMLParser {

    RuleRepository ruleRepo = new RuleRepository();

    public RuleParser(String path) {
        loadXMLDocument(path);
    }

    public RuleRepository getRuleRepository() {
        return ruleRepo;
    }

    public void load() {
        // Kind of same as seen in FactParser.
    }
}
