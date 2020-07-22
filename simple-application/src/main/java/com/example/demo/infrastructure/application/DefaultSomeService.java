package com.example.demo.infrastructure.application;

import com.example.demo.api.application.SomeService;

public class DefaultSomeService implements SomeService {
    public DefaultSomeService() {
        // default constructor
    }

    @Override
    public int doMyThing(final int operand1, final int operand2) {
        return operand1 + operand2;
    }
}
