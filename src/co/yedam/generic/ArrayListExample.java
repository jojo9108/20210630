package co.yedam.generic;

import java.util.*;

public class ArrayListExample {
	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("권가영");
		names.add("박주현");
		names.add("홍미림");
		names.add(1, "보라돌이");
//		names.add(5, "뚜비"); 인덱스 범위 내에서만 추가.
		names.remove(0);
//		names.remove("보라돌이");
//		names.clear();

		System.out.println("크기: " + names.size()); // java.lang.String

		for (int i = 0; i < names.size(); i++) {
			System.out.println("i: " + i + ", name: " + names.get(i));
		}
		names = new LinkedList<String>();
	}
}
