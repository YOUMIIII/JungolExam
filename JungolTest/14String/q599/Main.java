package q599;
/*문자열을 입력받아 알파벳 문자만 모두 대문자로 출력하는 프로그램을 작성하시오.
문자열의 길이는 100이하이다.
입력 예 : 1988-Seoul-Olympic!!!
출력 예 : SEOULOLYMPIC
*/

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();

		String str2 = str.toUpperCase();
		for (int i = 0; i < str2.length(); i++) {
			if (str2.charAt(i) >= 65 && str2.charAt(i) <= 90) {
				System.out.print(str2.charAt(i));
			}
		}

		// 2.
//		for (int i = 0; i < str.length(); i++) {
//			if (str.charAt(i) >= 65 && str.charAt(i) <= 90) {
//				System.out.print((char)str.charAt(i));
//			} else if (str.charAt(i) >= 97 && str.charAt(i) <= 122) {
//				System.out.print((char)(str.charAt(i) - 32));
//			}
//		}

		// 1.
//		char[] inp = new char[str.length()];
//
//		for (int i = 0; i < str.length(); i++) {
//			inp[i] = str.charAt(i);
//		}
//
//		for (int i = 0; i < str.length(); i++) {
//			if (inp[i] >= 65 && inp[i] <= 90) {
//				System.out.print((char) inp[i]);
//			} else if (inp[i] >= 97 && inp[i] <= 122) {
//				System.out.print((char) (inp[i] - 32));
//			}
//		}
	}
}
