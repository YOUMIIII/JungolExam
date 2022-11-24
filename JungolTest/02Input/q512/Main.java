/*
추의 무게를 저장할 변수와 중력의 비율을 저장할 변수를 선언하고,
다음 두 값을 변수에 저장하여 곱셈 계산식을 출력하는 프로그램을 작성하라.
추의 무게 = 49, 중력의 비율 = 0.2683
<출력 예>
49 * 0.268300 = 13.146700
*/

package q512;

public class Main {
	public static void main(String[] args) {
		int x = 49;
		double y = 0.2683;

		System.out.printf("%d * %.6f = %.6f\n", x, y, x * y);
		
//		System.out.printf("%d * %f = %f\n", x, y, x * y);
//		=> 이것도 같은 값이 나오는 이유는 %f가 원래 소수 6자리까지 나오는 성질이 있음.
//		System.out.println(x + " * " + y + " = " + (x * y));
//		=> 이건 자릿수가 맞지 않게 나옴.
	}
}
