//1부터 10까지의 정수를 입력받다가 입력된 정수가 범위를 벗어나면 그 때까지 1번 이상 입력된 각 숫자의 개수를 작은 수부터 출력하는 프로그램을 작성하시오.

package q9074;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] inp = new int[100];
        int i = 0;
        boolean term = true;
        while (term) {
            inp[i] = sc.nextInt();
            if (inp[i] < 1 || inp[i] > 10) {
                term = false;
            }
            i++;
        }
        sc.close();
        int[] ten = new int[10];
        for (int j = 0; j < inp.length; j++) {
            if (inp[j] != 0) {
                ten[inp[j] - 1]++;
            }
        }
        for (int k = 0; k < ten.length; k++) {
            if (ten[k] != 0) {
                System.out.println((k + 1) + " : " + ten[k] + "개");
            }
        }
    }
}
