package OOP_1;

// снайпер мне не понравился, взял лучника
public class Bowman extends Creature {
    // интерфейс нападения подвязываю на основе ловкости
    public void attack(Creature target) {
        target.health_point -= (this.weapon.dmg > 0 ? this.weapon.dmg : 1) * this.agility
                / ((target.clothes.def) > 0 ? target.clothes.def : target.body);

    }

    public Bowman(String name, int body, int agility, int intelligence) {

        super(name, body, agility, intelligence);
        this.weapon = new Weapon("Bow", 12);
        this.clothes = new Cloth("Suit", 15);

    }
}