package com.example.service;

import com.example.model.Customer;


public interface CustomerService {
	public Customer findCustomerByName(String name);
	public Customer saveCustomer(Customer customer);
	public int deleteCustomer(int cust_id);
	public int updateCustomer(int cust_id);
}
