package co.yedam.generic.board;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class ListExample {
	public static void main(String[] args) {
		Board b1 = new Board("이것이 자바다", "자바..어렵다..");
		Board b2 = new Board("알랍초콜릿", "오늘 박미경쌤이 초콜릿 사주셨삼");
		Board b3 = new Board("날씨베리핫", "며칠이 지나면 시원하게쮜");

		BoardDAO dao = new BoardDAO();
		dao.insertBoard(b1);
		dao.insertBoard(b2);
		dao.insertBoard(b3);

		// Map 형식으로 리스트를 보여준다.
		Map<String, String> map = dao.getBoards();
		Set<String> set = map.keySet();
		Iterator<String> iter = set.iterator();
		System.out.println("          < map 으로 가져온 리스트>");
		while (iter.hasNext()) {
			String key = iter.next();
			System.out.println("제목: " + key + ", 내용: " + map.get(key));

		}
		ArrayList<Board> list = dao.getBoardList();
//		for (Board board : list) {
//			System.out.println(board.toString());
//		}

		Scanner scn = new Scanner(System.in);
		System.out.println("수정할 글 제목을 입력: ");
		String search = scn.nextLine();
		System.out.println("변경할 내용을 입력: ");
		String changeContent = scn.nextLine();
		Board arg = new Board(search, changeContent);

//	dao.updateBoard(search, chageContent);
		dao.updateBoard(arg);

		list = dao.getBoardList();
		for (Board board : list) {
			System.out.println(board.toString());
		}
		scn.close();
	}
}