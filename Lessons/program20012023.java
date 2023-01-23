
import java.util.Arrays;

public class program20012023 {
    public static void main(String[] args) {

        int[] income_array = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println(Arrays.toString(EvenArray(income_array)));
    }

    public static int[] EvenArray(int[] array) {
        int[] newArray = new int[0];
        for (int element : array) {
            if (element % 2 == 0) {
                newArray = Arrays.copyOf(newArray, newArray.length + 1);
                newArray[newArray.length - 1] = element;
            }
        }

        return newArray;
    }
}
// {
// return Arrays.stream(arr)
// .filter(x -> x % 2 == 0); }
