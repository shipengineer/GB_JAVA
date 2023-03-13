package Homework.OOP_3.Units;

import java.util.List;

public class Xbowman extends Creature {
    public Xbowman() {
        super("Noname", 6, 3, 16, 2, 3, 10, 4, 0, 0, 0, 0);
        this.priorityHealerEnum = PriorityHealerEnum.HIGHT;
    }

    public Xbowman(String name, int x, int y) {
        super(name, 6, 3, 16, 2, 3, 10, 4, 0, 0, x, y);
        this.priorityHealerEnum = PriorityHealerEnum.HIGHT;

    }

    @Override
    public void step(List<Creature> Team_B, List<Creature> Team_A) {
        Creature nearUnit = Team_B.get(0);
        int tempDistance = 128;

        if (getCurrentHealth() > 0 || getShots() > 0) {
            for (Creature unit : Team_B) {
                if ((Math.pow(
                        Math.pow(unit.getPosition().getX() - this.getPosition().getX(), 2)
                                + Math.pow(unit.getPosition().getY() - this.getPosition().getY(), 2),
                        1 / 2)) < tempDistance) {
                    nearUnit = unit;
                }
            }
            attack(nearUnit);
            boolean isAmmo = false;
            for (Creature friend : Team_A) {
                if (friend instanceof Villager) {
                    isAmmo = true;
                }
            }
            if (isAmmo == false) {
                this.setShots(this.getShots() - 1);
            }
        }

    }

    public String getInfo() {
        return "Я арбалетчик " + getName();
    }

}