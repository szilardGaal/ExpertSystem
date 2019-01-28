package com.Codecool;

import java.util.Iterator;
import java.util.Set;

public class FactRepository {

    FactIterator factIter;
    Fact fact;

    public void addFact(Fact fact) {
    }

    public FactIterator getIterator() {
        return factIter;
    }


    private class Fact {

        String id;
        String description;

        public Fact(String id, String description) {
            this.id = id;
            this.description = description;
        }

        public Set<String> getIdSet() {
            return null;
        }

        public void setFactValueById(String id, boolean value) {
        }

        public boolean getValueById(String id) {
            return false;
        }

        public String getDescription() {
            return this.description;
        }
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
