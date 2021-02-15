package day10.inherit.player;

public class Mage extends Player {

    int mana;

    void meteo() {}

    public Mage() {
        super("마법사", 1, 50);
    }

    @Override
    void info() {
        super.info();
        System.out.println("# 마력: " + this.mana);
    }
}
