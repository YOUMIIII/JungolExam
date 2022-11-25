package q2046;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.close();

		for (int i = 1; i <= n; i++) {
			switch (m) {
			case 1:
				for (int j = 1; j <= n; j++) {
					System.out.print(i + " ");
				}
				System.out.println();
				break;
			case 2:
				if (i % 2 == 1) {
					for (int j = 1; j <= n; j++) {
						System.out.print(j + " ");
					}
					System.out.println();
				} else {
					for (int j = n; j >= 1; j--) {
						System.out.print(j + " ");
					}
					System.out.println();
				}
				break;
			case 3:
				int k = i;
				for (int j = 0; j < n; j++) {
					System.out.print(k + " ");
					k += i;
				}
				System.out.println();
				break;
			}
		}
//		for (int i = 1; i <= n; i++) {
//			for (int j = 1; j <= n; j++) {
//				System.out.print(i + " ");
//			}
//			System.out.println();
//		}
//
//		for (int i = 1; i <= n; i++) {
//			if (i % 2 == 1) {
//				for (int j = 1; j <= n; j++) {
//					System.out.print(j + " ");
//				}
//				System.out.println();
//			} else {
//				for (int j = n; j >= 1; j--) {
//					System.out.print(j + " ");
//				}
//				System.out.println();
//			}
//		}
//
//		for (int i = 1; i <= n; i++) {
//			int k = i;
//			for (int j = 0; j < n; j++) {
//				System.out.print(k + " ");
//				k += i;
//			}
//			System.out.println();
//		}
	}
}
