package com.Codecool;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class FactRepository {

    FactIterator factIter;
    List<Fact> factsList = new ArrayList<>();
    HashMap<Fact, Boolean> theMap;

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

        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public Object next() {
            return null;
        }

        @Override
        public void remove() {
            //to keep intelliJ silent.
        }
    }
}
