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
	 * 更换Fragment
	 * 
	 * @param tran
	 *            需要更换Fragment的Activity中获取的FragmentTransaction对象
	 * @param fragmentRecours
	 *            需要跟换掉的Fragment的ID
	 * @param fragment
	 *            新Fragment对象
	 */
	public void changeFragment(FragmentManager fm, int fragmentRecours, Fragment fragment) {
		
			fm.beginTransaction()
				//设置替换的Fragment
				.replace(fragmentRecours, fragment)
				//转换Fragment动画
				.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
				//放入后退栈
				.addToBackStack(null)
				//提交
				.commit();		
	}
	
	/**
	 * 判断是否登录
	 */
	public void isLogin (){
		
	}

	/**
	 * 打开一个Activity
	 * @param activity 从哪个Activity打开
	 * @param cls	需要打开的Activity的类名
	 */
	public void openActivity(Activity activity,Class<?> cls) {
		Intent intent = new Intent();
		intent.setClass(activity, cls);
		activity.startActivity(intent);
	}

}
