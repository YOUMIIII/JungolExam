//10 이하의 자연수 n을 입력받고 n개의 정수를 입력받아 내림차순으로 정렬하여 출력하는 프로그램을 작성하시오. (배열을 전달하는 함수를 이용한다.)

package q579;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        int[] inp = new int[n];
        for(int i = 0; i<inp.length; i++){
            inp[i] = sc.nextInt();
        }
        sc.close();
        Main mm = new Main();
        mm.sortInt(inp);
        for(int i = 0; i<inp.length; i++){
            System.out.print(inp[i] + " ");
        }
    }

    int[] sortInt(int[] inp){
        int temp = 0;
        for(int i = 0; i<inp.length; i++){
            for(int j = i+1; j<inp.length; j++){
                if(inp[i]<inp[j]){
                    temp = inp[j];
                    inp[j] = inp[i];
                    inp[i] = temp;
                }
            }
        }
        return inp;
    }
}
