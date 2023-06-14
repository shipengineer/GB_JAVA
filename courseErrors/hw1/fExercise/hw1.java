package courseErrors.hw1.fExercise;

/**
 * hw1
 */
public class hw1 {

    public static void main(String[] args) {
          Exceptions exceptions = new Exceptions();
        try {
            exceptions.throwNullPointerException();
        } catch (NullPointerException e) {
            System.out.println("Перехвачено исключение: " + e);
        }

        try {
            exceptions.throwArrayIndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Перехвачено исключение: " + e);
        }

        try {
            exceptions.throwNumberFormatException();
        } catch (NumberFormatException e) {
            System.out.println("Перехвачено исключение: " + e);
        }
    }
}