package com.Codecool;

import java.util.ArrayList;
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

    public RuleRepository getRRepo() {
        return rRepo;
    }

    public List<String> matchAnswersIterator() {
        List <String> computers = new ArrayList<>();

        FactRepository.FactIterator fIter = fRepo.getIterator();

        while (fIter.hasNext()) {
            Fact fact = fIter.next();
            Set<String> set = fact.getIdSet();
            int i = 0;
            for (String id : set) {
                i++;
                if (fact.getValueById(id) != rRepo.getQuestionByID(id).getAnswer().getValue().getSelectionType()) {
                    break;
                }
                if (i == set.size() - 1) {
                    computers.add(fact.getDescription());
                }
            }
        }

        return computers;
    }


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
                if (flist.get(i).getValueById(id) != qlist.get(i).getAnswer().getValue().getSelectionType()) {

                    continue;

                }
                System.out.println("addtolist");
            }
        }

    }
}

