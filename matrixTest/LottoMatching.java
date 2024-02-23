package matrixTest;

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
        int[] myLotto = createLottoNumber();
        // 로또/구매 번호 중복체크
        int duplication = 0;
        for(int i=0;i<6;i++){
            for(int j=0;j<6;j++){
               if(lotto[i]==myLotto[j]){
                   duplication++;
               }
            }
        }
        // 로또/구매번호 출력
        System.out.print("로또추첨 번호: ");
        for (int i = 0; i < 6; i++){
            System.out.print(lotto[i]+" ");
        }
        System.out.println();
        System.out.print("내 번호: ");
        for (int i = 0; i < 6; i++){
            System.out.print(myLotto[i]+" ");
        }
        System.out.println();
        // 등수 출력
        System.out.printf("%.f등이다.", duplication);

    }


    private static int[] createLottoNumber() {
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
    private static int gradeCheck(int duplication) {
        int gradeCheck = 0;
        if(duplication<3){
            gradeCheck = 0;
        } else if (duplication<4) {
            gradeCheck = 4;
        } else if (duplication<5) {
            gradeCheck = 3;
        } else if (duplication<6) {
            gradeCheck = 2;
        } else { gradeCheck = 1;
        }
        return gradeCheck;

    }
}
