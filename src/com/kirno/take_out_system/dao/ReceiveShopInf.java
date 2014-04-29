package com.kirno.take_out_system.dao;

import java.util.List;

import org.apache.http.message.BasicNameValuePair;
import org.json.JSONException;
import org.json.JSONObject;

public class ReceiveShopInf extends InternetIO implements GetShop {

	private final static String url = "http://192.168.1.208:8080/take_out_system/foodpost";
	private List<BasicNameValuePair> mPars;
	private JSONObject mJson;

	public ReceiveShopInf() {
		super(url);
	}

	public ReceiveShopInf(int munber) {
		super(url);
		mPars.add(new BasicNameValuePair("id", String.valueOf(munber)));
		String re = getResult(mPars);
		try {
			mJson = new JSONObject(re);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public int getImageId() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String[] getTalk() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getIntroduce() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] getCommodityName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getNameInf() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
}
