package methodTest;

import java.util.Scanner;

public class HowOld {
    static int inputOld(Scanner sc){
        System.out.println("몇살입니까?");
        return sc.nextInt();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int old = inputOld(sc);
        System.out.println("나이는: "+old);
    }
}
