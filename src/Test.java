import java.util.*;

public class Test {

    static int add(int n1, int n2) {
        return n1 + n2;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("더할 첫 번째 숫자를 입력해주세요 : ");
        int firstNum = sc.nextInt();
        System.out.print("더할 두 번째 숫자를 입력해주세요 : ");
        int secondNum = sc.nextInt();
        System.out.println("두 수를 더합니다.");
        int result = add(firstNum, secondNum);
        System.out.println(result);


    }
}