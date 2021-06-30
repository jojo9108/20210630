package co.yedam;

public class StudentExample {
	public static void main(String[] args) {
		Student a = new Student();

		a.setName("가");
		a.setGrade(1);
		a.setMath(90);
		a.setEng(80);

		Student b = new Student();

		b.setName("나");
		b.setGrade(2);
		b.setMath(71);
		b.setEng(96);

		Student c = new Student();

		c.setName("다");
		c.setGrade(3);
		c.setMath(84);
		c.setEng(78);

		Student[] student = { a, b, c };
		int maxValue = 0;

		Student maxStudent = null;
		for (int i = 0; i < student.length; i++) {
			if (student[i].getMath() > maxValue) {
				maxValue = student[i].getMath();
				maxStudent = student[i];
			}
		}
		System.out.println("수학의 최고점수: " + maxStudent.getMath() + " 이름:" + maxStudent.getName());
		int mathsum = 0;
		double mathavg = 0.0;
		for (int j = 0; j < student.length; j++) {
			mathsum += student[j].getMath();
			mathavg = mathsum / 3;

		} System.out.println(mathsum + ", " + mathavg);
	}
}