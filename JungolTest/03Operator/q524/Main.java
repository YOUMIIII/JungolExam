/*
2개의 정수를 입력 받아서 0이 아니면 참(true), 0이면 거짓(false)으로 처리하고
두 값의 논리곱과 논리합의 결과를 출력하는 프로그램을 작성하시오.
<입력 예>
2 0
<출력 예>
false true
*/

package q524;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();

		boolean c = (num != 0);
		boolean d = (num2 != 0);

		System.out.println((c && d) + " " + (c || d));


//		2.
//		System.out.println("-------------------------");

//		if (num != 0 && num2 != 0) {
//			System.out.print(true);
//		} else {
//			System.out.print(false);
//		}
//
//		System.out.print(" ");
//
//		if (num != 0 || num2 != 0) {
//			System.out.print(true);
//		} else {
//			System.out.print("false");
//		}
	}
}
