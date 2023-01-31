//6개의 점수를 입력 받아 오름차순으로 정렬하여 출력하는 프로그램을 작성하시오.

package q9092;

//import java.util.Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] inp = new int[6];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<inp.length; i++){
            inp[i] = sc.nextInt();
        }
        Main mm = new Main();
        mm.sortInt(inp);

//1.        Arrays.sort(inp);

//2.        int temp = 0;
//        for(int i = 0; i<inp.length; i++){
//            for(int j = i+1; j<inp.length; j++){
//                if(inp[i] > inp[j]){
//                    temp = inp[i];
//                    inp[i] = inp[j];
//                    inp[j] = temp;
//                }
//            }
//        }
//
//        for(int i = 0; i<inp.length; i++){
//            System.out.print(inp[i] + " ");
//        }
    }

    //3.
    void sortInt(int[] inp){
        Arrays.sort(inp);

        for(int i = 0; i<inp.length; i++){
            System.out.print(inp[i] + " ");
        }
    }
}
