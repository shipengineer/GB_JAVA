package OOP_1;

// Крестьянин, разбойник, снайпер, колдун, копейщик, арбалетчик, монах.
//  Для каждого сформировать список свойств и возможных действий. 
//  Напрнимер свойство скорость, действие нанести удар. 
//  Проанализировать получившиеся свойства и действия персонажей и создать Обобщённый класс описывающий свойства и действия имеющиеся у всех персонажей. 
//  Создать этот класс.
//  Создать классы для каждого типа персонажей наследующие и расширяющие абстрактный(обобщённый) класс. 
// В основной программе создать по одному экземпляру каждого типа персонажей.
public class OOP_1 {
    public static void main(String[] args) {
        Villager villager_1 = new Villager("Frank", 7, 5, 2);
        Rouge rouge_1 = new Rouge("Stan", 5, 7, 4);
        Bowman bowman_1 = new Bowman("Cris", 2, 8, 5);
        Warlock warlock_1 = new Warlock("Leonard", 2, 4, 9);
        Spearman spearman_1 = new Spearman("Pedro", 5, 7, 2);
        Xbowman xbowman_1 = new Xbowman("Vernon", 4, 6, 4);
        Monk monk_1 = new Monk("Raas", 5, 5, 5);
        System.out.println(monk_1.getInfo());
    }

    interface Attack {
        void attack();
    }

}
