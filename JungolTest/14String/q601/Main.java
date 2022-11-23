package q601;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();

		char[] strarr = new char[str.length()];
		char[] strarr2 = new char[str.length()];

		for (int i = 0; i < str.length(); i++) {
			strarr[i] = str.charAt(i);
			strarr2[i] = str.charAt(i);
		}

		for (int i = 1; i <= str.length(); i++) {
			char n = strarr[str.length() - 1];
			for (int j = 0, k = 1; k < str.length(); j++, k++) {
				strarr[k] = strarr2[j];
			}
			strarr[0] = n;
			for (int k = 0; k < str.length(); k++) {
				System.out.print(strarr[k]);
				strarr2[k] = strarr[k];
			}
			System.out.println();
		}
	}
}
