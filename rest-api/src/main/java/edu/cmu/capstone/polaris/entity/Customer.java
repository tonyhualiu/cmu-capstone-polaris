package edu.cmu.capstone.polaris.entity;

public class Customer {
	private String partyID;
	private String partyType;
	
	//must have
	public Customer(){}
	
	public Customer(String id, String type){
		setPartyID(id);
		setPartyType(type);
	}

	public String getPartyID() {
		return partyID;
	}

	public void setPartyID(String partyID) {
		this.partyID = partyID;
	}

	public String getPartyType() {
		return partyType;
	}

	public void setPartyType(String partyType) {
		this.partyType = partyType;
	}
	
	
}
