package day11.final_.field;

public class Main {
    public static void main(String[] args) {

        Korean kim = new Korean("010101-2345678");
        kim.name = "김철수";

        //kim.NATION = "중국";
        //kim.password = "030404-2154562";
        System.out.println(Korean.NATION);

    }
}
