package co.yedam.account;

import java.util.Scanner;

public class Utils {
	static Scanner scn = new Scanner(System.in);

	// 사용자 문자열을 입력값으로 변환.
	public static String scanString(String arg) {
		System.out.println(arg);
		String val = scn.nextLine();
		return val;
	}

	public static String scanNumberString(String arg) {
		String val = "";
		while (true) {
			System.out.println(arg);
			val = scn.nextLine();
			try {
				Integer.parseInt(val);
				break;
			} catch (Exception e) {
				System.out.println("숫자를 입력하세요.");
			}
		}
		return val;
	}
}