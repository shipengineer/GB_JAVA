package Homework.OOP_3;

import java.util.List;

public class Rouge extends Creature {

    public Rouge() {

        super("Noname", 8, 3, 0, 2, 4, 10, 6, 0, 0, 0, 0);

    }

    public Rouge(String name, int x, int y) {

        super(name, 8, 3, 0, 2, 4, 10, 6, 0, 0, x, y);

    }

    @Override
    public void step(List<Creature> Team_B, List<Creature> Team_A) {

    }

    public String getInfo() {
        return "Я разбойник " + getName();
    }

}
