/*
10개의 정수를 입력받아 3의 배수의 개수와 5의 배수의 개수를 각각 출력하는 프로그램을 작성하시오.
*/

package q545;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[10];
		int count3 = 0;
		int count5 = 0;
		for(int i =0; i<num.length; i++) {
			num[i]=sc.nextInt();
		}
		sc.close();
		
		for(int i = 0; i<num.length; i++) {
			if(num[i] % 3 == 0) {
				count3++;
			}
			if(num[i] % 5 == 0) {
				count5++;
			}
		}
		
		System.out.println("Multiples of 3 : " + count3);
		System.out.println("Multiples of 5 : " + count5);
	}
}
