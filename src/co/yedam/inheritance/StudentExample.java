package co.yedam.inheritance;

public class StudentExample {
	public static void main(String[] args) {
		Student std = new Student();
		std.setName("학생1");
		std.setStudNo(100);
//		System.out.println("Student: " + std.getName() + "," + std.getStudNo());

		HighStudent highStd = new HighStudent();
		highStd.setName("고등학생1");
		highStd.setStudNo(1001);
		highStd.setSchoolName("성서고등학교");
//		System.out.println("HighStudent: " + highStd.getName() + "," + highStd.getStudNo() + "," + highStd.getSchoolName());

		Student[] students = new Student[3];
		students[0] = std;
		students[1] = highStd;

		students[0].getName();
		students[0].getStudNo();
		if (students[0] instanceof HighStudent) {// students[0] 의 인스턴스가 HighStudent의 것이 맞는지 확인하고 아니면 실행하지 마십시오.
			HighStudent hsx = (HighStudent) students[0];
			hsx.getSchoolName(); // 문법상 오류 X
		}
		students[0].showInfo();
		System.out.println(students[0].toString());

		students[1].getName();
		students[1].getStudNo();
//		students[1].getSchoolName();
		if (students[0] instanceof HighStudent) {
			HighStudent hs = (HighStudent) students[1];
			hs.getSchoolName();
		}
		students[1].showInfo();
		System.out.println(students[1]);
//		int <-- byte;(작은거에서 큰거) , byte <-- (byte) int;(큰거에서 작은거)

	}
}