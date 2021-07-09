package co.yedam.api;

public class StringExample2 {
	public static void main(String[] args) {
		String birth1 = "991008-1234567";
		String birth2 = "991008 2234567";
		String birth3 = "991008-1234568";
		String birth4 = "991008-2234569";
		String birth5 = "991008 4234567";

		String a = checkGender(birth1);
		

		char sex = a.charAt(7);
		switch (sex) {
		case '1':
		case '3':
			System.out.println("남자입니다");
		case '2':
		case '4':
			System.out.println("여자입니다");
		}
	}

	private static String checkGender(String birth1) {
		return "남자";
	}

}
