package com.kirno.take_out_system.dao;

interface GetFood extends GetInf{

	/**
	 * ��ȡ�۸�
	 * @return
	 */
	public int getPrice();

	/**
	 * ��ȡ���۵ȼ�
	 * @return
	 */
	public int getLevel();

	/**
	 * ��ȡ�̵���
	 * @return
	 */
	public String getShopname();



}
