package beakJoon;

import java.util.Scanner;

public class GetHoney21758 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0, max = 0;
        int middleSum, leftSum, rightSum;
        int[] arr = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
            if (arr[i] > max && i != 0 && i != arr.length - 1) {
                max = arr[i];
            }
        }
        max = max + sum - arr[0] - arr[arr.length - 1];
        middleSum = 0;
        rightSum = sum - arr[0] - arr[1];
        for (int i = 1; i < arr.length - 1; i++) {
            max = Math.max(max, middleSum + rightSum * 2);
            middleSum += arr[i];
            rightSum -= arr[i + 1];
        }
        middleSum = 0;
        leftSum = sum - arr[arr.length - 1] - arr[arr.length - 2];
        for (int i = arr.length - 2; i > 0; i--) {
            max = Math.max(max, middleSum + leftSum * 2);
            middleSum += arr[i];
            leftSum -= arr[i - 1];
        }
        System.out.println(max);
    }
}
