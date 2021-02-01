package day02;

public class Casting3 {

    public static void main(String[] args) {

        char c = 'B';
        int i = 3;

//        int result = c + 1;
        char result = (char) (c + i);
        System.out.println("result = " + result);

        byte b1 = 100;
        byte b2 = 120;
        int b3 = b1 + b2;



        int n = 5;
        int m = 27;
        
        double res = m / n;
        System.out.println("res = " + res);
        /*
            생각해볼 점
            1. 왜 5.4가 아닌 5.0이 저장되었는가?
                - res는 실수 타입으로 선언했지만 n과 m이 int 정수 타입이므로
                  결과가 5.0이 나왔다.
            2. 위 코드를 형 변환해서 다시 5.4가 나오도록 해보자.
         */

        int l = 5;
        int k = 27;

        double res2 = m / (double) n;
        System.out.println("res2 = " + res2);
    }
}
