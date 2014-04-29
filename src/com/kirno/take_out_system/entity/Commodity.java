package com.kirno.take_out_system.entity;

/**
 * 商品类
 * 
 * @author qq303_000
 * 
 */
public class Commodity {

	/**
	 * 图片ID
	 */
	private int imageId;
	/**
	 * 商品名字
	 */
	private String name;
	/**
	 * 商品价格
	 */
	private int price;
	/**
	 * 评价等级
	 */
	private int level;
	/**
	 * 数量
	 */
	private int num;
	private String shop;
	private String Introduce;
	private String[] talk;

	/**
	 * 详细的构造器
	 * 
	 * @param imageId
	 * @param name
	 * @param price
	 * @param level
	 * @param num
	 * @param shop
	 * @param introduce
	 * @param talk
	 */
	public Commodity(int imageId, String name, int price, int level, int num,
			String shop, String introduce, String[] talk) {
		super();
		this.imageId = imageId;
		this.name = name;
		this.price = price;
		this.level = level;
		this.num = num;
		this.shop = shop;
		Introduce = introduce;
		this.talk = talk;
	}

	/**
	 * 一个商品的简单构造器
	 * 
	 * @param imageId 图片
	 * @param name 	名字
	 * @param price 价格
	 * @param level 评价
	 */
	public Commodity(int imageId, String name, int price, int level) {
		super();
		this.imageId = imageId;
		this.name = name;
		this.price = price;
		this.level = level;
	}

	public int getImageId() {
		return imageId;
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

	public int getNum() {
		return num;
	}

	public int getSum() {
		return num * price;
	}

	public String getShop() {
		return shop;
	}

	public String getIntroduce() {
		return Introduce;
	}

	public String[] getTalk() {
		return talk;
	}

}
