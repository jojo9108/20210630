package co.yedam;

public class PersonExample {
	public static void main(String[] args) {
		Person bjh = new Person();

		bjh.setName("박주현");
		bjh.setAge(23);
		bjh.setHeight(162.2);
		bjh.setBloodType("O형");

		Person lsh = new Person();
		
		lsh.setName("lsh");
		lsh.setAge(26);
		lsh.setHeight(186.4);
		lsh.setBloodType("A형");

		Person hmr = new Person();
		hmr.setName("홍미림");
		hmr.setAge(27);
		hmr.setHeight(163.4);
		hmr.setBloodType("B형");

		Person[] persons = { bjh, lsh, hmr };
		// 새로운 인스턴스 (사람) 선언 : 여러분의 정보를 담아서

		for (int i = 0; i < persons.length; i++) {
			// 혈액형이 A형인 사람만 조회
			if (persons[i].getAge() >= 25) {
//				 persons[i].showInfo();
				System.out.println(persons[i].getInfo());
			}
//			System.out.println("이름: " + persons[i].name + ", 나이: " + persons[i].age 
//					+ ", 키: " + persons[i].height + ", 혈액형: " + persons[i].bloodType);
//		}
//		System.out.println(bjh.name + ", " + bjh.age + ", " + bjh.height + ", " + bjh.bloodType);
		}
	}
}