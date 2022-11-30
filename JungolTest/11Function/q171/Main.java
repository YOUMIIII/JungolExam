/*
1부터 전달받은 수까지의 합을 출력하는 함수를 작성하고 1000 이하의 자연수를 입력받아 작성한 함수로 전달하여 출력하는 프로그램을 작성하시오.
*/

package q171;

import java.util.Scanner;

public class Main {
	private int inp;
	int sum = 0;

	void input() {
		Scanner sc = new Scanner(System.in);
		inp = sc.nextInt();
		sc.close();
	}

	int calculate() {
		for (int i = 1; i <= inp; i++) {
			sum += i;
		}
		return sum;
	}

	public static void main(String[] args) {
		Main mm = new Main();
		mm.input();
		System.out.println(mm.calculate());
	}
}
