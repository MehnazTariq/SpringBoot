package com.garbagecollector.domain.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the billing database table.
 * 
 */
@Entity
public class Billing implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private BillingPK id;

	private float cost;

	private String garbagecondition;

	private float surchagre;

	private double totalamount;

	private float weight;

	//bi-directional one-to-one association to OrderDetails
	@OneToOne
	@JoinColumn(name="orderid",insertable=false, updatable=false)
	private OrderDetails orderDetails;

	public Billing() {
	}

	public BillingPK getId() {
		return this.id;
	}

	public void setId(BillingPK id) {
		this.id = id;
	}

	public float getCost() {
		return this.cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	public String getGarbagecondition() {
		return this.garbagecondition;
	}

	public void setGarbagecondition(String garbagecondition) {
		this.garbagecondition = garbagecondition;
	}

	public float getSurchagre() {
		return this.surchagre;
	}

	public void setSurchagre(float surchagre) {
		this.surchagre = surchagre;
	}

	public double getTotalamount() {
		return this.totalamount;
	}

	public void setTotalamount(double totalamount) {
		this.totalamount = totalamount;
	}

	public float getWeight() {
		return this.weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public OrderDetails getorderDetails() {
		return this.orderDetails;
	}

	public void setorderDetails(OrderDetails orderDetails) {
		this.orderDetails = orderDetails;
	}

}