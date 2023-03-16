package board.entity;

//좋아요 리스트_ 
//좋아요한 사용자 이메일[문자열] / 
//좋아요한 사용자 프로필 사진[문자열]/ 
//좋아요한 사용자 닉네임[문자열]


public class Like {
	private String  userEmail;
	private String userProfileImageUrl;
	private String ueserNickname;
	
	public Like() {
		
	}

	public Like(String userEmail, String userProfileImageUrl, String ueserNickname) {
		super();
		this.userEmail = userEmail;
		this.userProfileImageUrl = userProfileImageUrl;
		this.ueserNickname = ueserNickname;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public String getUserProfileImageUrl() {
		return userProfileImageUrl;
	}

	public String getUeserNickname() {
		return ueserNickname;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public void setUserProfileImageUrl(String userProfileImageUrl) {
		this.userProfileImageUrl = userProfileImageUrl;
	}

	public void setUeserNickname(String ueserNickname) {
		this.ueserNickname = ueserNickname;
	}

	@Override
	public String toString() {
		return "Like [userEmail=" + userEmail + ", userProfileImageUrl=" + userProfileImageUrl + ", ueserNickname="
				+ ueserNickname + "]";
	}
	
}
