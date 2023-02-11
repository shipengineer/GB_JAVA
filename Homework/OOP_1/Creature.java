package Homework.OOP_1;

public abstract class Creature {
    String name;
    int body;
    int agility;
    int intelligence;
    int health_point;
    int mana;
    Weapon weapon;
    Cloth clothes;

    public Creature() {
    }

    public Creature(String name, int body, int agility, int intelligence) {
        this.name = name;
        this.body = body;
        this.agility = agility;
        this.intelligence = intelligence;
        this.health_point = body * 30;
        this.mana = intelligence * 40;

    }

    protected String getInfo() {
        return (String.format(
                "Имя %s, Тело %d, Ловкость %d, Интелект %d, Здоровье %d, Мана %d, Оружие %s %d, Одежда %s %d",
                this.name, this.body, this.agility, this.intelligence, this.health_point, this.mana,
                this.weapon.name,
                this.weapon.dmg, this.clothes.name, this.clothes.def));

    }

}
