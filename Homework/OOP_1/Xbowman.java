package Homework.OOP_1;

public class Xbowman extends Creature {
    // интерфейс нападения подвязываю на основе ловкости

    public Xbowman(String name, int body, int agility, int intelligence) {

        super(name, body, agility, intelligence);
        this.weapon = new Weapon("Spear", 12);
        this.clothes = new Cloth("Armor", 10);

    }

    @Override
    public void attack(Creature target) {
        target.health_point -= (this.weapon.dmg > 0 ? this.weapon.dmg : 1) * this.agility
                / ((target.clothes.def) > 0 ? target.clothes.def : target.body);

    }
}
