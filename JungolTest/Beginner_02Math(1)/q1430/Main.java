package q1430;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();

        String result = "" + (a * b * c);
//		System.out.println(result);
        int[] number = new int[result.length()];
        int[] number2 = new int[10];

        for (int i = 0; i < number.length; i++) {
            number[i] = (int) result.charAt(i) - 48;
        }
//		for (int i = 0; i < number.length; i++) {
//			System.out.println(number[i]);
//		}

        for (int i = 0; i < number2.length; i++) {
            for (int j = 0; j < number.length; j++) {
                if (i == number[j]) {
                    number2[i]++;
                }
            }
        }

        for (int i = 0; i < number2.length; i++) {
            System.out.println(number2[i]);
        }
    }
}