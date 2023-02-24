package q199;

import java.util.Scanner;

class Student{
    private String name;
    private int sub1, sub2, sub3, sum;

    public Student(String name, int sub1, int sub2, int sub3, int sum) {
        this.name = name;
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
        this.sum = sum;
    }

    public String getName() {
        return name;
    }

    public int getSub1() {
        return sub1;
    }

    public int getSub2() {
        return sub2;
    }

    public int getSub3() {
        return sub3;
    }

    public int getSum() {
        return sum;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Student[] st = new Student[n];
        int[] sumArr = new int[n];

        for(int i=0; i<n; i++){
            String name = sc.next();
            int sub1 = sc.nextInt();
            int sub2 = sc.nextInt();
            int sub3 = sc.nextInt();
            int sum = sub1 + sub2 + sub3;
            st[i] = new Student(name, sub1, sub2, sub3, sum);
            sumArr[i] = sum;
        }

        int max = Integer.MIN_VALUE;
        for(int i = 0; i<n; i++){
            for(int j = i+1; j<n; j++){
                if(sumArr[i] < sumArr[j]){
                    max = sumArr[j];
                    sumArr[j] = sumArr[i];
                    sumArr[i] = max;
                }
            }
        }

//        for(int i = 0; i<n; i++){
//            System.out.print(sumArr[i] + " ");
//        }

        for(int i =0; i<n; i++){
            for(int j = 0; j<n; j++){
                if(sumArr[i] == st[j].getSum()){
                    String prtName = st[j].getName();
                    int prtSub1 = st[j].getSub1();
                    int prtSub2 = st[j].getSub2();
                    int prtSub3 = st[j].getSub3();
                    int prtSum = st[j].getSum();
                    System.out.println(prtName + " " + prtSub1 + " " + prtSub2 + " " + prtSub3 + " " + prtSum);
                }
            }
        }
    }
}
