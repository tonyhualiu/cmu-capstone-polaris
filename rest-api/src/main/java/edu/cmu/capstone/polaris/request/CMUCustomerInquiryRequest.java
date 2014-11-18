package edu.cmu.capstone.polaris.request;

import com.seec.insurance.plm.customerinquiry.model.CustomerInquiryRequest;



public class CMUCustomerInquiryRequest extends CustomerInquiryRequest{

	private boolean hasAddress;
	private boolean hasPhone;
	private boolean hasEmail;
	private boolean hasSocialAccount;
	
	public boolean requestHasPhone() {
		return hasPhone;
	}

	public void requirePhone() {
		this.hasPhone = true;
	}

	public boolean requestHasAddress() {
		return hasAddress;
	}

	public void requireAddress() {
		this.hasAddress = true;
	}

	public boolean requestHasEmail() {
		return hasEmail;
	}

	public void requireEmail() {
		this.hasEmail = true;
	}

	public boolean requestHasSocialAccount() {
		return hasSocialAccount;
	}

	public void requireSocialAccount() {
		this.hasSocialAccount = true;
	}
	
	public String toString(){
		StringBuilder sb = new StringBuilder();
		return sb.append(super.toString()).append("\n")
		  .append("Address: ").append(this.hasAddress).append("\n")
		  .append("Email: ").append(this.hasEmail).append("\n")
		  .append("SocialAccount: ").append(this.hasSocialAccount).toString();
	}
	
}
