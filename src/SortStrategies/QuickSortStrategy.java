package SortStrategies;

// QuickSort
public class QuickSortStrategy implements SortStrategy {
    @Override
    public long sort(int[] numbers) {
        long startTime = System.nanoTime(); // Startzeit
        quickSort(numbers, 0, numbers.length - 1);
        System.out.println("QuickSort: " + java.util.Arrays.toString(numbers));
        long endTime = System.nanoTime();    // Endzeit
        long duration = endTime - startTime; // Dauer in Nanosekunden
        System.out.println("Dauer: " + duration + " ns");
        return duration;

    }

    private void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i]; arr[i] = arr[j]; arr[j] = temp;
            }
        }
        int temp = arr[i + 1]; arr[i + 1] = arr[high]; arr[high] = temp;
        return i + 1;
    }
}