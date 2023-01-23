package Homework;

import java.util.Scanner;

/**
 * Homework#1
 */
public class Homework_1 {

    public static void main(String[] args) {

        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Введите номер порядка треугольника: ");
            // вызов функции по приянтому значению из консоли с последующим выводом
            System.out.println(TriangleNumber(in.nextInt()));
        }
    }

    // опредеелние функции
    public static int TriangleNumber(int side) {
        return side * (side + 1) / 2;
    }
}