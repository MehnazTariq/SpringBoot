package com.garbagecollector.domain.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the billing database table.
 * 
 */
@Embeddable
public class BillingPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@GeneratedValue(strategy = GenerationType.AUTO)
	private int billid;

	@Column(insertable=false, updatable=false)
	private int orderid;

	public BillingPK() {
	}
	public int getBillid() {
		return this.billid;
	}
	public void setBillid(int billid) {
		this.billid = billid;
	}
	public int getOrderid() {
		return this.orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof BillingPK)) {
			return false;
		}
		BillingPK castOther = (BillingPK)other;
		return 
			(this.billid == castOther.billid)
			&& (this.orderid == castOther.orderid);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.billid;
		hash = hash * prime + this.orderid;
		
		return hash;
	}
}