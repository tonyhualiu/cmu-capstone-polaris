package edu.cmu.capstone.polaris.entity;

@Deprecated
public class Email {
	
	private String emailAddressKey;
	private String emailType;
	private String emailAddress;

	public String getEmailAddressKey() {
		return emailAddressKey;
	}

	public void setEmailAddressKey(String emailAddressKey) {
		this.emailAddressKey = emailAddressKey;
	}

	public String getEmailType() {
		return emailType;
	}

	public void setEmailType(String emailType) {
		this.emailType = emailType;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

}
