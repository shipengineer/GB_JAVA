package Homework.OOP_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class OOP_2 {
    public static void main(String[] args) {
        String[] names = { "Педро", "Симон", "Танджиро", "Торико", "Санджи", "Варик", "Васян", "Дренженштыкевич",
                "Дзэницу" };
        List<Creature> squad = new ArrayList<Creature>();
        int cs = 0;
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            cs = random.nextInt(0, 6);
            switch (cs) {
                case 0:
                    squad.add(new Villager(names[random.nextInt(names.length)]));

                    break;
                case 1:
                    squad.add(new Rouge(names[random.nextInt(names.length)]));
                    break;
                case 2:
                    squad.add(new Sniper(names[random.nextInt(names.length)]));
                    break;
                case 3:
                    squad.add(new Xbowman(names[random.nextInt(names.length)]));
                case 4:
                    squad.add(new Warlock(names[random.nextInt(names.length)]));
                    break;
                case 5:
                    squad.add(new Monk(names[random.nextInt(names.length)]));
                    break;
                case 6:
                    squad.add(new Spearman(names[random.nextInt(names.length)]));
                    break;
                default:
                    break;
            }
        }

        squad.forEach(x -> System.out.println(x.getInfo()));

    }

}
