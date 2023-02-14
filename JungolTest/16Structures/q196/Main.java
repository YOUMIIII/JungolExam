package q196;

import java.util.Arrays;
import java.util.Scanner;

class Info{
    private String name;
    private String tel;
    private String addr;

    Info(String name, String tel, String addr){
        this.name = name;
        this.tel = tel;
        this.addr = addr;
    }

    String getName(){
        return name;
    }

    String getTel(){
        return tel;
    }

    String getAddr(){
        return addr;
    }
}

class SortInfo{
    void sortName(Info[] info){
        String[] names = new String[info.length];
        for(int i = 0; i<info.length; i++){
            names[i] = info[i].getName();
        }
        Arrays.sort(names);
        for(int i = 0; i<info.length; i++){
            if(names[0].equals(info[i].getName())){
                System.out.println("name : " + info[i].getName());
                System.out.println("tel : " + info[i].getTel());
                System.out.println("addr : " + info[i].getAddr());
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Info[] info = new Info[3];
        for(int i = 0; i<info.length; i++){
            String name = sc.next();
            String tel = sc.next();
            String addr = sc.next();
            info[i] = new Info(name, tel, addr);
        }
        sc.close();

        SortInfo sortInfo = new SortInfo();
        sortInfo.sortName(info);
    }
}
