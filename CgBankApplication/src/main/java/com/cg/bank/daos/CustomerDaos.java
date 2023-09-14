package com.cg.bank.daos;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.cg.bank.Customer;

public interface CustomerDaos {
	public Customer save(Customer customer);
	public Customer update(Customer customer);
	public boolean delete(int customerId);
	public List<Customer> getAllCustomers();
	public Optional<Customer> findone();
	void insertBulkdetailss(ArrayList<Customer> customer);
	
}
