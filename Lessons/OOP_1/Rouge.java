package OOP_1;

public class Rouge extends Creature {
    // интерфейс нападения
    public void attack(Creature target) {
        target.health_point -= (this.weapon.dmg > 0 ? this.weapon.dmg : 1) * this.agility
                / ((target.clothes.def) > 0 ? target.clothes.def : target.body);

    }

    public Rouge(String name, int body, int agility, int intelligence) {

        super(name, body, agility, intelligence);
        this.weapon = new Weapon("Dagger", 15);
        this.clothes = new Cloth("Suit", 15);

    }
}
