//26개의 문자배열을 선언하고 'A'부터 'Z'까지의 대문자를 차례로 대입 시킨 후 배열의 마지막부터 처음까지 각 문자를 출력하는 프로그램을 작성하시오.

package q9066;

public class Main {
    public static void main(String[] args) {
        char[] alpa = new char[26];
        int n = 65;
        for(int i = 0; i<alpa.length; i++){
            alpa[i] = (char)n;
            n++;
        }

        for(int i=alpa.length-1; i >= 0; i--){
            System.out.print(alpa[i] + " ");
        }

//        int ap = 0;
//        for(int i = 0; i<alpa.length; i++){
//            for(int j = i+1; j<alpa.length; j++){
//                if((int)alpa[i]<(int) alpa[j]){
//                    ap = (int)alpa[i];
//                    alpa[i] = alpa[j];
//                    alpa[j] = (char) ap;
//                }
//            }
//        }
//        for(int i = 0; i<alpa.length; i++){
//            System.out.print(alpa[i] + " ");
//        }
    }
}
