package q195;

import java.util.Scanner;

class Info{
    private String name;
    private String phone;
    private String address;

    Info(String name, String phone, String address){
        this.name = name;
        this.phone = phone;
        this.address = address;
        print();
    }

    void print(){
        System.out.println("name : " + name);
        System.out.println("tel : " + phone);
        System.out.println("addr : " + address);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        String tel = sc.next();
        String addr = sc.next();
        sc.close();

        new Info(name, tel, addr);
    }
}
