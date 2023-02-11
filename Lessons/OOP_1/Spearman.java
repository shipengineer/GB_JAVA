package OOP_1;

public class Spearman extends Creature {
    // интерфейс нападения подвязываю на основе ловкости
    public void attack(Creature target) {
        target.health_point -= (this.weapon.dmg > 0 ? this.weapon.dmg : 1) * this.body
                / ((target.clothes.def) > 0 ? target.clothes.def : target.body);

    }

    public Spearman(String name, int body, int agility, int intelligence) {

        super(name, body, agility, intelligence);
        this.weapon = new Weapon("Spear", 12);
        this.clothes = new Cloth("Armor", 10);

    }
}