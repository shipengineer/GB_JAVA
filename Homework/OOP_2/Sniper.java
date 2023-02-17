package Homework.OOP_2;

public class Sniper extends Creature {
    // интерфейс нападения подвязываю на основе ловкости

    public Sniper(String name) {
        super(name, 12, 10, 32, 8, 10, 15, 9, 0, 0);

    }

    @Override
    public void step() {

    }

    public String getInfo() {
        return "Я снайпер " + name;
    }

}
