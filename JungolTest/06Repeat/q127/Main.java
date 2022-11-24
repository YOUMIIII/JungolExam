/*
0 부터 100 까지의 정수를 계속 입력받다가 범위를 벗어나는 수가 입력되면 
그 이전까지 입력된 자료의 합계와 평균을 출력하는 프로그램을 작성하시오.
(평균은 반올림하여 소수 첫째자리까지 출력한다.)
<입력 예>
55 100 48 36 0 101
<출력 예>
sum : 239
avg : 47.8
*/

package q127;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int sum = 0;
		int count = 0;

		for (;;) {
			int a = sc.nextInt();
			if (a < 0 || a > 100) {
				sc.close();
				break;
			} else {
				sum += a;
				count++;
			}
		}
		System.out.println("sum : " + sum);
		System.out.printf("avg : %.1f", (float) sum / count);
	}
}
