package Homework.OOP_3;

import java.util.ArrayList;
import java.util.Collections;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

import Homework.OOP_3.Units.*;

public class OOP_3 {
    static final int UNITS = 10;
    public static ArrayList<Creature> allTeam = new ArrayList<>();
    public static ArrayList<Creature> holyTeam = new ArrayList<>();
    public static ArrayList<Creature> darkTeam = new ArrayList<>();

    public static void main(String[] args) {

        List<Creature> holyTeam = FillTeamA(5);
        for (Creature creature : holyTeam) {
            System.out.println(creature.getInfo());

        }
        List<Creature> darkTeam = FillTeamB(5);
        SpeedComparator speedComparator = new SpeedComparator();

        List<Creature> merge = new ArrayList<Creature>();
        merge.addAll(holyTeam);
        merge.addAll(darkTeam);
        Collections.sort(merge, speedComparator);

        for (Creature creature : holyTeam) {
            creature.step(darkTeam, holyTeam);

        }
        try (Scanner user_input = new Scanner(System.in)) {
            System.out.print("Press Enter to begin.");
            user_input.nextLine();
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
                    squad.add(new Villager(names[random.nextInt(names.length)], i, i + 2));

                    break;
                case 1:
                    squad.add(new Rouge(names[random.nextInt(names.length)], i, i + 2));
                    break;
                case 2:
                    squad.add(new Sniper(names[random.nextInt(names.length)], i, i + 2));
                    break;
                case 3:
                    squad.add(new Warlock(names[random.nextInt(names.length)], i, i + 2));

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
                    squad.add(new Villager(names[random.nextInt(names.length)], i, i + 2));

                    break;
                case 1:
                    squad.add(new Xbowman(names[random.nextInt(names.length)], i, i + 2));
                    break;

                case 2:
                    squad.add(new Monk(names[random.nextInt(names.length)], i, i + 2));
                    break;
                case 3:
                    squad.add(new Spearman(names[random.nextInt(names.length)], i, i + 2));
                    break;
                default:
                    break;
            }
        }
        return squad;
    }

}
