//100개의 정수를 입력받을 수 있는 배열을 선언한 후 정수를 차례로 입력 받다가 -1이 입력되면 입력을 중단하고 -1을 제외한 마지막 세 개의 정수를 출력하는 프로그램을 작성하시오.
//        (입력받은 정수가 -1을 제외하고 3개 미만일 경우에는 -1을 제외하고 입력받은 정수를 모두 출력한다.)

package q153;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] input = new int[100];

        Scanner sc = new Scanner(System.in);
        int i = 0, count = 0;
        while (true) {
            input[i] = sc.nextInt();
            count++;
            if (input[i] == -1) {
                break;
            }
            i++;
        }
        sc.close();
//        System.out.println(input.length);
//        System.out.println(count);
        if (count <= 2) {
            System.out.println(input[0]);
        } else if (count <= 3) {
            System.out.println(input[0] + " " + input[1]);
        } else {
            for (int j = count - 4; j < count - 1; j++) {
                System.out.print(input[j] + " ");
            }
        }
    }
}
