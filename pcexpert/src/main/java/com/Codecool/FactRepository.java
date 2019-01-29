package com.Codecool;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class FactRepository {

    private FactIterator factIter = new FactIterator();
    private List<Fact> factsList = new ArrayList<>();


    public void addFact(Fact fact) {
        factsList.add(fact);

    }

    public List<Fact> getFactsList() {
        return factsList;
    }

    public FactIterator getIterator() {
        return factIter;
    }

    private class FactIterator implements Iterator {

        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < factsList.size();
        }

        @Override
        public Object next() {
            Fact fact = factsList.get(currentIndex);
            currentIndex ++;
            return fact;
        }

        @Override
        public void remove() {
            //to keep intelliJ silent.
        }
    }
}
