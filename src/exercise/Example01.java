package exercise;

import co.yedam.Person;

public class Example01 {
	public static void main(String[] args) {
		// e1: 사원번호: 1234, 이름: 박주현, 이메일: pjh@email.com
		// 급여: 4,500,000원, 부서: 개발부
//		e1.showInfo(); // 사원번호: 1234 | 이름: 박주현 | 이메일: pjh@email.com
//		
//		// e2: 사원번호: 1235, 이름: 홍미림, 이메일: hmr@email.com
//		e2 = new Employee(1235, "홍미림", "hmr@email.com");
		Employee e1 = new Employee();
		e1.setEmpNum(1234);
		e1.setName("박주현");
		e1.setEmail("bjh@email.com");
		
	
		String name = e1.setName();
		
		Employee  e1 = new Employee(1234, "박주현" , "pjh@email.com", 4500000, "개발부");
		System.out.println(e1.showInfo());
		
		// 배열 : employees (5)
		// 첫번째위치: e1, 두번째위치: e2,
		// 세번째위치: new Employee(1236, "홍길동", "hgd@email.com", 5000000, "총무부")
		
	}
}
