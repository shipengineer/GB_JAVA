package Homework.OOP_3.Units;

import java.util.List;

public class Sniper extends Creature {

    public Sniper() {
        super("Noname", 12, 10, 32, 8, 10, 15, 9, 0, 0, 0, 0);
        this.priorityHealerEnum = PriorityHealerEnum.HIGHT;
    }

    public Sniper(String name, int x, int y) {
        super(name, 12, 10, 32, 8, 10, 15, 9, 0, 0, x, y);
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
        return "Я снайпер " + getName();
    }

}
