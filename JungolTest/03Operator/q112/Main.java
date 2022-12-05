package q112;

import java.util.Scanner;

public class Main {
	Main(int a, int b) {
		if (a > b) {
			System.out.printf("%d / %d = %d...%d", a, b, a / b, a % b);
		} else {
			System.out.printf("%d / %d = %d...%d", b, a, b / a, b % a);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();

		new Main(a, b);
	}
}
