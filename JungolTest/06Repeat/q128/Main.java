/*
0 이 입력될 때까지 정수를 계속 입력받아 3의 배수와 5의 배수를 제외한 수들의 개수를 출력하는 프로그램을 작성하시오.
<입력 예>
1 2 3 4 5 6 7 8 9 10 0
<출력 예>
5
*/

package q128;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;

		
//		1. do -while문
//		-----------------------------------
//		do {
//			int num = sc.nextInt();
//			if (num == 0) {
//				sc.close();
//				break;
//			} else if (num % 5 != 0 && num % 3 != 0) {
//				count++;
//			}
//		} while (true);
		
		
//		2. while문
//		-----------------------------------
		while (true) {
			int num = sc.nextInt();
			if (num == 0) {
				sc.close();
				break;
			}
			if (num % 3 != 0 && num % 5 != 0) {
				count++;
			}
		}
		System.out.print(count);
	}
}
