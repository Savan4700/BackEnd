package com.goti.springboot.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.goti.springboot.model.Customer;
import com.goti.springboot.service.CustomerService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class CustomerController {
	
	@Autowired
	CustomerService service;

	@GetMapping("/customers")
	public List<Customer> getCustomers() {
		return service.getCustomers();
	}
	
	@GetMapping("/customer/{id}")
	public Customer getCustomer(@PathVariable Long id) {
		return service.getCustomer(id);
	}
	
	@DeleteMapping("/customer/{id}")
	public boolean deleteCustomer(@PathVariable Long id) {
		service.deteleCustomer(id);
		return true;
	}
	
	@PostMapping("/customer")
	public Customer createCustomer(@RequestBody Customer customer) {
		return service.saveCustomer(customer);
	}
	
	@PutMapping("/customer")
	public Customer updateCustomer(@RequestBody Customer customer) {
		return service.saveCustomer(customer);
	}
		
}
