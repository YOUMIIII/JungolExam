//4자리 이하의 10개의 정수를 입력받아 짝수 중 가장 큰 값과 홀수 중 가장 작은 값을 출력하는 프로그램을 작성하시오.

package q9071;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] inp = new int[10];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<inp.length; i++){
            inp[i] = sc.nextInt();
        }
        sc.close();

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i<inp.length; i++){
            if(inp[i] % 2 == 0){
                if(inp[i] > max){
                    max = inp[i];
                }
            }else{
                if(inp[i] < min){
                    min = inp[i];
                }
            }
        }

        System.out.println(min + " " + max);
    }
}
