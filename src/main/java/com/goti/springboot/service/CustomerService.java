package com.goti.springboot.service;

import java.util.List;

import com.goti.springboot.model.Customer;

public interface CustomerService {

		public List<Customer> getCustomers();
		
		public Customer getCustomer(Long id);
		
		public Customer saveCustomer(Customer customer);
		
		public Customer getCustomerById(Long id);
		
		public void deteleCustomer(Long id);
}
