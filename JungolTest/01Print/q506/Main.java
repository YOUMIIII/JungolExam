/*
다음과 같이 출력되는 프로그램을 작성하라.
<출력 예>
My height
170
My weight
68.600000
*/

package q506;

public class Main {
	public static void main(String[] args) {

		String str1 = "My height";
		int h = 170;
		String str2 = "My weight";
		double w = 68.6;

		System.out.println(str1);
		System.out.printf("%d\n", h);
		System.out.println(str2);
		System.out.printf("%.6f\n", w);
	}
}
