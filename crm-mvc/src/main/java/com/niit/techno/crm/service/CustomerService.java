package com.niit.techno.crm.service;

import java.util.List;

import com.niit.techno.crm.model.Customer;
import com.niit.techno.crm.model.Elite;

public interface CustomerService {

void saveCustomer(Customer theCustomer);
public List<Customer> getCustomers();
public Customer getCustomer(int theId);


}
