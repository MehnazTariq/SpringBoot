package com.garbagecollector.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.garbagecollector.domain.crud.OrderDetailsRepository;
import com.garbagecollector.domain.entity.CustomerDetails;
import com.garbagecollector.domain.entity.GarbageCollectionCentre;
import com.garbagecollector.domain.entity.OrderDetails;
import com.garbagecollector.util.CalculateDistance;

@Service
public class OrderDetailsService {

	@Autowired
	private OrderDetailsRepository orderDetailsRepository;

	@Autowired
	private CustomerDetailsService customerDetailsService;

	@Autowired
	private GarbageCollectionCentreService garbageCollectionCentreService;

	CustomerDetailsService cds = null;

	public OrderDetails saveOrderDetails(OrderDetails orderDetails, int custid) {

		CustomerDetails customerDetails = customerDetailsService.getCustomerDetails(custid);
		
		TreeMap<Double, Integer> gcDetails = CalculateDistance(customerDetails);
		GarbageCollectionCentre garbageCollectionCentre= garbageCollectionCentreService.getGarbageCollectionCentre(gcDetails.firstEntry().getValue());
		
		orderDetails.setCustomerDetails(customerDetails);
		orderDetails.setGarbageCollectionCentre(garbageCollectionCentre);
		//orderDetails.setDistance(gcDetails.firstEntry().getKey());
		//orderDetails.setGclocid(gcDetails.firstEntry().getValue());

		if (orderDetails.getOrderstatus().equalsIgnoreCase("new"))
			orderDetails.setOrderstatus("Open");

		
		return orderDetailsRepository.save(orderDetails);
	}

	public OrderDetails newOrder(int custid) {

		CustomerDetails customerDetails = customerDetailsService.getCustomerDetails(custid);
		TreeMap<Double, Integer> gcDetails = CalculateDistance(customerDetails);

		OrderDetails orderDetails = new OrderDetails();
		orderDetails.setCustomerDetails(customerDetails);
		orderDetails.setDistance(gcDetails.firstEntry().getKey());
		orderDetails.setGclocid(gcDetails.firstEntry().getValue());
		orderDetails.setOrderstatus("New");

		return orderDetails;

	}

	public TreeMap<Double, Integer> CalculateDistance(CustomerDetails customerDetails) {

		TreeMap<Double, Integer> nearLocation = new TreeMap<Double, Integer>();

		if (customerDetails != null) {

			double destinationLat = customerDetails.getAddrlatitude();
			double destinationLong = customerDetails.getAddrlongitude();
			List<GarbageCollectionCentre> gcLocDetails = new ArrayList<>();

			gcLocDetails = garbageCollectionCentreService.getAllGarbageCollectionCentre();
			if (gcLocDetails.size() > 0) {
				for (GarbageCollectionCentre locDetails : gcLocDetails) {

					double locDistance = CalculateDistance.distance(destinationLat, locDetails.getGcaddrlatitude(),
							destinationLong, locDetails.getGcaddrlongitude(), 0, 0);
					nearLocation.put(locDistance, locDetails.getGclocid());
				}

				for (Map.Entry m : nearLocation.entrySet()) {
					System.out.println(m.getKey() + " " + m.getValue());
				}

			}

		}

		return nearLocation;
	}

}
