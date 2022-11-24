/*
두 개의 실수를 입력받아 모두 4.0 이상이면 "A", 모두 3.0 이상이면 "B",
아니면 "C" 라고 출력하는 프로그램을 작성하시오.
<입력 예>
4.3 3.5
<출력 예>
B
*/

package q532;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double s1 = sc.nextDouble();
		double s2 = sc.nextDouble();
		sc.close();

		if (s1 >= 4.0 && s2 >= 4.0) {
			System.out.println("A");
		} else if (s1 >= 3.0 && s2 >= 3.0) {
			System.out.println("B");
		} else {
			System.out.println("C");
		}
	}
}