package day02;

public class Casting2 {

    public static void main(String[] args) {
        
        // 명시적 형변환, Downcasting
        int a = 1000;
        byte b = (byte) a;
        System.out.println("b = " + b); // -24가 나옴.
        
        double c = 500.33333;
        int d = (int) c;
        System.out.println("d = " + d); // 소숫점 이하 사라짐
        
        int m = 65;
        char n = (char) m;
        System.out.println("n = " + n);
    }
}
