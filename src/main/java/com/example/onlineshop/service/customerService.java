package com.example.onlineshop.service;

import java.util.List;

import com.example.onlineshop.model.customer;


public interface customerService {

	customer findCustomer(int customerId);

	boolean deleteCustomer(int employeeId);

	boolean updateCustomer(customer Customer);

	boolean addCustomer(customer Customer);

	List<customer> findAllCustomer();
}
