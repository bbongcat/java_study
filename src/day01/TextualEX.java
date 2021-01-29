package day01;

public class TextualEX {

    public static void main(String[] args) {
        
        //한 글자를 저장할 때는 홑따옴표를 사용
        char c1 = 'A';
        char c2 = 44032; //유니코드 아스키코드로 해석
        System.out.println("c2 = " + c2);
        
        char c3 = 0x43;
        System.out.println("c3 = " + c3);

        System.out.println("=======================");

        //문장이나 단어를 저장할 때는 겹따옴표에 담아 저장함
        String s1 = "My dream ";
        String s2 = "is a Programmer!";
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1+s2);

        System.out.println("100" + "200");
        System.out.println(100 + "200");

        System.out.println(10 + 20 + "hello");
        System.out.println("hello" + 10 + 20);

        System.out.println("hello" + '!');
    }
}
