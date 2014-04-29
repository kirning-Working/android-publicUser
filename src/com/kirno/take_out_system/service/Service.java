package com.kirno.take_out_system.service;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;

public class Service {

	public Service() {
	}

	/**
	 * ����Fragment
	 * 
	 * @param tran
	 *            ��Ҫ����Fragment��Activity�л�ȡ��FragmentTransaction����
	 * @param fragmentRecours
	 *            ��Ҫ��������Fragment��ID
	 * @param fragment
	 *            ��Fragment����
	 */
	public void changeFragment(FragmentManager fm, int fragmentRecours, Fragment fragment) {
		
			fm.beginTransaction()
				//�����滻��Fragment
				.replace(fragmentRecours, fragment)
				//ת��Fragment����
				.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
				//�������ջ
				.addToBackStack(null)
				//�ύ
				.commit();		
	}
	
	/**
	 * �ж��Ƿ��¼
	 */
	public void isLogin (){
		
	}

	/**
	 * ��һ��Activity
	 * @param activity ���ĸ�Activity��
	 * @param cls	��Ҫ�򿪵�Activity������
	 */
	public void openActivity(Activity activity,Class<?> cls) {
		Intent intent = new Intent();
		intent.setClass(activity, cls);
		activity.startActivity(intent);
	}

}
