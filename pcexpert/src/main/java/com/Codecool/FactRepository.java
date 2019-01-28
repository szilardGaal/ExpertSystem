package com.Codecool;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class FactRepository {

    FactIterator factIter;
    Fact fact;
    HashMap<Fact, Boolean> theMap;

    public void addFact(Fact fact) {
        //maphoz adunk valahogy
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
    }
}
