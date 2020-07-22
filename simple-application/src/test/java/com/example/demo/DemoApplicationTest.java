package com.example.demo;

import com.example.demo.infrastructure.application.DefaultSomeService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
class DemoApplicationTest {
    private DefaultSomeService defaultSomeService;

    @BeforeEach
    void setUp() {
        defaultSomeService = new DefaultSomeService();
    }

    @Test
    void testMain_WhenNoArg_ThenSucceed() {
        final int result = defaultSomeService.doMyThing(1, 1);
        assertEquals(2, result);
    }

}
