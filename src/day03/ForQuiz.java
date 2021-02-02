package day03;

public class ForQuiz {
    public static void main(String[] args) {

        int rn = (int)(Math.random() * 8) + 2;
        System.out.printf("랜덤 구구단 %d단\n", rn);
        for (int i = 1; i < 10; i++) {
            int total = rn * i;
            System.out.printf("%d X %d = %d\n", rn, i, total);
        }

        /*
        // 2 ~ 9 난수 생성
        int level = (int)(Math.random() * 8) + 2;

        System.out.printf("랜덤 구구단 %d단\n", level);
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%d X %d = %d\n", level, i, total);
        }
        */
    }
}
