package com.example.pageCounter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {

    @Autowired
    private PageCounter pageCounter;

    @GetMapping("/")
    public String welcomePage(Model model) {
        pageCounter.incrementCounter();
        model.addAttribute("visitorCount", pageCounter.getPageCounter());

        return "Welcome";
    }
}
