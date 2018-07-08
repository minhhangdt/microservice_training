package com.brownfield.pss.client;

public class Luggage {

	private int id;
	
	private long checkinId; 
	
	private double weight;
	
	private double price;
	
	

	public Luggage() {
		super();
	}

	public Luggage(long checkinId, double weight, double price) {
		super();
		this.checkinId = checkinId;
		this.weight = weight;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getCheckinId() {
		return checkinId;
	}

	public void setCheckinId(long checkinId) {
		this.checkinId = checkinId;
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
	
	
}
