package co.yedam;

public class Student {

	private String name;
	private int grade;
	private int math;
	private int eng;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public void showInfo() {
		System.out.println(
				"[이름: " + this.name 
				+ ", 학년: " + this.grade 
				+ ", 수학점수:" + this.math 
				+ ", 영어점수: " + this.eng + "]");
	}
	
	public String getInfo() {
		return "[이름: " + this.name 
				+ ", 학년: " + this.grade 
				+ ", 수학점수:" + this.math 
				+ ", 영어점수: " + this.eng + "]";
	
		
	}
		
}
