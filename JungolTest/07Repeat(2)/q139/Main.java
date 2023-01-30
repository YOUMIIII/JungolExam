package q139;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        for (int i = 1; i <= 9; i++) {
            if(n1>n2){
                for(int j = n1; j >= n2; j--){
                    System.out.printf("%d * %d = %2d   ", j, i, (j * i));
                }
            }else{
                for(int j = n1; j <= n2; j++){
                    System.out.printf("%d * %d = %2d   ", j, i, (j * i));
                }
            }
            System.out.println();
        }
    }
}
