package gradeOOP;

import java.sql.SQLOutput;
import java.util.Scanner;

public class GradeView {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Grade grade = new Grade();
        System.out.println("다음은 한 학생의 과목 점수이다.");
        System.out.println("이름 : ");
        grade.setName(sc.next());

        grade.createLanguageScore();
        grade.createMathScore();
        grade.createEnglishScore();
        grade.createAvg();

        System.out.println(" ============= 성적표 ==============");
        System.out.println("이름 : " + grade.getName());
        System.out.println("국어점수 : " + grade.getLanguageScore());
        System.out.println("영어점수 : " + grade.getEnglishScore());
        System.out.println("수학점수 : " + grade.getMathScore());
        System.out.println("평균 점수: " + grade.getAvg());
    }
}