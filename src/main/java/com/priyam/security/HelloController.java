package com.priyam.security;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("Hello")            //spring security automatically adds login and also logout feature
    public String greet(HttpServletRequest request){              //username: user :: password: generated during application run (for dev purpose only)
        return "Hello World" + request.getSession().getId();
    }

    @GetMapping("about")
    public String about(HttpServletRequest request){            //manage sessionID
        return "Priyam " + request.getSession().getId();
    }
}
