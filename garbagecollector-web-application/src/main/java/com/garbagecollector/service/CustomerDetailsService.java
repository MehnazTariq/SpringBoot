package com.garbagecollector.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.garbagecollector.domain.crud.CustomerDetailsRepository;
import com.garbagecollector.domain.entity.CustomerDetails;



@Service
public class CustomerDetailsService {

	@Autowired
	private CustomerDetailsRepository customerDetailsRepository;

	public List<CustomerDetails> getAllCustomerDetails() {

		List<CustomerDetails> customerDetails = new ArrayList<>();
		customerDetailsRepository.findAll().forEach(customerDetails::add);
		return customerDetails;

	}

	public CustomerDetails getCustomerDetails(int id) {
		
		return customerDetailsRepository.findOne(id);
	}

	public CustomerDetails addCustomerDetails(CustomerDetails customerDetails) {

		return customerDetailsRepository.save(customerDetails);
	}

}
