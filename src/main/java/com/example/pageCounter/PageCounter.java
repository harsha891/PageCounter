package com.example.pageCounter;

import org.springframework.stereotype.Component;

@Component
public class PageCounter {
    private int pageCounter = 0;

    public void incrementCounter() {
        pageCounter++;
    }

    public int getPageCounter() {
        return pageCounter;
    }
}
