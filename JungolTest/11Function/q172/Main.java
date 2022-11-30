/*
자연수를 입력받아 아래와 같은 사각형을 출력하는 프로그램을 작성하시오.
주어지는 수는 100이하의 자연수이다.
(함수를 작성하시오.)
*/

package q172;

import java.util.Scanner;

public class Main {

	void prt(int num) {
		for (int i = 1; i <= num; i++) {
			int ininum = 0;
			for (int j = 0; j < num; j++) {
				ininum += i;
				System.out.print(ininum + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();

		Main mm = new Main();
		mm.prt(num);
	}
}
