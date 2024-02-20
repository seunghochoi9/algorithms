package kaupOOP;

import java.util.Scanner;

public class KaupView {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person person = new Person();
        System.out.println("이름은?");
        person.setName(sc.next());
        
        person.createHeight();
        person.createWeight();
        person.createBMI();
        person.createBodyMass();

        System.out.println("============BMI계산기=============");
        System.out.println("이름: " + person.getName());
        System.out.println("키: " + person.getHeight());
        System.out.println("몸무게: " + person.getWeight());
        System.out.printf("bmi: %.2f", person.getBmi());
        System.out.println();
        System.out.println(person.getBodyMass());
        System.out.println("=================================");

    }
}

