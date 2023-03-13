package Homework.OOP_3.Units;

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
        return "Я монах " + getName();
    }
}