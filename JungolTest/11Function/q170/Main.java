/*
‘@’문자를 10개 출력하는 함수를 작성 한 후 함수를 세 번 호출하여 아래와 같이 출력하는 프로그램을 작성하시오.
<출력 예>
first
@@@@@@@@@@
second
@@@@@@@@@@
third
@@@@@@@@@@
*/

package q170;

public class Main {
	void printAt(char a) {
		for(int i = 0; i<10; i++) {
			System.out.print(a);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Main mm = new Main();
		
		String[] str = {"first", "second", "third"};
		for(int i = 0; i<str.length; i++) {
			System.out.println(str[i]);
			mm.printAt('@');
		}
		
//		System.out.println("first");
//		mm.printAt('@');
//		
//		System.out.println("second");
//		mm.printAt('@');
//		
//		System.out.println("third");
//		mm.printAt('@');
	}
}
