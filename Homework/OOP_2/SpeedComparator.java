package Homework.OOP_2;

import java.util.Comparator;

public class SpeedComparator implements Comparator<Creature> {

    public int compare(Creature o1, Creature o2) {
        if (o1.getSpeed() == o2.getSpeed()) {
            return 0;
        } else if (o1.getSpeed() > o2.getSpeed()) {
            return -1;
        } else {
            return 1;
        }
    }
}
