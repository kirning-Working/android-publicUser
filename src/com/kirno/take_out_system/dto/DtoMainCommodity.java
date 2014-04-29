package com.kirno.take_out_system.dto;

import java.util.ArrayList;
import java.util.List;

import com.kirno.take_out_system.R.drawable;
import com.kirno.take_out_system.entity.Commodity;

/**
 * 主界面的数据
 * 
 * @author qq303_000
 * 
 */
public class DtoMainCommodity {
	private static DtoMainCommodity instance;
	private List<Commodity> data;

	private DtoMainCommodity() {
		data = new ArrayList<>();
		test();
	}

	public static DtoMainCommodity getInstance() {
		if (instance == null) {
			instance = new DtoMainCommodity();
		}
		return instance;
	}

	public List<Commodity> getData() {
		return data;
	}
	
	public void test(){
		//TODO 这是测试来的
		data.add(new Commodity(drawable.sc_shopping_car, "tom", 15, 1));
		data.add(new Commodity(drawable.sc_shopping_car, "fuck", 16, 1));
		data.add(new Commodity(drawable.sc_more, "fuck", 10, 2));		
	}

}
