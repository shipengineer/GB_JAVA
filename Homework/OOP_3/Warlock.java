package Homework.OOP_3;

import java.util.List;

public class Warlock extends Creature {
    public Warlock() {

        super("Noname", 17, 12, 0, -5, -5, 30, 9, 0, 1, 0, 0);
        this.priorityHealerEnum = PriorityHealerEnum.LOW;

    }

    public Warlock(String name, int x, int y) {

        super(name, 17, 12, 0, -5, -5, 30, 9, 0, 1, x, y);
        this.priorityHealerEnum = PriorityHealerEnum.LOW;

    }

    @Override
    public void step(List<Creature> Team_B, List<Creature> Team_A) {

    }

    public String getInfo() {
        return "Я колдун " + getName();
    }

}