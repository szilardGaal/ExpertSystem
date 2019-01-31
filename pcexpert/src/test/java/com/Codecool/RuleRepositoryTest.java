package com.Codecool;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RuleRepositoryTest {
    @Test
    void testAdd() {
        RuleRepository rp = new RuleRepository();
        int previousSize = rp.getRulesList().size();

        rp.addRule(new Rule("test", "testquestion"));

        assertEquals(previousSize + 1, rp.getRulesList().size());
    }

    @Test
    void testEmptyIterator() {
        RuleRepository rp = new RuleRepository();
        RuleRepository.QuestionIterator iterator = rp.getIterator();

        assertFalse(iterator.hasNext());
    }

    @Test
    void testNonEmptyIterator() {
        // given
        RuleRepository rp = new RuleRepository();

        rp.addRule(new Rule("test1", "testquestion1"));
        rp.addRule(new Rule("test2", "testquestion2"));

        RuleRepository.QuestionIterator iterator = rp.getIterator();

        // when/then
        assertTrue(iterator.hasNext());
        Question rule1 = iterator.next();
        assertEquals(rule1.getId(), "testquestion1");

        assertTrue(iterator.hasNext());
        Question rule2 = iterator.next();
        assertEquals(rule2.getId(), "testquestion2");

        assertFalse(iterator.hasNext());
    }
}
