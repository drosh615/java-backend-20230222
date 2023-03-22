package test;


public class GuestInfoDto {
	private String name;
	private String gender;
	private String address;
	private String phoneNumber;
	private String marketingCheck;
	private String consentCollectInfo;
	
	public GuestInfoDto() {	}
	public GuestInfoDto(String name, String gender, String address, String phoneNumber, String marketingCheck,
			String consentCollectInfo) {
		this.name = name;
		this.gender = gender;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.marketingCheck = marketingCheck;
		this.consentCollectInfo = consentCollectInfo;
	}

	public String getName() {
		return name;
	}
	public String getGender() {
		return gender;
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
	public void setName(String name) {
		this.name = name;
	}
	public void setGender(String gender) {
		this.gender = gender;
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
		return "GuestInfoDto [name=" + name + ", gender=" + gender + ", address=" + address + ", phoneNumber="
				+ phoneNumber + ", marketingCheck=" + marketingCheck + ", consentCollectInfo=" + consentCollectInfo
				+ "]";
	}
	
	public boolean validate() {
		boolean result = 
				this.name.isBlank() || 
				this.gender.isBlank() ||
				this.address.isBlank() ||
				this.phoneNumber.isBlank() ||
				this.marketingCheck.isBlank() ||
				this.consentCollectInfo.isBlank();
		return result;
	}
	
	
}
