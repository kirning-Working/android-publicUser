package com.kirno.take_out_system.dto;

import java.util.ArrayList;
import java.util.List;

import com.kirno.take_out_system.R.drawable;
import com.kirno.take_out_system.entity.Commodity;

/**
 * �洢���ﳵ��Ϣ
 * 
 * @author qq303_000
 * 
 */
public class DtoShoppingCar {

	private static DtoShoppingCar instance;
	private List<Commodity> data;

	private DtoShoppingCar() {
		data = new ArrayList<>();
		// TODO ������
		test();
	}

	public static DtoShoppingCar getInstance() {
		if (instance == null) {
			instance = new DtoShoppingCar();
		}
		return instance;
	}

	/**
	 * ��ȡ����Դ
	 * 
	 * @return
	 */
	public List<Commodity> getData() {
		return data;
	}

	public void test() {
		// TODO ���ǲ�������
		data.add(new Commodity(drawable.sc_home, "fuck", 12, 1));
		data.add(new Commodity(drawable.sc_home, "tom", 10, 2));
		data.add(new Commodity(drawable.sc_home, "fuck", 12, 1));

	}

}
