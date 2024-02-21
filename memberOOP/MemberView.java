package memberOOP;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MemberView {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ID?, 비번?, 비번확인?, 이름?, 주민번호?, 전화번호?, 주소?");
        Member member = new Member(
                sc.next(),
                sc.nextInt(),
                sc.nextInt(),
                sc.next(),
                sc.nextInt(),
                sc.nextInt(),
                sc.next()
        );

        System.out.println(member.toString());
    }
}

