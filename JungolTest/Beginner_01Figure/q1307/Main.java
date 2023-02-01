package q1307;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        char[] alpa = new char[n * n];
        for (int i = 65, j = 0; j < alpa.length; i++, j++) {
            if (i == 91) {
                i = 65;
            }
            alpa[j] = (char) i;
        }
//        for (int i = 0; i < alpa.length; i++) {
//            System.out.print(alpa[i] + " ");
//        }
//        System.out.println();

        for(int i = alpa.length-1; i>=(alpa.length-n); i--){
            for(int j = 0, k = i; j<n; j++, k-=n){
                System.out.print(alpa[k] + " ");
            }
            System.out.println();
        }
//        System.out.println((int)'A'); //65
//        System.out.println((int)'Z'); //90

    }
}
