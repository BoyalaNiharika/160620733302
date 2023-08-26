package com.demo.Trains.Entity;

public class Price {
	
	private int sleeper;
	private int AC;
	public int getSleeper() {
		return sleeper;
	}
	public void setSleeper(int sleeper) {
		this.sleeper = sleeper;
	}
	public int getAC() {
		return AC;
	}
	public void setAC(int aC) {
		AC = aC;
	}
	public Price(int sleeper, int aC) {
		super();
		this.sleeper = sleeper;
		AC = aC;
	}
	
	

}
