//공백을 포함한 문장을 입력 받아서 홀수 번째 단어를 차례로 출력하는 프로그램을 작성하시오.

package q603;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        sc.close();

        StringTokenizer st = new StringTokenizer(inp);
        String[] str = new String[st.countTokens()];
        for(int i = 0; i<str.length; i++){
            str[i] = st.nextToken();
        }
        for(int i = 0; i<str.length; i++){
            if((i % 2) == 0){
                System.out.println(str[i]);
            }
        }
//        System.out.println(inp);
    }
}
