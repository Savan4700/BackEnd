package com.goti.springboot.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.goti.springboot.model.Customer;
import com.goti.springboot.repo.CustomerRepo;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerRepo repo;

	@Override
	@Transactional
	public List<Customer> getCustomers() {
		return repo.findAll();
	}

	@Override
	@Transactional
	public Customer saveCustomer(Customer customer) {
		
		return repo.save(customer);
	}
	
	@Override
	public Customer getCustomerById(Long id) {
		Optional<Customer> findById = repo.findById(id);
		
		if (findById.isPresent()) {
			return findById.get();
		}
		return null;
	}

	@Override
	public void deteleCustomer(Long id) {
		repo.deleteById(id);
	}

	@Override
	public Customer getCustomer(Long id) {
		 Optional<Customer> optional = repo.findById(id);
		 if (optional.isPresent()) {
			 return optional.get();
		 } 
		 return null;
	}

}
