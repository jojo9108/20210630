package practice;

public class ArrayExample3 {
	public static void main(String[] args) {
		// 크기순 정렬하기.
		int num1 = (int) (Math.random() * 25); // (int) (Math.random() * 25);		
		int num2 = num1;
		while(num1 == num2)
		num2 = (int) (Math.random() * 25);
		int num3 = num2;
		while(num2 == num3)
		num3 = (int) (Math.random() * 25);
		int[] intAry = new int[3];
		intAry[0] = num1;
		intAry[1] = num2;
		intAry[2] = num3;
		for (int i = 0; i < intAry.length - 1; i++) {
			for (int j = i + 1; j < intAry.length; j++) {
				int min = i;
				if (intAry[j] < intAry[min]) {
					min = j;
				}
				int temp = intAry[min];
				intAry[min] = intAry[i];
				intAry[i] = temp;
			}

		}
		for (int a = 0; a < intAry.length; a++) {
			System.out.println(intAry[a]);
		}

	}
}
