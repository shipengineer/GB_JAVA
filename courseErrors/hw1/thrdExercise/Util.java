package courseErrors.hw1.thrdExercise;
public class Util {
    public int[] calculateDifference(int[] array1, int[] array2) throws Exception {
        if (array1.length != array2.length) {
            throw new Exception(String.format("%S метод не может быть реализован так как длины массивов не совпадают",new Object(){}.getClass().getEnclosingMethod().getName()));
        }

        int[] result = new int[array1.length];

        for (int i = 0; i < array1.length; i++) {
            result[i] = array1[i] - array2[i];
        }

        return result;
    }
}