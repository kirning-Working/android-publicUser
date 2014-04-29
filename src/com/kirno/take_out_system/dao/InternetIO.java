package com.kirno.take_out_system.dao;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import android.net.http.AndroidHttpClient;

abstract class InternetIO extends Thread {

	private AndroidHttpClient mClient;
	private HttpPost mPost;
	private String result;

	/**
	 * Internet数据获取类
	 * @param url
	 * @param pars
	 * @throws UnsupportedEncodingException
	 */
	public InternetIO(String url) {
		mClient = AndroidHttpClient.newInstance("");
		mPost = new HttpPost(url);

	}

	@Override
	public void run() {
		try {
			HttpResponse res = mClient.execute(mPost);
			result = EntityUtils.toString(res.getEntity());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
	
	/**
	 * 获取原始数据
	 * @return
	 */
	protected String getResult(List<BasicNameValuePair> pars) {
		try {
			mPost.setEntity(new UrlEncodedFormEntity(pars, "utf-8"));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		this.start();
		return result;
	}

	
	

}
