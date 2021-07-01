package co.yedam;

public class MethodExample2 {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setName("박주현");
		String name = p1.getName();

		int n1 = p1.getSum(10, 20);
		int n2 = p1.getSum(5, 5);
		int result = p1.getSum(n1, n2);

		System.out.println("결과: " + result);

		// 10 ~ 20

		n1 = p1.getFrom10To20();
		System.out.println("10~20: " + n1);
		n2 = p1.getFrom10To(10, 20);
		System.out.println("10~20: " + n2);
		
		p1.setAge(23);
		int age = p1.getAge();
		
		String who = p1.getNameAndAge(name, age);
		System.out.println(who);
		
		Person newPerson = p1.createNewPerson("박주현", 23);
		newPerson.setHeight(162.2);
		newPerson.setBloodType("O형");
		System.out.println(newPerson.getInfo());
		
		//
		Person anotherPerson = p1.anotherPerson("홍미림", 27, 163.4);
		anotherPerson.setBloodType("B형");
		System.out.println(anotherPerson.getInfo());
		
		Person nicePerson = p1.nicePerson("유재석", 50, 175, "O형");
		System.out.println(nicePerson.getInfo());
		
	}

}
