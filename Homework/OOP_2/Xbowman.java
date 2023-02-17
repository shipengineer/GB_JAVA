package Homework.OOP_2;

public class Xbowman extends Creature {
    public Xbowman() {
        super("Noname", 6, 3, 16, 2, 3, 10, 4, 0, 0);

    }

    public Xbowman(String name) {
        super(name, 6, 3, 16, 2, 3, 10, 4, 0, 0);

    }

    @Override
    public void step() {

    }

    public String getInfo() {
        return "Я арбалетчик " + getName();
    }

}