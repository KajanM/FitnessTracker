package com.k4j4n.controller;

import com.k4j4n.model.Exercise;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by k4j4n on 8/8/17.
 */

@Controller
public class MinutesController {

    @RequestMapping(value = "/addMinutes")
    public String addMinutes(@ModelAttribute ("exercise")Exercise exercise) {

        System.out.println("exercise : " + exercise.getMinutes());

//        return "forward:addMoreMinutes.html";
        return "addMinutes";

    }@RequestMapping(value = "/addMoreMinutes")
    public String addMoreMinutes(@ModelAttribute ("exercise")Exercise exercise) {

        System.out.println("exercising : " + exercise.getMinutes());

        return "addMinutes";
    }
}
