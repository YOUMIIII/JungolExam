/*
0 이상의 정수들이 공백으로 구분되어 반복적으로 주어진다.
0이 입력되면 반복문을 멈추고 그 전까지 입력받은 수들에 대하여
홀수의 개수와 짝수의 개수를 출력하는 프로그램을 작성하시오.
*/
package q126;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int odd = 0;
		int even = 0;

		while (true) {
			int a = sc.nextInt();
			if (a == 0) {
				break;
			} else if (a % 2 == 1) {
				odd++;
			} else {
				even++;
			}
		}
		sc.close();
		System.out.println("odd : " + odd);
		System.out.println("even : " + even);
	}
}
