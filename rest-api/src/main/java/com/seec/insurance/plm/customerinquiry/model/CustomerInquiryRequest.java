package com.seec.insurance.plm.customerinquiry.model;

public class CustomerInquiryRequest {

	String id;
	String partyKey;
	
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the partyKey
	 */
	public String getPartyKey() {
		return partyKey;
	}
	/**
	 * @param partyKey the partyKey to set
	 */
	public void setPartyKey(String partyKey) {
		this.partyKey = partyKey;
	}
}
