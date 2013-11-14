package com.nomads.smarttravel.model;

public class Skill {

	private String tag;
	private Expertise expertise;
	
	public Skill(String tag, Expertise expertise) {
		super();
		this.tag = tag;
		this.expertise = expertise;
	}
	
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public Expertise getExpertise() {
		return expertise;
	}
	public void setExpertise(Expertise expertise) {
		this.expertise = expertise;
	}
	
	
}
