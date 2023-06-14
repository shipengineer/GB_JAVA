package courseErrors.hw1.thrdExercise;

import java.util.Arrays;

//Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
// и возвращающий новый массив, каждый элемент которого равен разности элементов
// двух входящих массивов в той же ячейке. Если длины массивов не равны, необходимо
// как-то оповестить пользователя.
public class Main {
    public static void main(String[] args) throws Exception {
        Util taskCalculation = new Util();
        int[] array1 = new int[]{1, 2, 3};
        int[] array2 = new int[]{4, 5, 6};
        Print.NewSOUT(taskCalculation.calculateDifference(array1, array2));

        array1 = new int[]{1, 2, 3};
        array2 = new int[]{4, 5, 6,7};
        Print.NewSOUT(taskCalculation.calculateDifference(array1, array2));


    }
}