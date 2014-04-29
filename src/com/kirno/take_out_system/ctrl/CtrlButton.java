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
	 * 更换Fragment
	 * 
	 * @param tran
	 *            需要更换Fragment的Activity中获取的FragmentTransaction对象
	 * @param fragmentRecours
	 *            需要跟换掉的Fragment的ID
	 * @param fragment
	 *            新Fragment对象
	 */
	public void changeFragment(FragmentManager fm, int fragmentRecours,
			Fragment fragment) {
		mService.changeFragment(fm, fragmentRecours, fragment);
	}

	/**
	 * 控制点击我的订单后的程序去向，是打开订单列表，还是打开登录
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
	 * 打开一个Activity
	 * @param activity
	 * @param cls
	 */
	public void openActivity(Activity activity, Class<?> cls){
		mService.openActivity(activity, cls);
	}

}
