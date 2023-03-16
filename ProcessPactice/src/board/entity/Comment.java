package board.entity;

import java.util.Date;

//댓글 리스트_  
//(댓글 작성자 이메일)/ 댓글 작성자 프로필사진[문자열]/ 
//댓글 작성자 닉네임[문자열] /댓글 작성 날짜 및 시간[날짜] / 댓글 내용[문자열] 


public class Comment {
	private String writerprofileImageUrl;
	private String writerNickname;
	private Date writeDatetime;
	private String content;
	
	public Comment() {
		
	}

	public Comment(String writerprofileImageUrl, String writerNickname, Date writeDatetime, String content) {
		super();
		this.writerprofileImageUrl = writerprofileImageUrl;
		this.writerNickname = writerNickname;
		this.writeDatetime = writeDatetime;
		this.content = content;
	}

	public String getWriterprofileImageUrl() {
		return writerprofileImageUrl;
	}

	public String getWriterNickname() {
		return writerNickname;
	}

	public Date getWriteDatetime() {
		return writeDatetime;
	}

	public String getContent() {
		return content;
	}

	public void setWriterprofileImageUrl(String writerprofileImageUrl) {
		this.writerprofileImageUrl = writerprofileImageUrl;
	}

	public void setWriterNickname(String writerNickname) {
		this.writerNickname = writerNickname;
	}

	public void setWriteDatetime(Date writeDatetime) {
		this.writeDatetime = writeDatetime;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "Comment [writerprofileImageUrl=" + writerprofileImageUrl + ", writerNickname=" + writerNickname
				+ ", writeDatetime=" + writeDatetime + ", content=" + content + "]";
	}
	
	
}
