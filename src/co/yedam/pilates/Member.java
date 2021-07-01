package co.yedam.pilates;

public class Member {
	private int memberId;
	private String membername;
	private String memberphone;
	private String memberbirth;
	private Gender membergender;
	
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public String getName() {
		return membername;
	}
	public void setName(String name) {
		this.membername = name;
	}
	public String getMemberphone() {
		return memberphone;
	}
	public void setMemberphone(String memberphone) {
		this.memberphone = memberphone;
	}
	public String getMemberbirth() {
		return memberbirth;
	}
	public void setMemberbirth(String memberbirth) {
		this.memberbirth = memberbirth;
	}
	public Gender getMembergender() {
		return membergender;
	}
	public void setMembergender(Gender membergender) {
		this.membergender = membergender;
	}
	
	public String showInfo() {
		String info = "1.회원번호: " + memberId 
				+ " 2.회원이름: " + membername 
				+ " 3.연락처: " + memberphone 
				+ " 4.생년월일: " + memberbirth 
				+ " 5.성별: " + membergender;
		return info;
		
	}
	
	
}
