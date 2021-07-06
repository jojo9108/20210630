package co.yedam.Friend;

public class CompFriend extends Friend {

	private String department;

	public CompFriend(String name, String phone, String department) {
		super(name, phone);
		this.department = department;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "UnivFriend [getName() = " + getName() + ", getPhone() = " + getPhone() + ", getDepartment() = " + getDepartment() + "]";
	}
	
}
