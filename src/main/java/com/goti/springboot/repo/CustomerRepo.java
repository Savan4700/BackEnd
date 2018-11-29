package com.goti.springboot.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.goti.springboot.model.Customer;

public interface CustomerRepo  extends CrudRepository<Customer, Long>{

	@Override
	List<Customer> findAll();
	
}
