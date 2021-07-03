package co.yedam.pilates;

public class Member {
	private int memberId;
	private String membername;
	private String memberphone;
	private String memberbirth;
	private Gender membergender;

	public Member(int memberId, String membername, String memberphone, String memberbirth, Gender membergender) {
		super();
		this.memberId = memberId;
		this.membername = membername;
		this.memberphone = memberphone;
		this.memberbirth = memberbirth;
		this.membergender = membergender;
	}

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
		String info = "[ 회원번호: " + memberId + "  회원이름: " + membername + "  연락처: " + memberphone + "  생년월일: "
				+ memberbirth + "  성별: " + membergender + " ]";
		return info;
	}

	public void setDetail() {
		System.out.println("회원번호: " + this.memberId + "\2t이름: " + this.membername + "\n생년월일: " + this.memberbirth + "\2t연락처: "
				+ this.memberphone + "\n성별: " + this.membergender);
	}
	public String getDetail() {
		return "회원번호: " + memberId + "\t이름: " + membername + "\n생년월일: " + memberbirth + " 연락처: "
				+ memberphone + "\n성별: " + membergender;
	}
}
