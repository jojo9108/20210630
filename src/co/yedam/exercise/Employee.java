package co.yedam.exercise;

public class Employee {
	// 필드(사원.)정의
	// 사원번호
	// 이름
	// 이메일
	// 급여
	// 부서
	private int empNum;
	private String name;
	private String email;
	private int pay;
	private String dept;

	public Employee() {

	}

	public Employee(int empNum, String name, String email) {
		super();
		this.empNum = empNum;
		this.name = name;
		this.email = email;
	}

	public Employee(int empNum, String name, String email, int pay, String dept) {
		super();
		this.empNum = empNum;
		this.name = name;
		this.email = email;
		this.pay = pay;
		this.dept = dept;
	}

	public int getEmpNum() {
		return empNum;
	}

	public void setEmpNum(int empNum) {
		this.empNum = empNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPay() {
		return pay;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String showInfo() {
		String info = "사원번호: " + empNum + " | 이름: " + name + " | 이메일: " + email + " | 급여: " + pay + "\t | 부서: " + dept;
		return info;
	}

	// 메소드 정의.
	// get, set
}
