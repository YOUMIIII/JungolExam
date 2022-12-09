/*
정수를 계속 입력 받다가 0이 입력되면 입력된 수중 홀수의 합과 평균을 출력하는 프로그램을 작성하시오. (정수 미만은 버림)
<입력 예>
5 8 17 6 31 0
<출력 예>
홀수의 합 = 53
홀수의 평균 = 17
*/

package q9043;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int count = 0;
		for (;;) {
			int num = sc.nextInt();
			if (num == 0) {
				sc.close();
				break;
			} else if (num % 2 == 1) {
				sum += num;
				count++;
			}
		}

		System.out.println("홀수의 합 = " + sum);
		System.out.println("홀수의 평균 = " + sum / count);
	}
}
