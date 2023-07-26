package com.developerdevz.mvc;
/*
 * The Controller is the entry point for any application
 * It handles many types of requests such as a GET request
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MvcController{

    @GetMapping("/grades")
    public String getGrades(){
        Grade grade = new Grade("Harry", "Potions", "C-");
        return "grades";
    }
} 