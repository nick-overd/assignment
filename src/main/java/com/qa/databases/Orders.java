package com.qa.databases;

public class Orders {
	
	private long orderid ;
	private long customerid;
	public Orders(long orderid, long customerid) {
		super();
		this.orderid = orderid;
		this.customerid = customerid;
	}
	public long getOrderid() {
		return orderid;
	}
	public void setOrderid(long orderid) {
		this.orderid = orderid;
	}
	public long getCustomerid() {
		return customerid;
	}
	public void setCustomerid(long customerid) {
		this.customerid = customerid;
	}
	

}
