package q601;

import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		sc.close();

		char[] strarr = str.toCharArray();
		char[] strarr2 = Arrays.copyOf(strarr,strarr.length);

		for (int i = 0; i < strarr.length; i++) {
			char n = strarr[strarr.length - 1]; // 마지막글자를 n에 대입
			for (int j = 1, k = 0; j < strarr.length; j++, k++) {
				strarr2[j] = strarr[k];
			}
			strarr2[0] = n;
			for (int z = 0; z < strarr.length; z++) {
				System.out.print(strarr2[z]);
				strarr[z] = strarr2[z];
			}
			System.out.println();
		}

	}
}
