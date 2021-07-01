package co.yedam;

public class MethodExample3 {
	public static void main(String[] args) {
		Student s1 = new Student("둘리", 2, 84, 96);
		Student s2 = new Student("또치", 3, 75, 100);

		Student[] javaClass = { s1, s2, new Student("마이콜", 3, 90, 73) };

//		s1.setName("둘리");
// 		s1.setGrade(2);
//		s1.setMath(84);
//		s1.setEng(96);
		System.out.println("-- 3학년 List --\n");
		for(int i = 0; i < javaClass.length; i++) {
			if (javaClass[i].getGrade() == 3) {
				System.out.println(javaClass[i].getInfo());
			}
		}
//		System.out.println(s1.getInfo());
	}
}
