/*
실수형 변수 두 개를 입력받아서 두 수의 합을 정수로 변환한 결과값과 두 수를 각각 정수로 변환하여
합을 구한 결과값을 출력하는 프로그램을 작성하고 프로그램 내용에 관한 설명을 주석으로 표시하시오. 
<입력 예>
3.4 5.65
<출력 예>
9 8
*/

package q9027;

import java.util.Scanner;

public class Main {
	//③ 실수 두개를 매개변수로 받아 합을 먼저 구한 후 결과를 int(정수)로 타입캐스팅 후 출력
	void preplus(double num1, double num2) {
		double result = num1 + num2;
		System.out.print((int) result + " ");
	}

	//④ 실수 두개를 매개변수로 받아 int(정수)로 타입캐스팅 후 정수의 합을 구해 결과를 출력
	void postplus(double num1, double num2) {
		int result2 = (int) num1 + (int) num2;
		System.out.println(result2);
	}

	public static void main(String[] args) {
		//① 실수형 변수 두개를 입력받음
		Scanner sc = new Scanner(System.in);
		double inp1 = sc.nextDouble();
		double inp2 = sc.nextDouble();
		sc.close();
		
		//② Main 인스턴스 생성하고 메소드를 불러옴
		Main mm = new Main();
		mm.preplus(inp1, inp2);
		mm.postplus(inp1, inp2);
	}
}
