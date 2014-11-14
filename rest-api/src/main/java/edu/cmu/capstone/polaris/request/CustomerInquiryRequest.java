package edu.cmu.capstone.polaris.request;

public class CustomerInquiryRequest {
	private String customerID;
	
	private boolean hasAddress;
	private boolean hasPhone;
	private boolean hasEmail;
	private boolean hasSocialAccount;

	public String getCustomerID() {
		return customerID;
	}

	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}
	
	public boolean requestHasPhone() {
		return hasPhone;
	}

	public void requirePhone(boolean hasPhone) {
		this.hasPhone = hasPhone;
	}

	public boolean requestHasAddress() {
		return hasAddress;
	}

	public void requireAddress(boolean hasAddress) {
		this.hasAddress = hasAddress;
	}

	public boolean requestHasEmail() {
		return hasEmail;
	}

	public void requireEmail(boolean hasEmail) {
		this.hasEmail = hasEmail;
	}

	public boolean requestHasSocialAccount() {
		return hasSocialAccount;
	}

	public void requireSocialAccount(boolean hasSocialAccount) {
		this.hasSocialAccount = hasSocialAccount;
	}


}
