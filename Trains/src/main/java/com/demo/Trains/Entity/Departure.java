package com.demo.Trains.Entity;

public class Departure {
	
	private int Hours;
	private int Minutes;
	private int Seconds;
	public Departure(int hours, int minutes, int seconds) {
		super();
		Hours = hours;
		Minutes = minutes;
		Seconds = seconds;
	}
	public int getHours() {
		return Hours;
	}
	public void setHours(int hours) {
		Hours = hours;
	}
	public int getMinutes() {
		return Minutes;
	}
	public void setMinutes(int minutes) {
		Minutes = minutes;
	}
	public int getSeconds() {
		return Seconds;
	}
	public void setSeconds(int seconds) {
		Seconds = seconds;
	}

}
