package q152;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] input = new int[10];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<input.length; i++){
            input[i] = sc.nextInt();
        }
        sc.close();

        int odd= 0;
        int even = 0;
        for(int i = 0; i < input.length; i++){
            if(i%2 == 1){
                even += input[i];
            } else{
                odd += input[i];
            }
        }

        System.out.println("odd : " + odd);
        System.out.println("even : " + even);
    }
}
