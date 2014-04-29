package com.kirno.take_out_system.dao;

interface GetFood extends GetInf{

	/**
	 * 获取价格
	 * @return
	 */
	public int getPrice();

	/**
	 * 获取评价等级
	 * @return
	 */
	public int getLevel();

	/**
	 * 获取商店名
	 * @return
	 */
	public String getShopname();



}
