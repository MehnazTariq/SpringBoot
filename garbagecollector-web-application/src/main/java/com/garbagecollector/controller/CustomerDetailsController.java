package com.garbagecollector.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.garbagecollector.domain.entity.CustomerDetails;
import com.garbagecollector.service.CustomerDetailsService;

@Controller
public class CustomerDetailsController {

	@Autowired
	private CustomerDetailsService customerDetailsService;
	
	

	@RequestMapping(method = RequestMethod.GET, value = "/")
	public String index() {
		return "index";
	}

	@RequestMapping(method = RequestMethod.GET, value = "/addCustomerDetails")
	public String addCustomerDetails() {
		
		return "customerdetails";
	}

	@RequestMapping(method = RequestMethod.POST, value = "/saveCustomerDetails")
	public String saveCustomerDetails(@RequestParam("firstname") String firstname,
			@RequestParam("lastname") String lastname, Model model) {
		CustomerDetails customerDetails = new CustomerDetails();
		customerDetails.setFirstname(firstname);
		customerDetails.setLastname(lastname);
		customerDetails.setAddrlatitude((double) 31.5204);
		customerDetails.setAddrlongitude((double) 74.3587);

		customerDetails = customerDetailsService.addCustomerDetails(customerDetails);

		model.addAttribute("heading", "Customer Details Saved");
		model.addAttribute("First Name", customerDetails.getFirstname());
		model.addAttribute("Last Name", customerDetails.getLastname());

		return "customerdetails";
	}

	
	
}
