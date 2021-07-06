package co.yedam.Friend;

public class UnivFriend extends Friend {

	private String major;

	public UnivFriend(String name, String phone, String major) {
		super(name, phone);
		this.major = major;
	}

	// 메소드.
	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public String toString() {
		return "UnivFriend [getName() = " + getName() + ", getPhone() = " + getPhone() + ", getMajor() = " + getMajor() + "]";
	}

	
}
