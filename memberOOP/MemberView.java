package memberOOP;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MemberView {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Member member = new Member();
        System.out.println("ID?");
        member.setId(sc.next());
        System.out.println("비번?");
        member.setPassword(sc.nextInt());
        System.out.println("비번확인?");
        member.setVerifyPassword(sc.nextInt());
        System.out.println("이름?");
        member.setName(sc.next());
        System.out.println("주민번호?");
        member.setSocialSecurityNumber(sc.nextInt());
        System.out.println("전화번호?");
        member.setPhoneNumber(sc.nextInt());
        System.out.println("주소?");
        member.setAddress(sc.next());

        System.out.println("ID: "+member.getId());
        System.out.println("비번: "+member.getPassword());
        System.out.println("비번확인: "+member.getVerifyPassword());
        System.out.println("이름: "+member.getName());
        System.out.println("주민번호: "+member.getSocialSecurityNumber());
        System.out.println("전화번호: "+member.getPhoneNumber());
        System.out.println("주소: "+member.getAddress());
    }
}

