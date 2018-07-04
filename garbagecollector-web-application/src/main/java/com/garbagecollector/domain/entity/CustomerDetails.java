package com.garbagecollector.domain.entity;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity(name = "customerdetails")
public class CustomerDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int custid;
	private String firstname;
	private String lastname;
	private double addrlongitude;
	private double addrlatitude;

	public CustomerDetails() {

	}

	public CustomerDetails(int custid, String firstname, String lastname, double addrlongitude, double addrlatitude) {

		this.custid = custid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.addrlongitude = addrlongitude;
		this.addrlatitude = addrlatitude;

	}

	public int getCustid() {
		return custid;
	}

	public void setCustid(int custid) {
		this.custid = custid;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public double getAddrlongitude() {
		return addrlongitude;
	}

	public void setAddrlongitude(double addrlongitude) {
		this.addrlongitude = addrlongitude;
	}

	public double getAddrlatitude() {
		return addrlatitude;
	}

	public void setAddrlatitude(double addrlatitude) {
		this.addrlatitude = addrlatitude;
	}

}
