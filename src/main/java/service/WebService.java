package service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import helper.DateConvert;
import model.Insurance;

@Controller
// fungsi proses dari web service
public class WebService {
	@RequestMapping(value = "/insurance", method = RequestMethod.POST)
    public @ResponseBody Insurance add(HttpServletRequest request, HttpServletResponse response) throws Exception {
    	Insurance insurance = new Insurance();
		String option_1 = request.getParameter("option_1");
		String option_2 = request.getParameter("option_2");
		
		insurance.setOption_1(option_1);
		insurance.setOption_2(option_2);
		
		// perhitungan nilai
		double total = Double.parseDouble(insurance.getOption_1()) + 
				Double.parseDouble(insurance.getOption_2());
		
		insurance.setResult(total + "");
		return insurance;
	}
	
}
