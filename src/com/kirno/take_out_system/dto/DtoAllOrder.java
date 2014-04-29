package com.kirno.take_out_system.dto;

import java.util.ArrayList;
import java.util.List;

import com.kirno.take_out_system.entity.Order;

/**
 * 存储所有订单
 * 
 * @author qq303_000
 * 
 */
public class DtoAllOrder {

	private static DtoAllOrder instance;
	private List<Order> data;

	private DtoAllOrder() {
		data = new ArrayList<>();
		test();
	}

	public static DtoAllOrder getInstance() {
		if (instance == null) {
			instance = new DtoAllOrder();
		}
		return instance;
	}

	public List<Order> getData() {
		return data;
	}

	public void test() {
		// TODO 测试用数据
		data.add(new Order(120345789, "2013-12-4", 15));
		data.add(new Order(156879654, "2014-5-8", 15));
		data.add(new Order(156879123, "2012-8-9", 15));
		data.add(new Order(111111111, "2011-4-6", 80));
	}

}
