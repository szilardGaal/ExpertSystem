package com.Codecool;

public class ESProvider {

    FactRepository fRepo;
    RuleRepository rRepo;

    public ESProvider(FactParser fParser, RuleParser rParser) {
        fParser.load();
        fRepo = fParser.getFactRepo();
        rParser.load();
        rRepo = rParser.getRuleRepository();
    }

    public FactRepository getFRepo() {
        return fRepo;
    }

    public void collectAnswer() {
    }

    public boolean getAnswerByQuestion(String question) {
        return false;
    }

    public String evaluate() {
        return "";
    }

    public RuleRepository getRRepo() { return rRepo;}
    }

