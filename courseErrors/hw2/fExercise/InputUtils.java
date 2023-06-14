package courseErrors.hw2.fExercise;

import java.util.Scanner;

public class InputUtils {
    public static float getFloatInput() {
        Scanner scanner = new Scanner(System.in);
        float result = 0;
        boolean validInput = false;

        while (!validInput) {
            System.out.print("Введите дробное число: ");

            if (scanner.hasNextFloat()) {
                result = scanner.nextFloat();
                validInput = true;
            } else {
                System.out.println("Ошибка: введено некорректное значение");
                scanner.next();
            }
        }

        return result;
    }

}