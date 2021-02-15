package day10.inherit.player;

public class Main {

    public static void main(String[] args) {

     Warrior w = new Warrior("짱짱전사님");
     //w.name = "타락파워전사";
     w.level = 1;
     w.hp = 20;

     w.info();

     Mage m = new Mage();
     m.name = "울트라법사";
     m.level = 1;
     m.hp = 15;

     m.info();

     Hunter h = new Hunter();
     h.name = "궁수궁수";
     h.level = 1;
     h.hp = 30;

     h.info();

    }
}
