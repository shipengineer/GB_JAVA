package Homework.OOP_2;

public abstract class Creature implements Interface {
    String name;
    int attack;
    int defence;
    int shots;
    int minDamage;
    int maxDamage;
    int health;
    int speed;
    int delivery;
    int magick;

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

}
