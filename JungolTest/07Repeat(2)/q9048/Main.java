/*
1부터 20까지의 홀수를 차례대로 출력하는 프로그램을 작성하시오. 
*/

package q9048;

public class Main {
	public static void main(String[] args) {
		int i = 1;
		while (i <= 20) {
			if (i % 2 == 1) {
				System.out.print(i + " ");
			}
			i++;
		}
	}
}
