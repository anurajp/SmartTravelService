package com.nomads.smarttravel.model;

public class TravelInfo {
	private String travelId;
	private long startTime;
	private long endTime;
	private long place;
	private String userId;
	
	public long getStartTime() {
		return startTime;
	}
	public void setStartTime(long startTime) {
		this.startTime = startTime;
	}
	public long getEndTime() {
		return endTime;
	}
	public void setEndTime(long endTime) {
		this.endTime = endTime;
	}
	public long getPlace() {
		return place;
	}
	public void setPlace(long place) {
		this.place = place;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getTravelId() {
		return travelId;
	}
	public void setTravelId(String travelId) {
		this.travelId = travelId;
	}
	
}
