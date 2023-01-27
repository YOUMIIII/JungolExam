//문자를 입력받아 알파벳 문자인 경우에는 그대로 출력하고 숫자인 경우는 아스키코드값을 출력하는 작업을 반복하다가 기타의 문자가 입력되면 종료하는 프로그램을 작성하시오.

package q598;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            String inp = sc.next();
            char inpi = inp.charAt(0);
            if((int)inpi>=65 && (int)inpi<=90){
                System.out.println(inpi);
            } else if((int)inpi>=97&&(int)inpi<=122){
                System.out.println(inpi);
            }else if(Character.isDigit(inpi)){
                System.out.println((int)inpi);
            } else {
                break;
            }
        }
    }
}
