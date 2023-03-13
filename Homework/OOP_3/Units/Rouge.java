package Homework.OOP_3.Units;

import java.util.List;

public class Rouge extends Creature {

    public Rouge() {

        super("Noname", 8, 3, 0, 2, 4, 10, 6, 0, 0, 0, 0);
        this.priorityHealerEnum = PriorityHealerEnum.MEDIUM;

    }

    public Rouge(String name, int x, int y) {

        super(name, 8, 3, 0, 2, 4, 10, 6, 0, 0, x, y);
        this.priorityHealerEnum = PriorityHealerEnum.MEDIUM;
    }

    @Override
    public void step(List<Creature> Team_B, List<Creature> Team_A) {
        Creature nearUnit = Team_B.get(0);
        int tempDistance = 128;

        if (getCurrentHealth() > 0) {
            for (Creature unit : Team_B) {
                if ((Math.pow(
                        Math.pow(unit.getPosition().getX() - this.getPosition().getX(), 2)
                                + Math.pow(unit.getPosition().getY() - this.getPosition().getY(), 2),
                        1 / 2)) < tempDistance) {
                    nearUnit = unit;
                }
            }
            if (nearUnit.getPosition().getX() < 2 && nearUnit.getPosition().getY() < 2) {

                attack(nearUnit);
            } else {
                if (nearUnit.getPosition().getX() < nearUnit.getPosition().getY()) {
                    this.getPosition().setX(this.getPosition().getX() + 2);
                } else {
                    this.getPosition().setY(this.getPosition().getY() + 2);
                }
            }

        }

    }

    public String getInfo() {
        return "Я разбойник " + getName();
    }

}
