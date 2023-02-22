/*
어떤 학생의 키는 아버지와 어머니의 키의 평균보다 5cm 크고 몸무게는 아버지와 어머니의 몸무게의 평균보다 4.5kg 가볍다고 한다.
키와 몸무게를 멤버변수로 갖는 구조체를 정의하고 아버지와 어머니의 키와 몸무게를 입력받아 학생의 키와 몸무게를 출력하는 프로그램을 작성하시오.
키는 정수미만 버림하고 몸무게는 반올림하여 소수 첫째자리까지 나타낸다.
*/

package q198;

import java.util.Scanner;
class ParentInfo{
    private int height;
    private double weight;

    public ParentInfo(int height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }
}

class ChildInfo{
    private int cHeight;
    private double cWeight;
    ChildInfo(ParentInfo[] pInfo){
        cHeight = ((pInfo[0].getHeight() + pInfo[1].getHeight()) / 2) + 5;
        cWeight = ((pInfo[0].getWeight() + pInfo[1].getWeight()) / 2) - 4.5;
        printInfo();
    }
    void printInfo(){
        System.out.println("height : " + cHeight + "cm");
        System.out.printf("weight : %.1fkg",cWeight);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ParentInfo[] pInfo = new ParentInfo[2];
        for(int i = 0; i < pInfo.length; i++){
            int height = sc.nextInt();
            double weight = sc.nextDouble();
            pInfo[i] = new ParentInfo(height, weight);
        }
        sc.close();

        ChildInfo cInfo = new ChildInfo(pInfo);
    }
}
