package SortStrategies;

public class InsertionSortStrategy implements SortStrategy {
    @Override
    public long sort(int[] numbers) {
        long startTime = System.nanoTime(); // Startzeit
        for (int i = 1; i < numbers.length; i++) {
            int key = numbers[i];
            int j = i - 1;
            while (j >= 0 && numbers[j] > key) {
                numbers[j + 1] = numbers[j];
                j--;
            }
            numbers[j + 1] = key;
        }
        System.out.println("InsertionSort: " + java.util.Arrays.toString(numbers));
        long endTime = System.nanoTime();    // Endzeit

        long duration = endTime - startTime; // Dauer in Nanosekunden
        System.out.println("Dauer: " + duration + " ns");
        return duration;

    }
}
