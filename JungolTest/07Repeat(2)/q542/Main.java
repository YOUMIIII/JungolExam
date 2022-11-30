/*
10부터 20까지의 숫자를 차례대로 출력하는 프로그램을 작성하시오.
*/

package q542;

public class Main {
	public static void main(String[] args) {
		for (int i = 10; i <= 20; i++) {
			System.out.print(i + " ");
		}

		System.out.println();

		int j = 10;
		while (j <= 20) {
			System.out.print(j++ + " ");
		}

		System.out.println();
		
		int k = 10;
		do {
			System.out.print(k++ + " ");
		} while (k <= 20);
	}
}
