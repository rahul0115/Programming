package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Customer;
@Repository("customerRepository")
public interface CustomerRepository extends JpaRepository<Customer, Long> {
	
        Customer findByName(String name);
       
}
