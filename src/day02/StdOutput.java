package day02;

public class StdOutput {

    public static void main(String[] args) {

        String dog = "멍멍이";
        String cat = "야옹이";
        System.out.println(dog);
        System.out.println(cat);

        int month = 3;
        int day = 1;
        String anniversary = "삼일절";

        System.out.println(month + "월 " + day +
                "일은 " + anniversary + "입니다.");
        System.out.printf("%d월 %d일은 %s입니다. \n",
                month, day, anniversary);
        //printf는 자동 줄개행을 지원 안함
        System.out.println("안녕하세요!!!");
        System.out.println("===================");

        //%f는 자동으로 소숫점 6자리를 맞춥니다.
        //%.nf로 소숫점 n자리까지 표현하도록 제한해줘야 함
        //특수문자 %를 쓰려면 %% 두 번 연달아 사용해야 함
        double saleRate = 0.25;
        System.out.printf("할인율은 %.2f%%입니다.\n", saleRate);
    }
}
