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
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author abdulsalam
 */

@Controller
public class WebController {
    
    private final String message = "Abdul";
    
    @GetMapping("/main")
    public String homePage(Model model) {
		model.addAttribute("dates", getDate());
        
        return "index";
    }
    
    public List<String> getDate() {
    	SimpleDateFormat first_date = new SimpleDateFormat("dd.MM");
		SimpleDateFormat last_date = new SimpleDateFormat("dd.MM.yyyy");
			
		List<String> allDates = new ArrayList<>();
		Calendar cal = Calendar.getInstance();
		cal.get(Calendar.MONTH);
		cal.set(Calendar.DATE, 1);
				
		for (int i = 1; i <= 12; i++) {
		    String first_month = first_date.format(cal.getTime());
		    cal.set(Calendar.DATE, cal.getActualMaximum(Calendar.DATE));
		    String last_month = last_date.format(cal.getTime());
		    		    
		    allDates.add(first_month+"-"+last_month);
		    cal.add(Calendar.MONTH, +1);
		    cal.set(Calendar.DATE, 1);
		}
		
		return allDates;
    }
    
}
