/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.camunda.java.spring;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.bcel.Const;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import helper.DateConvert;
import model.Insurance;
import service.Constant;

/**
 *
 * @author abdulsalam
 */

@Controller
public class WebController {    
    
    @GetMapping("/main")
    public String homePage(Model model) {
    	
    	List<String> allValues = new ArrayList<>();
    	Collections.addAll(allValues, Constant.getValue());
    	
    	model.addAttribute("insurance", new Insurance());
    	model.addAttribute("dates", DateConvert.getDate());
    	model.addAttribute("option", allValues);
        return "index";
    }
}
