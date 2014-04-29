package com.kirno.take_out_system.ctrl;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;

import com.kirno.take_out_system.dto.DtoUserInf;
import com.kirno.take_out_system.service.Service;

public class CtrlButton {

	private static CtrlButton instance;
	private Service mService;

	private CtrlButton() {
		mService = new Service();
	}
	
	public static CtrlButton getInstance(){
		if(instance == null){
			instance = new CtrlButton();
		}
		return instance;
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
	public void changeFragment(FragmentManager fm, int fragmentRecours,
			Fragment fragment) {
		mService.changeFragment(fm, fragmentRecours, fragment);
	}

	/**
	 * ���Ƶ���ҵĶ�����ĳ���ȥ���Ǵ򿪶����б����Ǵ򿪵�¼
	 * @param fm
	 * @param fragmentRecours
	 * @param fragment
	 * @param activity
	 * @param cls
	 */
	public void isLogin(FragmentManager fm, int fragmentRecours,
			Fragment fragment, Activity activity, Class<?> cls) {
		if (DtoUserInf.getInstance().isLogin()) {
			mService.changeFragment(fm, fragmentRecours, fragment);
		} else {
			mService.openActivity(activity, cls);
		}
	}
	
	/**
	 * ��һ��Activity
	 * @param activity
	 * @param cls
	 */
	public void openActivity(Activity activity, Class<?> cls){
		mService.openActivity(activity, cls);
	}

}
