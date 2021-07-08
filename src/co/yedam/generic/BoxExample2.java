package co.yedam.generic;

import java.util.ArrayList;
import java.util.List;

// List 컬렉션 : 배열처럼 여러 인스턴스를 저장하고자 하는 용도.
public class BoxExample2 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>(); //
		list.add("Hello!");
//		list.add(10); : ; 컴파일 단계에서 에러발생.
//		list.add(new Orange());

		for (int i = 0; i < list.size(); i++) {
			String val = (String) list.get(i); // list[i];
			System.out.println(val);
		}

		String[] names = new String[10];
		for (int i = 0; i < list.size(); i++)
			names[i] = new String("" + i);

		for (int i = 0; i < list.size(); i++)
			list.add(new String("" + i) );

	}
}