package courseErrors.hw1.frthExercise;
import java.util.Arrays;

public class Utils implements Command {
    private Integer[] array1, array2;

    public Utils(Integer[] array1, Integer[] array2){
        this.array1 = array1;
        this.array2 = array2;
    }

    private Integer[] calculateQuotient(Integer[] array1, Integer[] array2) {
        if (array1.length != array2.length) {
            throw new RuntimeException("Длины массивов не равны");
        }

        Integer[] result = new Integer[array1.length];

        for (int i = 0; i < array1.length; i++) {
            if (array2[i] == 0) {
                throw new RuntimeException("Деление на ноль");
            } else if (array1[i] == null || array2[i] == null) {
                throw new RuntimeException("Один из элементов массива не существует");
            }
            result[i] = array1[i] / array2[i];
        }

        return result;
    }

    @Override
    public void Execute() {
        try {
            System.out.println(Arrays.toString(calculateQuotient(array1, array2)));
        } catch (RuntimeException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}

