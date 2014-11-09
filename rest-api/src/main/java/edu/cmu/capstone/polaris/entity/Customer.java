package edu.cmu.capstone.polaris.entity;

/**
 * This class only contains customer basic information for inqury, 
 * without any contact info.
 * @author tony
 *
 */
public class Customer extends GeneralCustomer{
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
