//5명의 성적을 입력받아서 총점과 평균을 출력하는 프로그램을 작성하시오. (평균은 반올림하여 소수 첫째자리까지 출력한다.)

package q9052;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] score = new int[5];
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < score.length; i++) {
            score[i] = sc.nextInt();
            sum += score[i];
        }
        System.out.println("총점 : " + sum);
        System.out.printf("평균 : %.1f", ((double)sum/5));
    }
}
