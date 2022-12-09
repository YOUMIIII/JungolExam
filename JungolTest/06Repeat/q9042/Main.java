/*
정수를 계속 입력을 받다가 0이 입력되면 0을 제외하고 이전에 입력된 자료의 수와 합계, 평균을 출력하는 프로그램을 작성하시오. (평균은 반올림하여 소수 둘째자리까지 출력한다.)

<입력 예>
15 88 97 0
<출력 예>
입력된 자료의 개수 = 3
입력된 자료의 합계 = 200
입력된 자료의 평균 = 66.67
*/

package q9042;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int count = 0;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		while (true) {
			int num = sc.nextInt();
			sum += num;
			if (num == 0) {
				sc.close();
				break;
			}
			count++;
		}

		System.out.println("입력된 자료의 개수 = " + count);
		System.out.println("입력된 자료의 합계 = " + sum);
		System.out.printf("입력된 자료의 평균 = %.2f", (double) sum / count);
	}
}
