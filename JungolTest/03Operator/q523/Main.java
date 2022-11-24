/*
두 개의 정수를 입력받아서 다음과 같이 4가지 관계연산자의 결과를 출력하시오.
이때 입력받은 두 정수를 이용하여 출력하시오.
 (JAVA는 1이면 true, 0이면 false를 출력한다.)
*/

package q523;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();

		// 1.

//		System.out.printf("%d > %d --- %b\n", a, b, a > b);
//		System.out.printf("%d < %d --- %b\n", a, b, a < b);
//		System.out.printf("%d >= %d --- %b\n", a, b, a >= b);
//		System.out.printf("%d <= %d --- %b\n", a, b, a <= b);

		// 2.
		System.out.print(a + " > " + b + " --- ");
		System.out.println(a>b); // 아래 코드는 이거랑 결국 같음.

		System.out.print(a + " < " + b + " --- ");
		if (a < b)
			System.out.println(true);
		else
			System.out.println(false);

		System.out.print(a + " >= " + b + " --- ");
		if (a >= b)
			System.out.println(true);
		else
			System.out.println(false);

		System.out.print(a + " <= " + b + " --- ");
		if (a <= b)
			System.out.println(true);
		else
			System.out.println(false);
	}
}
