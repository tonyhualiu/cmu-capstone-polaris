package com.seec.insurance.plm.customerinquiry.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.seec.insurance.common.model.ResponseMessage;

@JsonFilter("inquiryFilter")
public class CustomerInquiryResponse extends ResponseMessage {

	CustomerDetails customerDetails;
	List<Phone> phoneList = null;
	List<Address> addressList = null;
	List<EmailAddress> emailList = null;

	
	/**
	 * @return the customerDetails
	 */
	public CustomerDetails getCustomerDetails() {
		return customerDetails;
	}
	/**
	 * @param customerDetails the customerDetails to set
	 */
	public void setCustomerDetails(CustomerDetails customerDetails) {
		this.customerDetails = customerDetails;
	}
	/**
	 * @return the phoneList
	 */
	public List<Phone> getPhoneList() {
		return phoneList;
	}
	/**
	 * @param phoneList the phoneList to set
	 */
	public void setPhoneList(List<Phone> phoneList) {
		this.phoneList = phoneList;
	}
	/**
	 * @return the addressList
	 */
	public List<Address> getAddressList() {
		return addressList;
	}
	/**
	 * @param addressList the addressList to set
	 */
	public void setAddressList(List<Address> addressList) {
		this.addressList = addressList;
	}
	/**
	 * @return the emailList
	 */
	public List<EmailAddress> getEmailList() {
		return emailList;
	}
	/**
	 * @param emailList the emailList to set
	 */
	public void setEmailList(List<EmailAddress> emailList) {
		this.emailList = emailList;
	}
		
}
