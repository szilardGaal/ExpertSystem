package com.Codecool;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class FactRepository {

    private List<Fact> factsList = new ArrayList<>();

    public void addFact(Fact fact) {
        factsList.add(fact);

    }

    public List<Fact> getFactsList() {
        return factsList;
    }

    public FactIterator getIterator() {
        return new FactIterator(factsList);
    }

    public class FactIterator implements Iterator {

        private int currentIndex = 0;
        private List<Fact> fList;

        public FactIterator(List<Fact> fList) {
            this.fList = fList;
        }

        @Override
        public boolean hasNext() {
            return currentIndex < fList.size();
        }

        @Override
        public Fact next() {
            Fact fact = fList.get(currentIndex);
            currentIndex++;
            return fact;
        }

        @Override
        public void remove() {
            //to keep intelliJ silent.
        }
    }
}
