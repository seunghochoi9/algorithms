package methodTest;

import jdk.dynalink.beans.StaticClass;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class WhatName {
    static String inputName(Scanner sc){
        System.out.println("학생이름 입력: ");
        return sc.next();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = inputName(sc);
        System.out.println("이름: " + name);
    }
}
