/*
1부터 어떤 양의 정수 n까지의 정수를 모두 곱한 것을 말하며 n!로 나타낸다.
0! = 1
1! = 1
2! = 2
n! = n * (n-1)!
：
와 같이 정의된다.

예로 4! = 4×3×2×1 = 24 이다.
n! 이 주어졌을 때 결과를 출력하는 프로그램을 작성하라.

* 결과가 int범위를 넘는 경우 자료형 long long 
입력/출력 서식문자 %lld 를 사용한다.

<입력형식>
입력은 한 줄로 이뤄지며 팩토리얼의 숫자 n(1≤n≤15)이 입력된다.
<출력형식>
n!에 대한 계산 결과를 "출력예"처럼 과정을 출력하고 마지막에 결과를 출력한다.
*/

package q1309;

import java.util.Scanner;

public class Main {
	static long method(int n) {
		if (n == 1) {
			System.out.printf("%d! = %d\n", n, n);
			return 1;
		} else {
			System.out.printf("%d! = %d * %d!\n", n, n, n - 1);
			return n * method(n - 1);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();

		long result = method(num);
		System.out.println(result);
	}
}
