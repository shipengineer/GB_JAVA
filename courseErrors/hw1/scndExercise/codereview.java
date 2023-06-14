package courseErrors.hw1.scndExercise;

public class codereview {
    public static void main(String[] args) {

    }

    public static int sum2d(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 5; j++) {
                int val = Integer.parseInt(arr[i][j]);
                sum+=val;
            }
        }
        return sum;
    }
}

//1. `NumberFormatException` - если значение элемента массива не может быть преобразовано в число типа `int` при вызове метода `Integer.parseInt()`.
//2. `ArrayIndexOutOfBoundsException` - если индекс строки или столбца выходит за пределы массива `arr`.
//3. `NullPointerException` - если массив `arr` равен `null`.