package co.yedam.exercise;

import co.yedam.pilates.Gender;
import co.yedam.pilates.Member;

public class MemberExercise {
	public static void main(String[] args) {
		 Member m1 = new Member();
		 m1.setMemberId(101);
		 m1.setName("Bak");
		 m1.setMemberphone("010");
		m1 = new Member(101, "Hong", "0101234", "0101", Gender.MEN, null);
		System.out.println(m1.getMemberId());
		m1 = new Member(101, "Hwang", "101022", null, null);
		System.out.println(m1.getMemberId() + "," + m1.getMemberId());
	}
}
