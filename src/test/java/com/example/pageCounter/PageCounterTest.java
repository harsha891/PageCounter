package com.example.pageCounter;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PageCounterTest {

    private PageCounter pageCounter = new PageCounter();

    @Test
    void testInitialPageCounter() {
        assertEquals(0, pageCounter.getPageCounter());
    }

    @Test
    void testIncrementIncreaseCount() {
        pageCounter.incrementCounter();
        assertEquals(1, pageCounter.getPageCounter());
    }

}
