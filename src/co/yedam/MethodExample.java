package co.yedam;

public class MethodExample {

//		split: 값을 나눠서 표현
//		result: 묶어주는 나타내주는 명령어
//		\n: 엔터의 역할

	public static String makeUsefulInfo(String str) {
		
		String[] info = str.split(" ");
		String name = info[0];
		String birth = info[1];
		String phone = info[2];
		name = "이름: " + name;
		birth = "\n생일: " + birth.substring(0, 4) + "년 " + birth.substring(4, 6) + "월 " + birth.substring(6, 8) + "일 ";
		phone = "\n전화번호: " + phone.substring(0, 3) + "-" + phone.substring(3, 7) + "-" + phone.substring(7, 11);
		String result;
		result = name;
		result += birth;
		result += phone;

		return result;
	}

	public static void main(String[] args) {
		
		String str1 = new String("박주현 19991008 01077972281");
		String result = makeUsefulInfo(str1);
		System.out.println(result);

		String str2 = new String("유재석 19900101 01012345678");
		System.out.println(makeUsefulInfo(str2));

		String str3 = new String("하하 19900101 01012345678");
		makeUsefulInfo(str3);

		System.out.println("프로그램종료.");
	}

}