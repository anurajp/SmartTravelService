/**
 * 
 */
package com.nomads.smarttravel.model;

import java.util.List;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

/**
 * @author anurajp
 *
 */

@PersistenceCapable
public class User {
	@PrimaryKey
	@Persistent
	private String userId;
	@Persistent
	private String userName;
	@Persistent
	private String emailId;
	@Persistent
	private String contact;
	@Persistent
	private List<Skill> skills;
	@Persistent
	private List<String> travelInfoIds;
	@Persistent
	private Vote vote;
	@Persistent
	private List<String> comments;
	@Persistent
	private List<String> pendingEvents;
	@Persistent
	private List<String> rejectedEvents;
	@Persistent
	private List<String> approvedEvents;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public List<Skill> getSkills() {
		return skills;
	}
	public void setSkills(List<Skill> skills) {
		this.skills = skills;
	}
	
	public Vote getVote() {
		return vote;
	}
	public void setVote(Vote vote) {
		this.vote = vote;
	}

	public List<String> getComments() {
		return comments;
	}
	public void setComments(List<String> comments) {
		this.comments = comments;
	}

	public List<String> getPendingEvents() {
		return pendingEvents;
	}
	public void setPendingEvents(List<String> pendingEvents) {
		this.pendingEvents = pendingEvents;
	}
	public List<String> getRejectedEvents() {
		return rejectedEvents;
	}
	public void setRejectedEvents(List<String> rejectedEvents) {
		this.rejectedEvents = rejectedEvents;
	}
	public List<String> getApprovedEvents() {
		return approvedEvents;
	}
	public void setApprovedEvents(List<String> approvedEvents) {
		this.approvedEvents = approvedEvents;
	}

	public List<String> getTravelInfoIds() {
		return travelInfoIds;
	}
	public void setTravelInfoIds(List<String> travelInfoIds) {
		this.travelInfoIds = travelInfoIds;
	}

	private static class Vote {
		private int total;
		private int positive;
		
		private Vote() {
			total = 0;
			positive = 0;
		}
		
		public int getTotal() {
			return total;
		}
		public void setTotal(int total) {
			this.total = total;
		}
		public int getPositive() {
			return positive;
		}
		public void setPositive(int positive) {
			this.positive = positive;
		}
	}
	
}
