package com.kirno.take_out_system.entity;

/**
 * ¶©µ¥Àà
 * 
 * @author qq303_000
 * 
 */
public class Order {

	private int orderNumber;
	private String orderDate;
	private int orderSum;

	public Order(int orderNumber, String orderDate, int orderSum) {
		super();
		this.orderNumber = orderNumber;
		this.orderDate = orderDate;
		this.orderSum = orderSum;
	}

	public int getOrderNumber() {
		return orderNumber;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public int getOrderSum() {
		return orderSum;
	}

}
