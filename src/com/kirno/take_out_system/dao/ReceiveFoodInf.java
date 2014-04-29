package com.kirno.take_out_system.dao;

public class ReceiveFoodInf {

	private String name;
	private int price;
	private int level;
	private String[] talk;
	private String shopName;
	private String introduce;
	private int number;
	
	public ReceiveFoodInf(int number){
		this.number = number;
	}
	
	private void receiveInf(){
		
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public int getLevel() {
		return level;
	}

	public String[] getTalk() {
		return talk;
	}

	public String getShopName() {
		return shopName;
	}

	public String getIntroduce() {
		return introduce;
	}

}
