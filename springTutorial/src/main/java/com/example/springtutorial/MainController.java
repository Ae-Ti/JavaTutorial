package com.example.springtutorial;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @GetMapping("/")
    @ResponseBody
    public String index() {
        return ("Hello My Application!!!");
    }

    @GetMapping("/Hello")
    @ResponseBody
    public String index2() {
        return "Hello Hello";
    }

}
