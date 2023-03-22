package test;

import java.util.UUID;

public class Guest {
	private UUID guestNumber;
	private String name;
	private String gender;
	private String date;
	private String address;
	private String phoneNumber;
	private String marketingCheck;
	private String consentCollectInfo;
	
	public Guest() {
	}
	public Guest(UUID guestNumber, String name, String gender, String date, String address, String phoneNumber,
			String marketingCheck, String consentCollectInfo) {
		this.guestNumber = guestNumber;
		this.name = name;
		this.gender = gender;
		this.date = date;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.marketingCheck = marketingCheck;
		this.consentCollectInfo = consentCollectInfo;
	}

	public UUID getGuestNumber() {
		return UUID.randomUUID();
	}
	public String getName() {
		return name;
	}
	public String getGender() {
		return gender;
	}
	public String getDate() {
		return date;
	}
	public String getAddress() {
		return address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public String getMarketingCheck() {
		return marketingCheck;
	}
	public String getConsentCollectInfo() {
		return consentCollectInfo;
	}
	
	public void setGuestNumber(UUID guestNumber) {
		this.guestNumber = guestNumber;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public void setMarketingCheck(String marketingCheck) {
		this.marketingCheck = marketingCheck;
	}
	public void setConsentCollectInfo(String consentCollectInfo) {
		this.consentCollectInfo = consentCollectInfo;
	}
	@Override
	public String toString() {
		return "Guest [guestNumber=" + guestNumber + ", name=" + name + ", gender=" + gender + ", date=" + date
				+ ", address=" + address + ", phoneNumber=" + phoneNumber + ", marketingCheck=" + marketingCheck
				+ ", consentCollectInfo=" + consentCollectInfo + ", getGuestNumber()=" + getGuestNumber()
				+ ", getName()=" + getName() + ", getGender()=" + getGender() + ", getDate()=" + getDate()
				+ ", getAddress()=" + getAddress() + ", getPhoneNumber()=" + getPhoneNumber() + ", getMarketingCheck()="
				+ getMarketingCheck() + ", getConsentCollectInfo()=" + getConsentCollectInfo() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
