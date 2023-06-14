package courseErrors.hw2.thrdExersice;
//Задание 3
//
//public static void main(String[] args) throws Exception {
//        try {
//        int a = 90;
//        int b = 3;
//        System.out.println(a / b);
//        printSum(23, 234);
//        int[] abc = { 1, 2 };
//        abc[3] = 9;
//        } catch (Throwable ex) {
//        System.out.println("Что-то пошло не так...");
//        } catch (NullPointerException ex) {
//        System.out.println("Указатель не может указывать на null!");
//        } catch (IndexOutOfBoundsException ex) {
//        System.out.println("Массив выходит за пределы своего размера!");
//        }
//        }
//public static void printSum(Integer a, Integer b) throws FileNotFoundException {
//        System.out.println(a + b);
//        }


import java.io.FileNotFoundException;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws Exception {
        int[] abc = {1, 2};
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            System.out.println(abc[2]);
        } catch (ArithmeticException ex) {
            System.out.println("Деление на ноль!");
        } catch (IllegalArgumentException ex) {
            System.out.println("Неверные аргументы метода!");
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Выход за пределы массива!");
        }

    }

    public static void printSum(Integer a, Integer b) throws FileNotFoundException {
        System.out.println(a + b);
    }

}