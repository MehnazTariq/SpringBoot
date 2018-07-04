package com.garbagecollector.domain.entity;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;



@Entity(name = "orderdetails")
public class OrderDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int orderid;

	private int custid;

	private int gclocid;
	private double distance;
	private String orderstatus;

	// bi-directional one-to-one association to Billing
	@OneToOne(mappedBy = "orderDetails")
	private Billing billing;

	//bi-directional many-to-one association to Customerdetail
	@ManyToOne
	@JoinColumn(name = "custid", insertable = false, updatable = false)
	private CustomerDetails customerDetails;

	//bi-directional many-to-one association to Garbagecollectioncentre
	@ManyToOne
	@JoinColumn(name = "gclocid", insertable = false, updatable = false)
	private GarbageCollectionCentre garbageCollectionCentre;

	public OrderDetails() {
		super();
	}

	public OrderDetails(int orderid, int custid, int gclocid, double distance, String orderstatus, Billing billing,
			CustomerDetails customerDetails, GarbageCollectionCentre garbageCollectionCentre) {
		super();
		this.orderid = orderid;
		this.custid = custid;
		this.gclocid = gclocid;
		this.distance = distance;
		this.orderstatus = orderstatus;
		this.billing = billing;
		this.customerDetails = customerDetails;
		this.garbageCollectionCentre = garbageCollectionCentre;
	}

	public int getOrderid() {
		return orderid;
	}

	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}

	public int getCustid() {
		return custid;
	}

	public void setCustid(int custid) {
		this.custid = custid;
	}

	public int getGclocid() {
		return gclocid;
	}

	public void setGclocid(int gclocid) {
		this.gclocid = gclocid;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public String getOrderstatus() {
		return orderstatus;
	}

	public void setOrderstatus(String orderstatus) {
		this.orderstatus = orderstatus;
	}

	public CustomerDetails getCustomerDetails() {
		return customerDetails;
	}

	public void setCustomerDetails(CustomerDetails customerDetails) {
		this.customerDetails = customerDetails;
	}

	public GarbageCollectionCentre getGarbageCollectionCentre() {
		return garbageCollectionCentre;
	}

	public void setGarbageCollectionCentre(GarbageCollectionCentre garbageCollectionCentre) {
		this.garbageCollectionCentre = garbageCollectionCentre;
	}

	public Billing getBilling() {
		return billing;
	}

	public void setBilling(Billing billing) {
		this.billing = billing;
	}

}
