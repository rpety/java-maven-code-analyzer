package com.example.demo;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
    private static final Logger LOG = LoggerFactory.getLogger(DemoApplication.class);

    public static void main(final String[] args) {
        LOG.debug("asdasdsad");
        SpringApplication.run(DemoApplication.class, args);
    }

    @SuppressFBWarnings({"NP_BOOLEAN_RETURN_NULL"})
    public static Boolean myCoolMethod() {
        return null;
    }
}
