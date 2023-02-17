package Homework.OOP_2;

public class Spearman extends Creature {
    // интерфейс нападения подвязываю на основе ловкости

    public Spearman(String name) {

        super(name, 4, 5, 0, 1, 3, 10, 4, 0, 0);

    }

    @Override
    public void step() {

    }

    public String getInfo() {
        return "Я копейщик " + name;
    }

}