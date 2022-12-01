/*
1~12사이의 정수를 입력받아 입력받은 월을 입력받아 평년의 경우 해당 월의 날수를 출력하는 프로그램을 작성하시오.
*/
package q124;

import java.util.Scanner;

public class Main {
	int month;
	int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public void scan(){
		Scanner sc = new Scanner(System.in);
		month = sc.nextInt();
		sc.close();
	}
	
	int day(int month) {
		return days[month-1];
	}
	
	
	public static void main(String[] args) {
		Main mm = new Main();
		mm.scan();
		int day = mm.day(mm.month);
		System.out.println(day);
	}
}
