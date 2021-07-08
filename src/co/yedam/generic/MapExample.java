package co.yedam.generic;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();

		map.put("보라돌이", 100);
		map.put("뚜비", 90);
		map.put("나나", 80);
		map.put("뽀", 80);

		Integer val = map.get("보라돌이");
		System.out.println(val);

		Set<String> keys = map.keySet(); // map컬렉션에 있는 키값만 set컬렉션으로 가져온다.
		Iterator<String> iter = keys.iterator();
		while (iter.hasNext()) {
			String key = iter.next(); // 키 값을 set컬렉션에 가져와서
			Integer value = map.get(key); // 키를 활용하여 value를 읽어오겠습니다.
			System.out.println("key: " + key + ", val: " + value);
		}
	}
}
