/*
문자를 입력받아서 입력받은 문자를 20번 반복하여 출력하는 프로그램을 작성하시오.
<입력 예>
A
<출력 예>
AAAAAAAAAAAAAAAAAAAA
*/

package q541;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char inp = sc.next().charAt(0);
		sc.close();

//		for (int i = 0; i < 20; i++) {
//			System.out.print(inp);
//		}

		int j = 0;
		while (j < 20) {
			System.out.print(inp);
			j++;
		}
	}
}
