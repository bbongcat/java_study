package day09.encap.good;

public class Cat {

    private double weight; // kg 단위

    // weight의 값을 안전하게 저장할 수 있게 하는 setter
    public void setWeight(double weight) { // 관례적으로 setter에는 set을 붙이고 뒤에 조작하고싶은 필드의 이름을 붙임
        if (weight <= 0 || weight >= 200) {
            this.weight = 5;
            return;
        }
        this.weight = weight;
    }

    // weight의 값을 가져갈 때 사용할 메서드 getter
    public double getWeight(boolean pound) {
        if (pound) {
            return this.weight / 0.45;
        } else {
            return this.weight;
        }
    }

    public void printWeight() {
        System.out.println("고양이의 몸무게: " + this.weight + "kg");
    }
}
