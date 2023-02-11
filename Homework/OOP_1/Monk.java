package Homework.OOP_1;

public class Monk extends Creature {
    // интерфейс нападения подвязываю на основе ловкости

    public Monk(String name, int body, int agility, int intelligence) {

        super(name, body, agility, intelligence);
        this.weapon = new Weapon("Fists", 1);
        this.clothes = new Cloth("Rugs", 5);

    }

    @Override
    public void attack(Creature target) {
        target.health_point -= (this.weapon.dmg > 0 ? this.weapon.dmg : 1)
                * (this.weapon.name == "Fists" ? this.body + this.agility : this.body)
                / ((target.clothes.def) > 0 ? target.clothes.def : target.body);

    }
}