package courseErrors.hw1.frthExercise;

import java.util.Arrays;

//* Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
// и возвращающий новый массив, каждый элемент которого равен частному элементов
// двух входящих массивов в той же ячейке. Если длины массивов не равны, необходимо как-то
// оповестить пользователя. Важно: При выполнении метода единственное исключение,
// которое пользователь может увидеть - RuntimeException, т.е. ваше.
public class Main {
    public static void main(String[] args) {
        Integer[] array1 = {1, 2, 3};
        Integer[] array2 = {4, 5, 6};
        Utils Utils = new Utils(array1, array2);
        Utils.Execute();

        array1 = new Integer[]{1, 2, 3, 5};
        array2 = new Integer[]{4, 5, 6, 0};
        Utils = new Utils(array1, array2);
        Utils.Execute();

        array1 = new Integer[]{1, 2, 3, 5};
        array2 = new Integer[]{4, null, 6, 0};
        Utils = new Utils(array1, array2);
        Utils.Execute();


        array1 = new Integer[]{1, 2, 3, 5};
        array2 = new Integer[]{4, 6, 0};
        Utils = new Utils(array1, array2);
        Utils.Execute();
    }
}