/*
삼각형의 밑변의 길이와 높이를 입력받아 넓이를 출력하고, "Continue? "에서 하나의 문자를 입력받아 그 문자가 'Y' 나 'y' 이면 작업을 반복하고 다른 문자이면 종료하는 프로그램을 작성하시오.
(넓이는 반올림하여 소수 첫째자리까지 출력한다.)​
*/

package q129;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean a = true;
		while (a) {
			System.out.print("Base = ");
			int base = sc.nextInt();
			System.out.print("Height = ");
			int height = sc.nextInt();
			System.out.printf("Triangle width = %.1f\n", (double) base * height / 2);
			System.out.print("Continue? ");
			char yorn = sc.next().charAt(0);
			if (yorn != 'Y' && yorn != 'y') {
				sc.close();
				a = false;
			}
		}
	}
}
