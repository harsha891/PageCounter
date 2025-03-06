package com.example.pageCounter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class PageCounterController {

    @Autowired
    private PageCounter pageCounter;

    @GetMapping("/currentcount")
    public int getCurrentCount() {
        return pageCounter.getPageCounter();
    }
}
