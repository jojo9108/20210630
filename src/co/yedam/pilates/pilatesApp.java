package co.yedam.pilates;

import java.util.Scanner;

public class pilatesApp {

	private static pilatesApp singleton = new pilatesApp();

	pilatesApp() {
	}

	public static pilatesApp getInstance() {
		return singleton;
	}

	Member[] members = new Member[10];
	Scanner scn = new Scanner(System.in);

	public void main() {

		// 초기 데이터 생성 이유: 테스트 데이터를 입력하는 수고를 줄이기 위해서...
		members[0] = new Member(1, "Hong", "01012345671", "990101", Gender.MEN);
		members[1] = new Member(2, "Bak", "01012345672", "991008", Gender.WOMEN);
		members[2] = new Member(3, "Kim", "01012345673", "990301", Gender.WOMEN);
		members[3] = new Member(4, "Lee", "01012345674", "960206", Gender.MEN);
		// 1.입력, 2.수정, 3.삭제, 4.회원리스트, 5.이름조회, 6.상세조회, 9.종료

		while (true) {
			showMenu();
			int menu = scn.nextInt();
			scn.nextLine();

			if (menu == 1) {
				memberAdd();
			} else if (menu == 2) {
				memberEdit();
			} else if (menu == 3) {
				memberDelete();
			} else if (menu == 4) {
				memberList();
			} else if (menu == 5) {
				searchByName();
			} else if (menu == 6) {
				memberDetail();
			} else if (menu == 9) {
				break;
			}

		}
		System.out.println("프로그램을 종료합니다.");

	}

	public void memberEdit() {
		int editID = scanInt("수정하실 ID를 선택하세요.");
		scn.nextLine();
		boolean exist = false;
		for (int i = 0; i < members.length; i++) {
			if (members[i] != null && members[i].getMemberId() == editID) {
				String nameEdit = scanString("이름 > ");
				String phoneEdit = scanString("연락처 > ");
				String birthEdit = scanString("생년월일 > ");

				if (!nameEdit.equals("")) {
					members[i].setName(nameEdit);
					exist = true;
				}
				if (!phoneEdit.equals("")) {
					members[i].setMemberphone(phoneEdit);
					exist = true;
				}
				if (!birthEdit.equals("")) {
					members[i].setMemberbirth(birthEdit);
					exist = true;
				}
				if (exist) {
					System.out.println("수정되었습니다.");
				}

			}

		}
	}

	public void memberDetail() {
		int detail = scanInt("상세조회를 하실 ID를 입력하세요.");	
		scn.nextLine();
		for (int i = 0; i < members.length; i++) {
			if (members[i] != null && members[i].getMemberId() == detail) {
				System.out.println("========================================");
				System.out.printf(members[i].getDetail());
				System.out.println("\n========================================");
				break;
			}
		}
	}

	public void memberDelete() {
		int delID = scanInt("삭제하실 ID를 입력하세요.");
		for (int i = 0; i < members.length; i++) {
			if (members[i] != null && members[i].getMemberId() == delID) {
				members[i] = null;
				System.out.println("1건 삭제되었습니다.");
				break;
			}
		}
	}

	public void searchByName() {
		String name = scanString("조회하실 이름을 입력하세요.");
		boolean exist = false;
		for (int i = 0; i < members.length; i++) {
			if (members[i] != null && members[i].getName().equals(name)) {
				System.out.println(members[i].showInfo());
				exist = true;
			}
		}
		if (!exist) {
			System.out.println("이런 이름은 없습니다~~");
		}

	}

	public void memberList() {
		boolean exist = false;
		for (int i = 0; i < members.length; i++) {
			if (members[i] != null) { // null값이 아닌 경우에만 출력
				System.out.println(members[i].showInfo());
				exist = true;
			}

		}
		if (!exist) {
			System.out.println("회원정보가 없습니다.");
		}
	}

	public void memberAdd() {
		String name = scanString("이름을 입력하세요 > ");
		String phone = scanString("연락처 > ");
		String birth = scanString("생년월일을 입력하세요 > ");
		Gender gender = scnGen("성별 (1: 남, 2: 여) > ");
		System.out.println("1건이 입력되었습니다.");

		Member member = new Member(getNextId(), name, phone, birth, gender);

		for (int i = 0; i < members.length; i++) {
			if (members[i] == null) { // 입력시 비워져 있는 곳에 입력.
				members[i] = member;
				break; // 비어있는 위치에 한건 입력 후 종료.
			}
		}

	} // add

	public String scanString(String arg) { // 입력메시지 출력 후 문자입력값을 반환.
		System.out.println(arg);
		String val = scn.nextLine();
		return val;
	}

	public int scanInt(String arg) {
		int val = 0;
		while (true) {
			try {
				System.out.println(arg);
				val = scn.nextInt();
				break;
			} catch (Exception e) {
				System.out.println("숫자만 입력가능합니다.");
				scn.nextLine();
			}
		}
		return val;
	}

	public Gender scnGen(String arg) { // 입력메시지 출력 후 Gender 반환.
		Gender gender = null;
		while (true) {
			try {
				System.out.println(arg); // 예외(에러)가 발생하면 에러메시지 출력 후 다시 입력 메시지.
				int gen = scn.nextInt();
				if (gen == 1) {
					gender = Gender.MEN;
				} else if (gen == 2) {
					gender = Gender.WOMEN;
				} else {
					System.out.println("1 또는 2 입력하세요.");
					continue; // 반목문 탈출 못하도록...
				}
				break;
			} catch (Exception e) {
				System.out.println("숫자를 입력하세요.");
				scn.nextLine();
			}
		}
		return gender;
	}

	public int getNextId() {
		// 회원번호 가입순서 => 1, 2, , , 5, 6, 7 ...
		int memberId = 0;
		for (int i = 0; i < members.length; i++) {
			if (members[i] != null) { // 현재 멤버아이디 중에서 최고번호.
				if (members[i].getMemberId() > memberId) {
				}
			}
		}
		memberId++;

		return memberId;

	}

	public void showMenu() {
		System.out.println("---------------------------------------------------------");
		System.out.println("1.입력 | 2.수정 | 3.삭제 | 4.회원리스트 | 5.이름조회 | 6.상세조회 | 9.종료");
		System.out.println("---------------------------------------------------------");
		System.out.println("선택 > ");
	}

}
