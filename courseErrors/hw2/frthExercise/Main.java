package courseErrors.hw2.frthExercise;

//Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
// Пользователю должно показаться сообщение, что пустые строки вводить нельзя.


public class Main {
    public static void main(String[] args) {
        String input = "";
        while (!input.toUpperCase().equals("EXIT")) {
            input = InputUtils.getStringInput();
        }
    }
}