package com.vitormp.resource;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.vitormp.model.Customer;

@RequestMapping("resource/customer/")
public class CustomerResource {

	@RequestMapping(value="/name", method= RequestMethod.GET)
	public String name(){
		Customer customer = new Customer(1l, "Ludmilla", 25, new Date());
		return customer.getName();
	}
}
