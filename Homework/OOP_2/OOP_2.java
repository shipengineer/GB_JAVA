package Homework.OOP_2;

import java.util.ArrayList;
import java.util.Collections;

import java.util.List;
import java.util.Random;

public class OOP_2 {
    public static void main(String[] args) {

        List<Creature> Team_A = FillTeamA(5);
        for (Creature creature : Team_A) {
            System.out.println(creature.getInfo());

        }
        List<Creature> Team_B = FillTeamB(5);
        SpeedComparator speedComparator = new SpeedComparator();

        List<Creature> merge = new ArrayList<Creature>();
        merge.addAll(Team_A);
        merge.addAll(Team_B);
        Collections.sort(merge, speedComparator);
        for (Creature creature : merge) {
            System.out.println(creature.getAllInfo());
        }

    }

    public static List<Creature> FillTeamA(int countMemeber) {
        String[] names = { "Педро", "Симон", "Танджиро", "Торико", "Санджи", "Варик", "Васян", "Дренженштыкевич",
                "Дзэницу" };
        List<Creature> squad = new ArrayList<Creature>();
        int cs = 0;
        Random random = new Random();
        for (int i = 0; i < countMemeber + 1; i++) {
            cs = random.nextInt(0, 3);
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
                    squad.add(new Warlock(names[random.nextInt(names.length)]));

                default:
                    break;
            }
        }
        return squad;
    }

    public static List<Creature> FillTeamB(int countMemeber) {
        String[] names = { "Педро", "Симон", "Танджиро", "Торико", "Санджи", "Варик", "Васян", "Дренженштыкевич",
                "Дзэницу" };
        List<Creature> squad = new ArrayList<Creature>();
        int cs = 0;
        Random random = new Random();
        for (int i = 0; i < countMemeber + 1; i++) {
            cs = random.nextInt(0, 3);
            switch (cs) {
                case 0:
                    squad.add(new Villager(names[random.nextInt(names.length)]));

                    break;
                case 1:
                    squad.add(new Xbowman(names[random.nextInt(names.length)]));
                    break;

                case 2:
                    squad.add(new Monk(names[random.nextInt(names.length)]));
                    break;
                case 3:
                    squad.add(new Spearman(names[random.nextInt(names.length)]));
                    break;
                default:
                    break;
            }
        }
        return squad;
    }

}
