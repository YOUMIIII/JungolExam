/*
10 이하의 두 개의 양의 정수를 입력받아서 작은 수부터 큰 수까지의 구구단을
차례대로 출력하는 프로그램을 구조화하여 작성하시오.
*/

package q578;

import java.util.Scanner;

public class Main {
	private int num1;
	private int num2;

	public void scan() {
		Scanner sc = new Scanner(System.in);
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		sc.close();
	}

	public void swap() {
		if (num1 > num2) {
			int tmp = 0;
			tmp = num2;
			num2 = num1;
			num1 = tmp;
		}
	}

	public void out() {
		for (; num1 <= num2; num1++) {
			System.out.println("== " + num1 + "dan ==");
			for (int i = 1; i < 10; i++) {
				System.out.printf("%d * %d = %2d\n", num1, i, num1 * i);
			}
			System.out.println();

			
//	int getNum1() {
//		int tmp=0;
//		if (num1 > num2) {
//			tmp = num2;
//			num2 = num1;
//			num1 = tmp;
//		}return num1;
//	}
//
//	int getNum2() {
//		return num2;
//	}
//
//	void out(int num1, int num2) {
//		for (; num1 <= num2; num1++) {
//			System.out.println("== " + num1 + "dan ==");
//			for (int i = 1; i < 10; i++) {
//				System.out.printf("%d * %d = %2d\n", num1, i, num1 * i);
//			}
//			System.out.println();
//		}
//	}

		}
	}

	public static void main(String[] args) {
		Main mm = new Main();
		mm.scan();
		mm.swap();
		mm.out();
//		mm.out(mm.getNum1(), mm.getNum2());

	}
}
