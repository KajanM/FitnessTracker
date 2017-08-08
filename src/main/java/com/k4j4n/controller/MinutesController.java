package com.k4j4n.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by k4j4n on 8/8/17.
 */

@Controller
public class MinutesController {

    @RequestMapping(value = "/addMinutes")
    public String addMinutes() {

        return "addMinutes";
    }
}
