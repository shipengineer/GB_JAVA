package Homework.OOP_2;

public class Warlock extends Creature {
    public Warlock() {

        super("Noname", 17, 12, 0, -5, -5, 30, 9, 0, 1);

    }

    public Warlock(String name) {

        super(name, 17, 12, 0, -5, -5, 30, 9, 0, 1);

    }

    @Override
    public void step() {

    }

    public String getInfo() {
        return "Я колдун " + getName();
    }

}