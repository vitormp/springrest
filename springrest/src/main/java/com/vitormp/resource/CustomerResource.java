package com.vitormp.resource;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.vitormp.model.Customer;

@Controller
public class CustomerResource {

	@RequestMapping(value="customer/name", method= RequestMethod.GET)
	@ResponseBody
	public String name(){
		Customer customer = new Customer(1l, "Ludmilla", 25, new Date());
		return customer.getName();
	}
}
