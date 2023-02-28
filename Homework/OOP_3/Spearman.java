package Homework.OOP_3;

import java.util.List;

public class Spearman extends Creature {

    public Spearman() {

        super("Noname", 4, 5, 0, 1, 3, 10, 4, 0, 0, 0, 0);

    }

    public Spearman(String name, int x, int y) {

        super(name, 4, 5, 0, 1, 3, 10, 4, 0, 0, x, y);

    }

    @Override
    public void step(List<Creature> Team_B, List<Creature> Team_A) {

    }

    public String getInfo() {
        return "Я копейщик " + getName();
    }

}