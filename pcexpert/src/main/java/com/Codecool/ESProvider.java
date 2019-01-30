package com.Codecool;

import java.util.List;
import java.util.Set;

public class ESProvider {

    private FactRepository fRepo;
    private RuleRepository rRepo;

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


    public void matchAnswers() {
        List<Question> qlist = rRepo.getQuestionsList();
        System.out.println(qlist.toString());
        List<Fact> flist = fRepo.getFactsList();
        System.out.println(flist.toString());
        for (int i = 0; i< flist.size();i++){
            Set<String> tempset = flist.get(i).getIdSet();
            for (String id : tempset) {
                if (flist.get(i).getValueById(id) == qlist.get(i).getAnswer().getValue().getSelectionType()) {
                    if (i == 3) {
                        System.out.println("Good one");
                    } else {
                        continue;
                    }
                }
            }
    }

    }
}

