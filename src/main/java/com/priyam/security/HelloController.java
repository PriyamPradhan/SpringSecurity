package com.priyam.security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("Hello")            //spring security automatically adds login and also logout feature
    public String greet(){              //username: user :: password: generated during application run (for dev purpose only)
        return "Hello World";
    }
}
