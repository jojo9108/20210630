package co.yedam.modifier;

class Teacher {
	private String name;
	private String major;

	Teacher() { // default 생성자

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
}

public class Student {
	private String name;
	private String major;
	private int grade;

	private Student() {
		// private
	}

	protected Student(String name) {
		// default
		this.name = name;
	}

	public Student(String name, String major) {
		// public
		this.name = name;
		this.major = major;

	}
}
