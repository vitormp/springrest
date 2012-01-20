package com.maplink.resource;

import java.util.Date;

import com.maplink.model.Customer;

public class CustomerResource {

	public String name(){
		Customer customer = new Customer(1l, "Ludmilla", 25, new Date());
		return customer.getName();
	}
}
