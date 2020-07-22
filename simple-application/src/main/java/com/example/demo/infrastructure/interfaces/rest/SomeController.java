package com.example.demo.infrastructure.interfaces.rest;

import com.example.demo.api.application.SomeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class SomeController {
    private static final Logger LOG = LoggerFactory.getLogger(SomeController.class);

    private final SomeService someService;

    @Autowired
    public SomeController(final SomeService someService) {
        this.someService = someService;
    }

    @GetMapping(path = "/{name}")
    public ResponseEntity get(@PathVariable("name") final String name) {
        LOG.info("GET");
        LOG.info("get called with {} - calc result {}", name, someService.doMyThing(1, 1));
        return ResponseEntity.ok(name);
    }
}
