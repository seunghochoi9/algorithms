package matrixTest;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 로또 발급은 1~8까지 중복없는 숫자 6개이다. 하나는 구매한 로또이다.
 * 추가된 로직은 추첨된 로또이다.
 * 두 로또의 일치여부에 따라
 * 다음과 같은 메시지를 출력한다.
 * 단, 구매로또 번호와 추첨로또 번호 모두 같이 출력한다.
 * <p>
 * 1등 - 6개 맞춤
 * 2등 - 5개 맞춤
 * 3등 - 4개 맞춤
 * 4등 - 3개 맞춤
 * 꽝
 */

public class LottoMatching {
    public static void main(String[] args) {
        int[] lotto = createLottoNumber();
        int[] myLotto = buyLotto();
        Arrays.sort(lotto);
        Arrays.sort(myLotto);

        // 로또/구매 번호 중복체크
        int duplication = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (lotto[i] == myLotto[j]) {
                    duplication++;
                }
            }
        }
        // 로또/구매번호 출력
        System.out.print("로또추첨 번호: ");
        for (int i = 0; i < 6; i++) {
            System.out.print(lotto[i] + " ");
        }
        System.out.println();
        System.out.print("내 번호: ");
        for (int i = 0; i < 6; i++) {
            System.out.print(myLotto[i] + " ");
        }
        System.out.println();
        // 등수 출력
        System.out.println(rank(duplication));

    }

    public static String rank(int duplication) {
        String rank = "";
        switch (duplication) {
            case 0 : rank = "꽝";
            case 1 : rank = "꽝";
            case 2 : rank = "꽝";
            case 3 : rank = "4";
            case 4 : rank = "3";
            case 5 : rank = "2";
            case 6 : rank = "1";
        }
        return rank;
    }

    public static int[] createLottoNumber() {
        int[] lotto = new int[6];
        for (int i = 0; i < 6; i++) {
            int num = (int) (1 + Math.random() * 7);
            boolean check = true;
            for (int j = 0; j < 6; j++) {
                if (lotto[j] == num) {
                    check = false;
                }
            }
            if (check == false) {
                i--;
            } else {
                lotto[i] = num;
            }
        }
        return lotto;
    }

    public static int[] buyLotto() {
        Scanner sc = new Scanner(System.in);
        int[] myLotto = new int[6];
        System.out.println("1~8 사이 로또번호 6개를 입력하세요.");
        for (int i = 0; i < 6; i++) {
            int num = sc.nextInt();
            boolean check = true;
            for (int j = 0; j < 6; j++) {
                if (myLotto[j] == num) {
                    check = false;
                }
            }
            if (check == false) {
                i--;
                System.out.println("중복! 다른 번호 입력");
            } else {
                myLotto[i] = num;
                System.out.println("다음 번호 입력");
            }
        }
        return myLotto;
    }
}