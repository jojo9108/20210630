package practice;

import java.util.Scanner;

public class RPS {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("게임을 시작합니다.\n");

		while (scn.hasNextLine()) {
			String str = scn.nextLine();
			if(str.equals("종료"))
				break;
			
			int ran = (int) (Math.random() * 3) + 1;
			String com = "";
			if (ran == 1)
				com = "가위";
			else if (ran == 2)
				com = "바위";
			else
				com = "보";
			
			System.out.println("컴퓨터 : " + com + ", 나 : " + str);
			if (str.equals("가위"))
				if (com.equals("보"))
					System.out.println("You Win!!");
				else if (com.equals("바위"))
					System.out.println("You lose..");
			
			if (str.equals("바위"))
				if (com.equals("가위"))
					System.out.println("You Win!!");
				else if (com.equals("보"))
					System.out.println("You lose..");
			
			if (str.equals("보"))
				if (com.equals("바위"))
					System.out.println("You Win!!");
				else if (com.equals("가위"))
					System.out.println("You lose..");
			
			if (str.equals(com))
				System.out.println("Draw~~");
			System.out.println();
			System.out.println("게임을 시작합니다.\n");
		}
		
		System.out.println("게임을 종료합니다.");
	}
}
