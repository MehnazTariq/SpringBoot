package com.garbagecollector.domain.entity;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity(name= "garbagecollectioncentre")


public class GarbageCollectionCentre {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int gclocid;
	private double gcaddrlongitude;
	private double gcaddrlatitude;
	private boolean collectoravailability;

	
	

	public GarbageCollectionCentre() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GarbageCollectionCentre(int gclocid, double gcaddrlongitude, double gcaddrlatitude,
			boolean collectoravailability) {
		super();
		this.gclocid = gclocid;
		this.gcaddrlongitude = gcaddrlongitude;
		this.gcaddrlatitude = gcaddrlatitude;
		this.collectoravailability = collectoravailability;
	}

	public int getGclocid() {
		return gclocid;
	}

	public void setGclocid(int gclocid) {
		this.gclocid = gclocid;
	}

	public double getGcaddrlongitude() {
		return gcaddrlongitude;
	}

	public void setGcaddrlongitude(double gcaddrlongitude) {
		this.gcaddrlongitude = gcaddrlongitude;
	}

	public double getGcaddrlatitude() {
		return gcaddrlatitude;
	}

	public void setGcaddrlatitude(double gcaddrlatitude) {
		this.gcaddrlatitude = gcaddrlatitude;
	}

	public boolean isCollectoravailability() {
		return collectoravailability;
	}

	public void setCollectoravailability(boolean collectoravailability) {
		this.collectoravailability = collectoravailability;
	}

}
