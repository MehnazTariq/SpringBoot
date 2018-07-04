package com.garbagecollector.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.garbagecollector.domain.entity.OrderDetails;
import com.garbagecollector.service.OrderDetailsService;

@Controller
public class OrderDetailsController {

	@Autowired
	private OrderDetailsService orderDetailService;

	@RequestMapping(method = RequestMethod.POST, value = "/saveOrderDetails")
	public String savetOrderDetails(@ModelAttribute OrderDetails orderDetails, Model model) {
		
		orderDetails = orderDetailService.saveOrderDetails(orderDetails, 1);

		model.addAttribute("orderDetails", orderDetails);
		
		return "orderdetails";
	}

	@RequestMapping(method = RequestMethod.GET, value = "/newOrder")
	// public String newOrder(@RequestParam("custid") int custid, Model model) {
	public String newOrder(Model model) {
		int custid = 1;
		OrderDetails newOrderDetails = orderDetailService.newOrder(custid);
		model.addAttribute("newOrderDetails", newOrderDetails);

		return "neworder";
	}

}
