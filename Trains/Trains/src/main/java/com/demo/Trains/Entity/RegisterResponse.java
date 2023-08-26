package com.demo.Trains.Entity;

public class RegisterResponse {

	private String companyName;
	private String clientID;
	private String clientSecret;
	public RegisterResponse(String companyName, String clientID, String clientSecret) {
		super();
		this.companyName = companyName;
		this.clientID = clientID;
		this.clientSecret = clientSecret;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getClientID() {
		return clientID;
	}
	public void setClientID(String clientID) {
		this.clientID = clientID;
	}
	public String getClientSecret() {
		return clientSecret;
	}
	public void setClientSecret(String clientSecret) {
		this.clientSecret = clientSecret;
	}
}
