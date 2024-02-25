package beakJoon;

import java.util.Scanner;
import java.util.Arrays;

public class SevenNanjengiPair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if((sum - arr[i] - arr[j]) == 100){
                    arr[i] = 100;
                    arr[j] = 100;
                    i = arr.length;
                    j = arr.length;
                }
            }
        }

        Arrays.sort(arr);
        for(int i=0;i<7;i++){
            System.out.println(arr[i]);
        }

    }
}
