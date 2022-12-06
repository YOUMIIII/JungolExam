/*
두 개의 음이 아닌 정수를 입력받아 큰 수의 제곱에서 작은 수의 제곱을 뺀 결과값을 
출력하는 프로그램을 작성하시오.
(두 정수를 전달받아 제곱의 차를 리턴하는 함수를 이용할 것)
*/

package q173;

import java.util.Scanner;

class Calculator {
	private int num1;
	private int num2;
	
	void scan() {
		Scanner sc = new Scanner(System.in);
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		sc.close();
	}

	void result(int a, int b) {
		if (a > b) {
			System.out.print((a * a) - (b * b));
		} else {
			System.out.print((b * b) - (a * a));
		}
	}
	
	int getNum1() {
		return num1;
	}
	
	int getNum2() {
		return num2;
	}
}

public class Main {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.scan();
		cal.result(cal.getNum1(), cal.getNum2());
	}
}
