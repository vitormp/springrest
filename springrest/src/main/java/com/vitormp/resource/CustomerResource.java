package com.vitormp.resource;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

import com.vitormp.model.Customer;

@Controller
public class CustomerResource {

	@RequestMapping(value="customer/name", method= RequestMethod.GET)
	@ResponseStatus(value=HttpStatus.OK)
	public ModelAndView name(){
		Customer customer = new Customer(1l, "Ludmilla", 25, new Date());
		return new ModelAndView("viewResolver", "customer", customer);
	}
}
