package courseErrors.hw2.frthExercise;

import java.util.Scanner;

public class InputUtils {
    public static String getStringInput() {
        Scanner scanner = new Scanner(System.in);
        String result = "";
        try {
            System.out.print("Введите строку: ");
            String input = scanner.nextLine();
            result = input;

            if (input.isEmpty()) {
                throw new Exception("Пустые строки вводить нельзя");
            }

            System.out.println("Вы ввели: " + input);
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        return result;
    }
}