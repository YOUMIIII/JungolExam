package q115;

import java.util.Scanner;

class Info {

	private int height;
	private int weight;

	Info(int height, int weight) {
		this.height = height;
		this.weight = weight;
	}

	int getHeight() {
		return height;
	}

	int getWeight() {
		return weight;
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Info[] info = new Info[2];
		for (int i = 0; i < info.length; i++) {
			int h = sc.nextInt();
			int w = sc.nextInt();
			info[i] = new Info(h, w);
		}
		sc.close();

		int i = 0, j = 1;
		if (info[i].getHeight() > info[j].getHeight() && info[i].getWeight() > info[j].getWeight()) {
			System.out.print(true);
		} else {
			System.out.print(false);
		}
	}
}
