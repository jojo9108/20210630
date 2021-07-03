package practice;

import java.util.Scanner;

public class ThisIsMe {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("게임을 시작합니다.\n");
		
		String[] strArr = {"가위", "바위", "보"};

		while(input.hasNextLine()) {
			String str = input.nextLine();
			if(str.equals("종료")) break;
			
			int me = 0;
			if(str.equals("가위")) me = 1;
			else if(str.equals("바위")) me = 2;
			else me = 3;
			
			int com = (int) (Math.random() * 3) + 1;
			
			System.out.println("컴퓨터 : " + strArr[com-1] + ", 나 : " + strArr[me-1]);
			int calc = me - com; 
			if(calc == 0)
				System.out.println("비겼다제~");
			else if((calc == 1) || (calc == -2))
				System.out.println("이겼다제!!");
			else
				System.out.println("졌다제...");
			System.out.println("\n게임을 시작합니다.\n");
		}
		
		System.out.println("게임을 종료합니다.");
	}

}
