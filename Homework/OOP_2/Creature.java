package Homework.OOP_2;

import java.util.Comparator;

public abstract class Creature implements Interface {
    protected String name;
    protected int attack;
    protected int defence;
    protected int shots;
    protected int minDamage;
    protected int maxDamage;
    protected int health;
    protected int speed;
    protected int delivery;
    protected int magick;

    public Creature() {
    }

    public Creature(String name, int attack, int defence, int shots, int minDamage, int maxDamage, int health,
            int speed, int delivery, int magick) {
        this.name = name;
        this.attack = attack;
        this.defence = defence;
        this.shots = shots;
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
        this.health = health;
        this.speed = speed;
        this.delivery = delivery;
        this.magick = magick;

    }

    public int getSpeed() {
        return speed;
    }

    public String getAllInfo() {
        return (String.format(
                "Имя %16s, Атака %3d, Защита %3d, Выстрелов %3d, Урон %2d - %2d, Здоровье %3d, Скорость %3d, Передача %3d, магия %3d",
                this.name, this.attack, this.defence, this.shots, this.minDamage, this.maxDamage,
                this.health,
                this.speed, this.delivery, this.magick));

    }

}
