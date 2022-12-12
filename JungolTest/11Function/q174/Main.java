/*
3명 학생의 3과목 점수를 입력받아 각 과목별 학생별 총점을 출력하는 구조화된 프로그램을 작성하시오.
<입력 예>
50 80 100
96 88 66
100 85 90
<출력 예>
50 80 100 230
96 88 66 250
100 85 90 275
246 253 256 755
*/

package q174;

import java.util.Scanner;

class Student {
	int sum = 0;
	private int sub1;
	private int sub2;
	private int sub3;

	Student(int sub1, int sub2, int sub3) {
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
		sum = sub1 + sub2 + sub3;
		System.out.println(sum);
	}

	int getSub1() {
		return sub1;
	}

	int getSub2() {
		return sub2;
	}

	int getSub3() {
		return sub3;
	}

	int getSum() {
		return sum;
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sub1, sub2, sub3;
		Student[] stu = new Student[3];
		for (int i = 0; i < 3; i++) {
			sub1 = sc.nextInt();
			sub2 = sc.nextInt();
			sub3 = sc.nextInt();
			System.out.print(sub1 + " " + sub2 + " " + sub3 + " ");
			stu[i] = new Student(sub1, sub2, sub3);
		}
		sc.close();

		int sumSub1 = 0, sumSub2 = 0, sumSub3 = 0, sum = 0;
		for (int i = 0; i < stu.length; i++) {
			sumSub1 += stu[i].getSub1();
			sumSub2 += stu[i].getSub2();
			sumSub3 += stu[i].getSub3();
			sum += stu[i].getSum();
		}

		System.out.println(sumSub1 + " " + sumSub2 + " " + sumSub3 + " " + sum);
	}
}
