package day03;

import java.util.Scanner;

public class LoopQuiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int corCount = 0;
        int wrongCount = 0;

        while (true) {
            int rn1 = (int)(Math.random() * 101);
            int rn2 = (int)(Math.random() * 101);

            System.out.printf("%d + %d = ?\n", rn1, rn2);
            System.out.print("> ");
            int input = sc.nextInt();
            int answer = rn1 + rn2;
            if (input == answer) {
                System.out.println("--------------------------");
                System.out.println("정답입니다!");
                corCount++;
            } else if (input == 0) {
                System.out.println("입력 종료!");
                System.out.println("==========================");
                System.out.printf("정답횟수: %d\n", corCount);
                System.out.printf("오답횟수: %d\n", wrongCount);
                break;
            } else {
                System.out.println("--------------------------");
                System.out.println("틀렸습니다!");
                wrongCount++;
            }
        }
        sc.close();
    }
}
