package SortStrategies;

public class MergeSortStrategy implements SortStrategy {
    @Override
    public long sort(int[] numbers) {

        long startTime = System.nanoTime(); // Startzeit

        mergeSort(numbers, 0, numbers.length - 1);
        System.out.println("MergeSort: " + java.util.Arrays.toString(numbers));
        long endTime = System.nanoTime();    // Endzeit

        long duration = endTime - startTime; // Dauer in Nanosekunden
        System.out.println("Dauer: " + duration + " ns");
        return duration;

    }

    private void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    private void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        System.arraycopy(arr, left, L, 0, n1);
        System.arraycopy(arr, mid + 1, R, 0, n2);

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) arr[k++] = L[i++];
            else arr[k++] = R[j++];
        }

        while (i < n1) arr[k++] = L[i++];
        while (j < n2) arr[k++] = R[j++];
    }
}
