package Homework.OOP_3.Units;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Villager extends Creature {
    public Villager() {
        super("Noname", 1, 1, 0, 1, 1, 1, 3, 1, 0, 0, 0);
        this.priorityHealerEnum = PriorityHealerEnum.LOW;

    }

    public Villager(String name, int x, int y) {
        super(name, 1, 1, 0, 1, 1, 1, 3, 1, 0, x, y);
        this.priorityHealerEnum = PriorityHealerEnum.LOW;

    }

    @Override
    public void step(List<Creature> Team_B, List<Creature> Team_A) {

    }

    public void step(List<Creature> Team_A) {

        Collections.sort(Team_A, new Comparator<Creature>() {
            public int compare(Creature c1, Creature c2) {
                if (c1.priorityHealerEnum.getCode() > c1.priorityHealerEnum.getCode()) {
                    return 1;
                } else {
                    return -1;

                }
            }
        });
        for (Creature friend : Team_A) {

            if (friend.getCurrentHealth() < friend.getMaxHealth() && friend.getCurrentHealth() != 0) {
                friend.setCurrentHealth(getCurrentHealth() + 5);
                if (friend.getCurrentHealth() > friend.getMaxHealth()) {
                    friend.setCurrentHealth(friend.getMaxHealth());
                }
                return;
            }

        }
    }

    public String getInfo() {
        return "Я крестьянин " + getName();
    }

}
