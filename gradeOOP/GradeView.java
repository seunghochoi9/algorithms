import java.util.Scanner;
import java.util.Arrays;
public class Multidimensional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1반에서 시험에 응시한 학생수는 몇명입니까?");
        int[] scores1 = new int[sc.nextInt()];

        System.out.println("2반에서 시험에 응시한 학생수는 몇명입니까?");
        int[] scores2 = new int[sc.nextInt()];

        int sum1 = 0;
        int max1 = 0;
        for (int i = 0; i < scores1.length; i++) {
            //System.out.println("1반 시험점수 입력:");
            scores1[i] = (int) (Math.random()*100);
            sum1 += scores1[i];
            if(scores1[i] > scores1[max1]){
                max1 = i;
            }
        }

        int sum2 = 0;
        int max2 = 0;
        for (int i = 0; i < scores2.length; i++) {
            //System.out.println("2반 시험점수 입력:");
            scores2[i] = (int) (Math.random()*100);
            sum2 += scores2[i];
            if(scores2[i] > scores2[max2]){
                max2 = i;
            }
        }

        int avg1 = sum1 / scores1.length;
        int avg2 = sum2 / scores2.length;

        System.out.println(Arrays.toString(scores1));
        System.out.println(Arrays.toString(scores2));
        System.out.printf("1반의 평균 점수는 %d점이고, 1등 점수는 %d점이다.", avg1, scores1[max1]);
        System.out.println("");
        System.out.printf("2반의 평균 점수는 %d점이고, 1등 점수는 %d점이다.", avg2, scores2[max2]);
    }
}
