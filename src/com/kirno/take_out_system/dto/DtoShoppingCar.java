package com.kirno.take_out_system.dto;

import java.util.ArrayList;
import java.util.List;

import com.kirno.take_out_system.R.drawable;
import com.kirno.take_out_system.entity.Commodity;

/**
 * 存储购物车信息
 * 
 * @author qq303_000
 * 
 */
public class DtoShoppingCar {

	private static DtoShoppingCar instance;
	private List<Commodity> data;

	private DtoShoppingCar() {
		data = new ArrayList<>();
		// TODO 测试用
		test();
	}

	public static DtoShoppingCar getInstance() {
		if (instance == null) {
			instance = new DtoShoppingCar();
		}
		return instance;
	}

	/**
	 * 获取数据源
	 * 
	 * @return
	 */
	public List<Commodity> getData() {
		return data;
	}

	public void test() {
		// TODO 这是测试来的
		data.add(new Commodity(drawable.sc_home, "fuck", 12, 1));
		data.add(new Commodity(drawable.sc_home, "tom", 10, 2));
		data.add(new Commodity(drawable.sc_home, "fuck", 12, 1));

	}

}
