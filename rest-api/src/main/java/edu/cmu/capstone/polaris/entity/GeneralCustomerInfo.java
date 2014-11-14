package edu.cmu.capstone.polaris.entity;

import com.fasterxml.jackson.annotation.JsonView;

import edu.cmu.capstone.polaris.views.Views;

/**
 * This class only contains customer basic information for inqury, without any
 * contact info.
 * 
 * @author tony
 *
 */
public class GeneralCustomerInfo extends GeneralResponseMessage {

	@JsonView(Views.BasicView.class)
	private String partyId;
	@JsonView(Views.BasicView.class)
	private String partyKey;
	@JsonView(Views.BasicView.class)
	private String partyType;

	@JsonView(Views.BasicView.class)
	private String ID;
	@JsonView(Views.BasicView.class)
	private String IDType;

	@JsonView(Views.BasicView.class)
	private String firstName;
	@JsonView(Views.BasicView.class)
	private String middleName;
	@JsonView(Views.BasicView.class)
	private String lastName;

	@JsonView(Views.BasicView.class)
	private String leadStage;
	@JsonView(Views.BasicView.class)
	private String dateOfBirth;
	@JsonView(Views.BasicView.class)
	private String gender;

	public GeneralCustomerInfo() {
	}

	public GeneralCustomerInfo(String id, String type) {
		setPartyID(id);
		setPartyType(type);
	}

	public String getPartyID() {
		return partyId;
	}

	public void setPartyID(String partyID) {
		this.partyId = partyID;
	}

	public String getPartyType() {
		return partyType;
	}

	public void setPartyType(String partyType) {
		this.partyType = partyType;
	}

	public String getPartyKey() {
		return partyKey;
	}

	public void setPartyKey(String partyKey) {
		this.partyKey = partyKey;
	}

	// public String getID() {
	// return ID;
	// }
	//
	// public void setID(String iD) {
	// ID = iD;
	// }
	//
	// public String getIDType() {
	// return IDType;
	// }
	//
	// public void setIDType(String iDType) {
	// IDType = iDType;
	// }

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLeadStage() {
		return leadStage;
	}

	public void setLeadStage(String leadStage) {
		this.leadStage = leadStage;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}
