package com.example.jenkins;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping(method = RequestMethod.GET, value="/test")
    public String test() {
        return "v1-2024.09.25";
    }
}
