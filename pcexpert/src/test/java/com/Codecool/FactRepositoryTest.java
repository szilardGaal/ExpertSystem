package com.Codecool;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FactRepositoryTest {

    @Test
    void testAdd() {
        FactRepository fp = new FactRepository();
        int previousSize = fp.getFactsList().size();

        fp.addFact(new Fact("test", "test"));

        assertEquals(previousSize + 1, fp.getFactsList().size());
    }

    @Test
    void testEmptyIterator() {
        FactRepository fp = new FactRepository();
        FactRepository.FactIterator iterator = fp.getIterator();

        assertFalse(iterator.hasNext());
    }

    @Test
    void testNonEmptyIterator() {
        // given
        FactRepository fp = new FactRepository();

        fp.addFact(new Fact("test1", "test1"));
        fp.addFact(new Fact("test2", "test2"));

        FactRepository.FactIterator iterator = fp.getIterator();

        // when/then
        assertTrue(iterator.hasNext());
        Fact fact1 = iterator.next();
        assertEquals(fact1.getId(), "test1");

        assertTrue(iterator.hasNext());
        Fact fact2 = iterator.next();
        assertEquals(fact2.getId(), "test2");

        assertFalse(iterator.hasNext());
    }
}