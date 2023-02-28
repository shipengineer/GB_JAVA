package Homework.OOP_3;

import java.util.List;

public class Monk extends Creature {
    // интерфейс нападения подвязываю на основе ловкости
    public Monk() {

        super("Noname", 12, 7, 0, -4, -4, 30, 5, 0, 1, 0, 0);
        this.priorityHealerEnum = PriorityHealerEnum.MEDIUM;

    }

    public Monk(String name, int x, int y) {

        super(name, 12, 7, 0, -4, -4, 30, 5, 0, 1, x, y);
        this.priorityHealerEnum = PriorityHealerEnum.MEDIUM;

    }

    @Override
    public void step(List<Creature> Team_B, List<Creature> Team_A) {

    }

    public String getInfo() {
        return "Я монах " + getName();
    }
}