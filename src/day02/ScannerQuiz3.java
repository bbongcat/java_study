package day02;

import java.util.Scanner;

public class ScannerQuiz3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("이름: ");
        String name = sc.next();

        System.out.print("나이: ");
        int age = sc.nextInt();
        int kAge = 2022 - age;

        System.out.println("--------------------");
        System.out.printf("%s\n", name);
        System.out.printf("%d년생", kAge);

        sc.close();
    }
}
