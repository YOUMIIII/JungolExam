package q9108;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            char inp = sc.next().charAt(0);
            if(Character.isAlphabetic(inp)){
                System.out.println(inp + " -> " + (int)inp);
            } else if(Character.isDigit(inp)){
                if((int)inp == 48){
                    System.out.println(inp + " -> " + (int)inp);
                    break;
                }else{
                    System.out.println(inp + " -> " + (int)inp);
                }
            }
        }
    }
}