/*
삼각형의 밑변의 길이와 높이를 입력받아 넓이를 출력하고, "Continue? "에서 하나의 문자를 입력받아 그 문자가 'Y' 나 'y' 이면 작업을 반복하고 다른 문자이면 종료하는 프로그램을 작성하시오.
(넓이는 반올림하여 소수 첫째자리까지 출력한다.)​
*/

package q129;

import java.util.Scanner;

public class Main {
	private int width;
	private int height;

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	Scanner sc = new Scanner(System.in);

	public void userInput() {
		System.out.print("Base = ");
		int width = sc.nextInt();
		setWidth(width);

		System.out.print("Height = ");
		int height = sc.nextInt();
		setHeight(height);
		print();
	}

	public double area() {
		return getWidth() * getHeight() / (double) 2;
	}

	public void print() {
		System.out.printf("Triangle width = %.1f\n", area());
	}

	public char continuePlay() {
		System.out.print("Continue? ");
		char yn = sc.next().charAt(0);
		return yn;
	}

	public static void main(String[] args) {
		Main m = new Main();
		while (true) {
			m.userInput();
			char yn = m.continuePlay();
			if (yn == 'y' || yn == 'Y') {
				continue;
			}
			break;
		}
	}
}