package kaupTest;
import java.util.Scanner;

public class KaupMain {
    // 카우프지수 구하는 프로그램을 작성해 주세요.
    public static void main(String[] args) {
        double height = (double) (Math.random()*50)+150;
        double weight = (double) (Math.random()*69)+30;
        double heightM = height / 100;
        double kaup = weight / (heightM*heightM);
        System.out.printf("%.2f", kaup);
    }
}