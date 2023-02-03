//3과목의 점수를 입력 받아서 평균이 60 미만이거나 1과목이라도 40점 미만이 있으면 "불합격", 아니면 "합격"이라는 메시지를 아래와 같이 출력하는 프로그램을 작성하시오.

package q9093;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("3과목의 점수를 입력하세요. ");
        Scanner sc = new Scanner(System.in);
        int[] inp = new int[3];
        for(int i = 0; i<inp.length; i++){
            inp[i] = sc.nextInt();
        }
        sc.close();

        int sum = 0;
        for(int i = 0; i<inp.length; i++){
            sum += inp[i];
        }
        if((sum/inp.length)<60 || inp[0] < 40 || inp[1] < 40 || inp[2] < 40){
            System.out.println("불합격");
        } else{
            System.out.println("축하합니다. 합격입니다.");
        }
    }
}
