package co.yedam.api;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeExample {
	public static void main(String[] args) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now.format(dtf)); // LocalDateTime => String

		LocalDateTime anytime = LocalDateTime.parse("2021-06-13 15:00:00", dtf); // String -> LocalDateTime
		dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH");
		anytime = LocalDateTime.parse("2021/05/01 14", dtf);

		System.out.println(anytime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));

		System.out.println(anytime.getMonthValue() + "월");
		System.out.println(anytime.getMonth());
		LocalDateTime ti = LocalDateTime.now()
				.withYear(2020).withMonth(7).withDayOfMonth(5) //
				.withHour(15).withMinute(30).withSecond(25); 
		System.out.println(ti.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
				
		//1999년 10월 8일 10:21:?? 출력.
		LocalDateTime myBirth = LocalDateTime.now()
				.withYear(1999).withMonth(10).withDayOfMonth(8) //
				.withHour(10).withMinute(21).withSecond(00); 
		System.out.println(myBirth.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
		

//		now.format(dtf) anytime.format(dtf) => 두개는 비교불가.

	}
}
