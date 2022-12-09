/*
10개의 정수를 입력받아 그 수들 중 짝수의 개수가 몇 개인지 출력하는 프로그램을 작성하시오.
*/

package q9051;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numarr = new int[10];
		for(int i = 0; i<numarr.length; i++) {
			numarr[i] = sc.nextInt();
		}
		sc.close();
		
		int count = 0;
		
		for(int i = 0; i<numarr.length; i++) {
			if(numarr[i] % 2 == 0) {
				count++;
			}
		}
		
		System.out.println("입력받은 짝수는 " + count + "개입니다.");
	}
}
