import java.util.Random;

/**
 * Реализовать сортировку кучей
 */
public class HW_1 {

    public static void main(String[] args) {
        int[] array = new int[100];
        createArray(array);
        sort(array);
        heapify(array, array.length, array[0]);
        printArray(array);
    }
    
    public static void createArray(int[] n) {
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

    public static void sort(int[] n) {
        for (int i = n.length / 2 - 1; i >= 0; i--)
            heapify(n, n.length, i);

        for (int i = n.length - 1; i >= 0; i--) {
            int swap = n[0];
            n[0] = n[i];
            n[i] = swap;

            heapify(n, i, 0);
        }
    }

    private static void heapify(int[] n, int heapSize, int rootIndex) {
        int largest = rootIndex;
        int leftChild = 2 * rootIndex + 1;
        int rightChild = 2 * rootIndex + 2;

        if (leftChild < heapSize && n[leftChild] > n[largest])
            largest = leftChild;

        if (rightChild < heapSize && n[rightChild] > n[largest])
            largest = rightChild;

        if (largest != rootIndex) {
            int swap = n[rootIndex];
            n[rootIndex] = n[largest];
            n[largest] = swap;

            heapify(n, heapSize, largest);
        }
    }
}