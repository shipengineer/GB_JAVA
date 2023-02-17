package Homework.OOP_2;

import java.util.Comparator;

public abstract class Creature implements Interface {
    private String name;
    private int attack;
    private int defence;
    private int shots;
    private int minDamage;
    private int maxDamage;
    private int health;
    private int speed;
    private int delivery;
    private int magick;

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

    public int getAttack() {
        return attack;
    }

    public int getDefence() {
        return defence;
    }

    public int getDelivery() {
        return delivery;
    }

    public int getHealth() {
        return health;
    }

    public int getMagick() {
        return magick;
    }

    public int getMaxDamage() {
        return maxDamage;
    }

    public int getMinDamage() {
        return minDamage;
    }

    public String getName() {
        return name;
    }

    public int getShots() {
        return shots;
    }

    public String getAllInfo() {
        return (String.format(
                "Имя %16s, Атака %3d, Защита %3d, Выстрелов %3d, Урон %2d - %2d, Здоровье %3d, Скорость %3d, Передача %3d, магия %3d",
                this.name, this.attack, this.defence, this.shots, this.minDamage, this.maxDamage,
                this.health,
                this.speed, this.delivery, this.magick));

    }

}
