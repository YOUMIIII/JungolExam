/*
10 이하의 정수를 입력받아 입력받은 정수만큼 "C언어 프로그래밍"이라고 출력하는 프로그램을 작성하시오. 
*/
package q9046;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		for(int i = 0; i<num; i++) {
			System.out.println("C언어 프로그래밍");
		}
	}
}
