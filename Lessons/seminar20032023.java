public class seminar20032023 {
    public static void main(String[] args) {
        int[] arr = { 2, 5, 5, 5, 8, 4, 5, 6, 8, 5 };
        printEvenNumbers(arr);
    }

    public static void printEvenNumbers(int[] arr) {
        for (int x = 0; x < arr.length; x++)
            if (arr[x] % 2 == 0)
                System.out.print(arr[x] + ", ");
    }
}