package beakJoon;

import java.util.Scanner;

public class Change5585 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pay = 1000;
        int price = sc.nextInt();
        int change = pay - price;
        int count = 0;
        while (change >= 500){
            change -= 500;
            count += 1;
        }
        while (change >= 100){
            change -= 100;
            count += 1;
        }
        while (change >= 50){
            change -= 50;
            count += 1;
        }
        while (change >= 10){
            change -= 10;
            count += 1;
        }
        while (change >= 5){
            change -= 5;
            count += 1;
        }
        while (change >= 1){
            change -= 1;
            count += 1;
        }
        System.out.println(count);
    }
}

