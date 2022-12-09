/*
자연수를 입력받아서 1부터 입력받은 수까지의 합을 출력하는 프로그램을 작성하시오.
*/

package q9050;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		int sum = 0;
		
		for(int i = 1; i <= num; i++) {
			sum += i;
		}
		
		System.out.print(sum);
	}
}
