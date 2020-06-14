package com.example.onlineshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.onlineshop.model.customer;
import com.example.onlineshop.service.customerService;

@RequestMapping("/customer") // is common to all the mapping methods
@RestController //(@Controller+@ResponseBody)
public class onlineshopController {
	
	@Autowired
	private customerService customerService;

	public onlineshopController() {
		System.out.println("onlineshopController created...");
	}
	@GetMapping
	public List<customer> getAllCustomer() {
		System.out.println("In get allCustomer");
		return customerService.findAllCustomer();
	}
	@GetMapping("/{employeeId}")
	public customer getCustomer(@PathVariable("customerId") int customerId) {
		System.out.println("In get Customer " + customerId);
		return customerService.findCustomer(customerId);
	}

	@DeleteMapping("/{customerId}")
	public List<customer> deleteCustomer(@PathVariable("customerId") int customerId) {
		System.out.println("In delete Customer " + customerId);
		customerService.deleteCustomer(customerId);
		return customerService.findAllCustomer();
	}
	
	@PutMapping("/{customerId}")
		public List<customer> updateCustomer(@PathVariable("customerId") int customerId,@RequestBody customer Customer) {
		System.out.println("In update Customer " + Customer);
		customerService.updateCustomer(Customer);
		return customerService.findAllCustomer();
	}
	/*
	 * http://localhost:1212/ems-spring-v1/employees
	{
		"email":"riya@syntelinc.com",
		"fname":"priyanka",
		"iname":"Mesh",
		"mobile":"4574574",
		"address":"Aj98798w",
		"mobile":"876876"
		}*/
	@PostMapping
	public List<customer> addCustomer(@RequestBody customer Customer) {
		System.out.println("In add Customer " + Customer);
		customerService.addCustomer(Customer);
		return customerService.findAllCustomer();
	}	
	
}
