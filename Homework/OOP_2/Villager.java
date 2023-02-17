package Homework.OOP_2;

public class Villager extends Creature {
    public Villager() {
        super("Noname", 1, 1, 0, 1, 1, 1, 3, 1, 0);
    }

    public Villager(String name) {
        super(name, 1, 1, 0, 1, 1, 1, 3, 1, 0);
    }

    @Override
    public void step() {

    }

    public String getInfo() {
        return "Я крестьянин " + getName();
    }

}
