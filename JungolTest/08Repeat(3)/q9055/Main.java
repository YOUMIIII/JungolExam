package q9055;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        int sum = 0;
        int count = 1;
        for(int i = 1; i <= num; i++){
            sum += i;
            if(sum > num){
                count = i;
                break;
            }
        }
        System.out.println(count + " " + sum);
    }
}
