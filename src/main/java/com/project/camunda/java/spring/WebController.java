/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.camunda.java.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author abdulsalam
 */

@Controller
public class WebController {
    
    private final String message = "Abdul Salam";
    
    @GetMapping("/hello")
    public String homePage(Model model) {
        model.addAttribute("message", message);
        return "index";
    }
}
