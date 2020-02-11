package com.qa.databases;

public class Item {
	
	private	float cost;
	private String name;
	private long id;
	
	
	
	public Item(long id, float cost, String name ) {
		this.cost = cost;
		this.name = name;
		this.id = id;
	}
	
	
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	
	
	
	
	
	

}
