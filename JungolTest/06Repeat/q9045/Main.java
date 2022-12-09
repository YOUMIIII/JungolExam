/*
아래 예와 같이 메시지를 출력하고 숫자를 입력받아 선택한 번호에 해당하는 메시지를 출력하는 작업을 반복하다가 4가 입력되면 메시지 출력 후 종료하는 프로그램을 작성하시오. (1~4 이외의 수가 입력되면 "잘못 선택하였습니다." 라고 출력한다.)
1. 입력하기
2. 출력하기
3. 삭제하기
4. 끝내기
작업할 번호를 선택하세요. 2

출력하기를 선택하였습니다.

1. 입력하기
2. 출력하기
3. 삭제하기
4. 끝내기
작업할 번호를 선택하세요. 5

잘못 선택하였습니다. 

1. 입력하기
2. 출력하기
3. 삭제하기
4. 끝내기
작업할 번호를 선택하세요. 4

끝내기를 선택하였습니다.
*/

package q9045;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		for (;;) {
			System.out.println("1. 입력하기");
			System.out.println("2. 출력하기");
			System.out.println("3. 삭제하기");
			System.out.println("4. 끝내기");
			System.out.print("작업할 번호를 선택하세요. ");
			num = sc.nextInt();
			System.out.println();
			if (num == 1) {
				System.out.println("입력하기를 선택하였습니다.");
				System.out.println();
				continue;
			} else if (num == 2) {
				System.out.println("출력하기를 선택하였습니다.");
				System.out.println();
				continue;
			} else if (num == 3) {
				System.out.println("삭제하기를 선택하였습니다.");
				System.out.println();
				continue;
			} else if (num == 4) {
				System.out.println("끝내기를 선택하였습니다.");
				sc.close();
				break;
			} else {
				System.out.println("잘못 선택하였습니다.");
				System.out.println();
				continue;
			}
		}
	}
}
