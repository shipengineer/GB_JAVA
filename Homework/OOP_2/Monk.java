package Homework.OOP_2;

public class Monk extends Creature {
    // интерфейс нападения подвязываю на основе ловкости
    public Monk() {

        super("Noname", 12, 7, 0, -4, -4, 30, 5, 0, 1);

    }

    public Monk(String name) {

        super(name, 12, 7, 0, -4, -4, 30, 5, 0, 1);

    }

    @Override
    public void step() {

    }

    public String getInfo() {
        return "Я монах " + getName();
    }
}