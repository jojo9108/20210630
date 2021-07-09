package co.yedam.api;

import java.text.MessageFormat;

public class TimeZoneExample {
	public static void main(String[] args) {
//		DecimalFormat df = new DecimalFormat("#,###.###");
//		df = new DecimalFormat("00000000000000000.00000");
//		df = new DecimalFormat("#################.#####");
//		double num = 123456123456.789;
//
//		System.out.println(df.format(num));
//		
		
		String data = "회원ID: {0} \n회원 이름: {1} \n회원 전화: {2}";
		System.out.println(MessageFormat.format(data, "123", "홍길동", "1234-5678"));

		System.out.format("회원ID: %s \n회원번호: %s \n회원전화: %s", "123", "홍길동", "1234-5678");
		
		
	}
}
