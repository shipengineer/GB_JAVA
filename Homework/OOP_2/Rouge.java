package Homework.OOP_2;

public class Rouge extends Creature {

    public Rouge() {

        super("Noname", 8, 3, 0, 2, 4, 10, 6, 0, 0);

    }

    public Rouge(String name) {

        super(name, 8, 3, 0, 2, 4, 10, 6, 0, 0);

    }

    @Override
    public void step() {

    }

    public String getInfo() {
        return "Я разбойник " + getName();
    }

}
