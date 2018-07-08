package com.brownfield.pss.luggage.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Luggage")
public class Luggage {
	@Id
	@GeneratedValue
	private long id;
	
	private long checkinId; 
	
	private double weight;
	
	private double price;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}


	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	
	public Luggage() {
		super();
	}

	public Luggage(long id, long checkinId, double weight, double price) {
		super();
		this.id = id;
		this.checkinId = checkinId;
		this.weight = weight;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Luggage [id=" + id + ", checkinID=" + checkinId + ", weight=" + weight + ", price=" + price + "]";
	}

	public long getCheckinId() {
		return checkinId;
	}

	public void setCheckinId(long checkinId) {
		this.checkinId = checkinId;
	}
	
	
}
