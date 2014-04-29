package com.kirno.take_out_system.entity;

/**
 * ��Ʒ��
 * 
 * @author qq303_000
 * 
 */
public class Commodity {

	/**
	 * ͼƬID
	 */
	private int imageId;
	/**
	 * ��Ʒ����
	 */
	private String name;
	/**
	 * ��Ʒ�۸�
	 */
	private int price;
	/**
	 * ���۵ȼ�
	 */
	private int level;
	/**
	 * ����
	 */
	private int num;
	private String shop;
	private String Introduce;
	private String[] talk;

	/**
	 * ��ϸ�Ĺ�����
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
	 * һ����Ʒ�ļ򵥹�����
	 * 
	 * @param imageId ͼƬ
	 * @param name 	����
	 * @param price �۸�
	 * @param level ����
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
