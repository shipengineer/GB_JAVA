package Homework;

import java.util.Scanner;

/**
 * Homework#1
 */
public class Homework_1 {

    public static void main(String[] args) {
        System.out.println(TriangleNumber(recive()));
    }

    public static int recive() {
        boolean verification = false;
        String recived_number = "";
        while (verification == false) {

            Scanner in = new Scanner(System.in);
            System.out.println("Введите номер порядка треугольника: ");
            recived_number = in.nextLine();
            int count = 0;
            for (Character item : recived_number.toCharArray()) {
                if (!Character.isDigit(item)) {
                    verification = false;
                } else {
                    count++;
                }
            }
            if (count == recived_number.length()) {
                verification = true;

            }

        }

        return Integer.parseInt(recived_number);

    }

    // определение функции нахождения треугольного числа
    public static int TriangleNumber(int side) {
        return side * (side + 1) / 2;
    }
}