package SortStrategies;

public class SelectionSortStrategy implements SortStrategy {
    @Override
    public  int[] sort(int[] numbers) {

        long startTime = System.nanoTime(); // Startzeit

        int n = numbers.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (numbers[j] < numbers[minIdx]) minIdx = j;
            }
            int temp = numbers[minIdx];
            numbers[minIdx] = numbers[i];
            numbers[i] = temp;
        }
        System.out.println("SelectionSort: " + java.util.Arrays.toString(numbers));
        long endTime = System.nanoTime();    // Endzeit

        long duration = endTime - startTime; // Dauer in Nanosekunden
        System.out.println("Dauer: " + duration + " ns");
        return numbers;

    }
}
