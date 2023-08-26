package com.demo.Trains.Entity;

public class Train {
	
	private String trainName;
	private String trainNumber;
	private Departure departureTime;
	private SeatsAvailable seatsAvailable;
	private SeatsAvailable price;
	private int delayedBy;
	public Train(String trainName, String trainNumber, Departure departureTime, SeatsAvailable seatsAvailable,
			SeatsAvailable price, int delayedBy) {
		super();
		this.trainName = trainName;
		this.trainNumber = trainNumber;
		this.departureTime = departureTime;
		this.seatsAvailable = seatsAvailable;
		this.price = price;
		this.delayedBy = delayedBy;
	}
	public String getTrainName() {
		return trainName;
	}
	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}
	public String getTrainNumber() {
		return trainNumber;
	}
	public void setTrainNumber(String trainNumber) {
		this.trainNumber = trainNumber;
	}
	public Departure getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(Departure departureTime) {
		this.departureTime = departureTime;
	}
	public SeatsAvailable getSeatsAvailable() {
		return seatsAvailable;
	}
	public void setSeatsAvailable(SeatsAvailable seatsAvailable) {
		this.seatsAvailable = seatsAvailable;
	}
	public SeatsAvailable getPrice() {
		return price;
	}
	public void setPrice(SeatsAvailable price) {
		this.price = price;
	}
	public int getDelayedBy() {
		return delayedBy;
	}
	public void setDelayedBy(int delayedBy) {
		this.delayedBy = delayedBy;
	}
	

}
