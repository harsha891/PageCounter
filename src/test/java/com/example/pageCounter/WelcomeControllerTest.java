package com.example.pageCounter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class WelcomeControllerTest {

    @Mock
    private PageCounter pageCounter;

    @Mock
    private Model model;

    @InjectMocks
    private WelcomeController welcomeController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testWelcomePage() {
        when(pageCounter.getPageCounter()).thenReturn(0);

        String view = welcomeController.welcomePage(model);

        assertEquals("Welcome", view);
    }
}
