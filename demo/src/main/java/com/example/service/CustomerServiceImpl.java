package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Customer;
import com.example.repository.CustomerRepository;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {
	@Autowired
    private CustomerRepository customerRepository;
	@Override
	public Customer findCustomerByName(String name) {
	
		return customerRepository.findByName(name);
	}
	@Override
	public Customer saveCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int deleteCustomer(int cust_id) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int updateCustomer(int cust_id) {
		// TODO Auto-generated method stub
		return 0;
	}




}
