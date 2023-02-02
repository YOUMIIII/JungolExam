//자연수 N과 M을 입력 받아서 주사위를 N번 던져서 나온 눈의 합이 M이 나올 수 있는 모든 경우를 출력하는 프로그램을 작성하시오.

package q1175;

import java.util.Scanner;

public class Main {
    private static int ar[];
    private static int n, m;

    public static void dice(int p) {
        if (p == n) {
            int sum = 0;
            for(int i = 0; i < ar.length; i++){
                sum += ar[i];
            }
            if(sum == m){
                for(int i = 0; i<ar.length; i++){
                    System.out.print(ar[i] + " ");
                }
                System.out.println();
            }
            return;
        }

        for (int i = 1; i <= 6; i++) {
            ar[p] = i;
            dice(p + 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        sc.close();

        ar = new int[n];

        dice(0);
    }
}