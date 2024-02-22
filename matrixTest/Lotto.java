package matrixTest;
import java.util.Arrays;
public class Lotto {
    public static void main(String[] args) {
        int[] lotto = new int[6];
        for (int i = 0; i < lotto.length; i++) {
            int num = (int) (1 + Math.random() * 44);
            boolean check = true;
            System.out.println("------- "+num);
            for (int j = 0; j < lotto.length; j++) {
                if (lotto[j] == num) {
                    check = false;
                }
                System.out.println("+++ "+lotto[j]);
            }
            if (check == false) {
                i--;
            } else {
                lotto[i] = num;

            }
        }
        Arrays.sort(lotto);
        for (int i = 0; i < lotto.length; i++){
            System.out.println(lotto[i]);
        }
    }
}