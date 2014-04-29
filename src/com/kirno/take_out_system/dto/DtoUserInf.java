package com.kirno.take_out_system.dto;

/**
 * 存储用户信息
 * 
 * @author qq303_000
 * 
 */
public class DtoUserInf {

	private static DtoUserInf instance;
	private String username;
	private String passwrod;
	private String email;
	private boolean isLogin;

	private DtoUserInf() {
	}

	public static DtoUserInf getInstance() {
		if (instance == null) {
			instance = new DtoUserInf();
		}
		return instance;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPasswrod() {
		return passwrod;
	}

	public void setPasswrod(String passwrod) {
		this.passwrod = passwrod;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isLogin() {
		return isLogin;
	}

	public void setLogin(boolean isLogin) {
		this.isLogin = isLogin;
	}

}
