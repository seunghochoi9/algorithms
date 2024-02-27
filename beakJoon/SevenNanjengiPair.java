package beakJoon;

import java.util.Scanner;
import java.util.Arrays;

public class SevenNanjengiPair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[9];
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            num[i] = sc.nextInt();
            sum += num[i];
        }
        for (int i = 0; i < num.length - 1; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if ((sum - num[i] - num[j]) == 100) {
                    num[i] = 100;
                    num[j] = 100;

                    i = num.length;
                    j = num.length;
                }
            }
        }
        Arrays.sort(num);
        for (int i = 0; i < 7; i++) {
            System.out.println(num[i]);
        }
    }
}
