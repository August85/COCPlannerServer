package com.ak.model;

public class User {

	private String userName;
	private String clanName;
	
	public User (String uName, String cName) {
		this.userName = uName;
		this.clanName = cName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getClanName() {
		return clanName;
	}
	public void setClanName(String clanName) {
		this.clanName = clanName;
	}
	
	@Override
	public String toString() {
		String ret = "{\"userName\" : \"" + this.userName + "\", \"clanName\" :\"" + this.clanName + "\"}";
		return ret;
		
	}
	
}
