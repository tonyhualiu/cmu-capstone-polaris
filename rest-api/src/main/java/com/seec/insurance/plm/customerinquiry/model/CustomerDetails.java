package com.seec.insurance.plm.customerinquiry.model;

import java.util.Date;

public class CustomerDetails {

	String customerKey;
	
	String firstName;
	String lastName;
	String middleName;
	String fullName;
	String gender;
	Date birthDate;
	String leadStage;
	String primaryAddress;
	String primaryPhone;
	String ssn;
	
	
	/**
	 * @return the customerKey
	 */
	public String getCustomerKey() {
		return customerKey;
	}
	/**
	 * @param customerKey the customerKey to set
	 */
	public void setCustomerKey(String customerKey) {
		this.customerKey = customerKey;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the middleName
	 */
	public String getMiddleName() {
		return middleName;
	}
	/**
	 * @param middleName the middleName to set
	 */
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	/**
	 * @return the fullName
	 */
	public String getFullName() {
		return fullName;
	}
	/**
	 * @param fullName the fullName to set
	 */
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * @return the birthDate
	 */
	public Date getBirthDate() {
		return birthDate;
	}
	/**
	 * @param birthDate the birthDate to set
	 */
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	/**
	 * @return the leadStage
	 */
	public String getLeadStage() {
		return leadStage;
	}
	/**
	 * @param leadStage the leadStage to set
	 */
	public void setLeadStage(String leadStage) {
		this.leadStage = leadStage;
	}
	/**
	 * @return the primaryAddress
	 */
	public String getPrimaryAddress() {
		return primaryAddress;
	}
	/**
	 * @param primaryAddress the primaryAddress to set
	 */
	public void setPrimaryAddress(String primaryAddress) {
		this.primaryAddress = primaryAddress;
	}
	/**
	 * @return the primaryPhone
	 */
	public String getPrimaryPhone() {
		return primaryPhone;
	}
	/**
	 * @param primaryPhone the primaryPhone to set
	 */
	public void setPrimaryPhone(String primaryPhone) {
		this.primaryPhone = primaryPhone;
	}
	/**
	 * @return the ssn
	 */
	public String getSsn() {
		return ssn;
	}
	/**
	 * @param ssn the ssn to set
	 */
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
}
