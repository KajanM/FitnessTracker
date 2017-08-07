package com.k4j4n.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by K4J4N on 8/7/2017.
 */

@Controller
public class HelloController {

    @RequestMapping(value = "/greeting")
    public String sayHello(Model model) {

        model.addAttribute("greeting", "HelloWorld");
        return "hello";
    }
}
