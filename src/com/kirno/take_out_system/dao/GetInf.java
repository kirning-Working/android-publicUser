package com.kirno.take_out_system.dao;

public interface GetInf {
	
	/**
	 * 获取商品名字
	 * @return
	 */
	public String getNameInf();

	/**
	 * 获取商品图片
	 * @return
	 */
	public int getImageId();

	/**
	 * 获取评论
	 * @return
	 */
	public String[] getTalk();

	/**
	 * 获取介绍
	 * @return
	 */
	public String getIntroduce();


}
