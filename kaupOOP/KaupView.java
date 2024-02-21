package kaupOOP;

import memberOOP.Member;

import java.util.Scanner;

public class KaupView {
    static String test;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double randomHeight = (double) (Math.random() * 50) + 150;
        double randomWeight = (double) (Math.random() * 69) + 30;
        Member person = new Member(randomHeight, randomWeight);

        KaupService service = new KaupServiceImpl();
        double bmi = service.createBMI();
        String bodyMass = service.createBodyMass();

        System.out.println("============BMI계산기=============");
        System.out.println("이름: " + person.getName());
        System.out.println("키: " + person.getHeight());
        System.out.println("몸무게: " + person.getWeight());
        System.out.printf("bmi: %.2f", bmi);
        System.out.println();
        System.out.println(bodyMass);
        System.out.println("=================================");

    }
}

