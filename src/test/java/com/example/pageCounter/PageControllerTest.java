package com.example.pageCounter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class PageControllerTest {

    @Mock
    private PageCounter pageCounter;

    @InjectMocks
    private PageCounterController pageCounterController;

    @BeforeEach
    void initialization() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGetCurrentPageCount() throws Exception {
        when(pageCounter.getPageCounter()).thenReturn(0);

        assertEquals(0, pageCounterController.getCurrentCount());

    }
}
