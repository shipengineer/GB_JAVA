package Homework.OOP_1;

// Крестьянин
public class Villager extends Creature {

    public Villager(String name, int body, int agility, int intelligence) {

        super(name, body, agility, intelligence);
        this.weapon = new Weapon("Pitchfork", 10);
        this.clothes = new Cloth("Rugs", 5);

    }

    @Override
    public void attack(Creature target) {

        target.health_point -= (this.weapon.dmg > 0 ? this.weapon.dmg : 1) * this.body
                / ((target.clothes.def) > 0 ? target.clothes.def : target.body);

    }

}
