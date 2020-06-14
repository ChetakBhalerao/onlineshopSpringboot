package com.example.onlineshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.onlineshop.model.customer;
import com.example.onlineshop.repository.repositoryJPA;

@Service
public class customerServiceImplement implements customerService  {

	@Autowired
	private repositoryJPA repository;

	public customerServiceImplement() {
		System.out.println("customerServiceImplement created.,.....");
	}

	@Override
	public customer findCustomer(int customerId) {
		// TODO Auto-generated method stub
		return repository.findById(customerId).get();
	}

	@Override
	public boolean deleteCustomer(int employeeId) {

		customer e = repository.findById(employeeId).get();

		if (e != null) {
			repository.delete(e);
			return true;
		}

		return false;
	}

	@Override
	public boolean updateCustomer(customer Customer) {

		customer e = repository.findById(Customer.getCustomerId()).get();

		if (e != null) {
			repository.save(Customer);
			return true;
		}

		return false;
	}

	@Override
	public boolean addCustomer(customer Customer) {
		// TODO Auto-generated method stub
		return repository.save(Customer) == Customer;
	}

	@Override
	public List<customer> findAllCustomer() {

		return repository.findAll();
	}

}
