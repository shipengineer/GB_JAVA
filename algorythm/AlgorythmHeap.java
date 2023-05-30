import java.util.Random;

public class AlgorythmHeap {

    public static void main(String[] args) {
        int[] array = new int[10];
        ArrayGenerator(array);
        sort(array);
        heapify(array, array.length, array[0]);
        printArray(array);
    }
    
    public static void ArrayGenerator(int[] n) {
        Random rnd = new Random();
        for (int i = 0; i < n.length; i++) {
            n[i] = rnd.nextInt(10000);
        }
    }

    public static void printArray(int[] n) {
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i] + " ");
        }
    }

    public static void sort(int[] array) {
        for (int i = array.length / 2 - 1; i >= 0; i--)
            heapify(array, array.length, i);

        for (int i = array.length - 1; i >= 0; i--) {
            int swap = array[0];
            array[0] = array[i];
            array[i] = swap;

            heapify(array, i, 0);
        }
    }

    private static void heapify(int[] n, int heapSize, int rootIndex) {
        int largest = rootIndex;
        int left = 2 * rootIndex + 1;
        int right = 2 * rootIndex + 2;

        if (left < heapSize && n[left] > n[largest])
            largest = left;

        if (right < heapSize && n[right] > n[largest])
            largest = right;

        if (largest != rootIndex) {
            int swap = n[rootIndex];
            n[rootIndex] = n[largest];
            n[largest] = swap;

            heapify(n, heapSize, largest);
        }
    }
}