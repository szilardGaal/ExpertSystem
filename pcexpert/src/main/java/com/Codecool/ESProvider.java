package com.Codecool;

import java.util.List;
import java.util.Set;

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


    public void matchAnswers(){

    List<Question> qlist = rRepo.getQuestionsList();

    for (int i = 0;i<qlist.size();i++ ){
        qlist.get(i).getAnswer();
        qlist.get(i).getId();
    }
    List<Fact> flist = fRepo.getFactsList();
    for (int i = 0; i< flist.size();i++){
        Set<String> tempset = flist.get(i).getIdSet();
        for (String id : tempset){
            if (flist.get(i).getValueById(id) != qlist.get(i).getAnswer().getValue()) {

                continue;

            }
            System.out.println("addtolist");
        }
    }

    }
}

