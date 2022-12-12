/*
사용자 정의 함수를 만들어 선을 그리는 프로그램을 작성하시오.
'=' : 30개
<출력 예>
==============================
line 함수를 호출하였습니다.
line 함수를 다시 호출합니다. 
==============================

*/

package q9081;

public class Main {
	void line() {
		for (int i = 0; i < 30; i++) {
			System.out.print('=');
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Main mm = new Main();
		mm.line();
		System.out.println("line 함수를 호출하였습니다.");
		System.out.println("line 함수를 다시 호출합니다.");
		mm.line();
	}
}
