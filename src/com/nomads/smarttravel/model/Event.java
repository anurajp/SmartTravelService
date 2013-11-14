/**
 * 
 */
package com.nomads.smarttravel.model;

import java.util.Date;
import java.util.List;

/**
 * @author anurajp
 *
 */
public class Event {
	private String eventId;
	private String eventName;
	private String createdByUserId;
	private Date startDate;
	private Date endDate;
	private List<Skill> skills;
	private String compensation;
	private List<String> pendingUsers;
	private List<String> rejectedUsers;
	private List<String> approvedUsers;
	
	public String getEventId() {
		return eventId;
	}
	public void setEventId(String eventId) {
		this.eventId = eventId;
	}
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public List<Skill> getSkills() {
		return skills;
	}
	public void setSkills(List<Skill> skills) {
		this.skills = skills;
	}
	public String getCompensation() {
		return compensation;
	}
	public void setCompensation(String compensation) {
		this.compensation = compensation;
	}
	public List<String> getPendingUsers() {
		return pendingUsers;
	}
	public void setPendingUsers(List<String> pendingUsers) {
		this.pendingUsers = pendingUsers;
	}
	public List<String> getRejectedUsers() {
		return rejectedUsers;
	}
	public void setRejectedUsers(List<String> rejectedUsers) {
		this.rejectedUsers = rejectedUsers;
	}
	public List<String> getApprovedUsers() {
		return approvedUsers;
	}
	public void setApprovedUsers(List<String> approvedUsers) {
		this.approvedUsers = approvedUsers;
	}
	public String getCreatedByUserId() {
		return createdByUserId;
	}
	public void setCreatedByUserId(String createdByUserId) {
		this.createdByUserId = createdByUserId;
	}

}
