package SortStrategies;

// BubbleSort
public class BubbleSortStrategy implements SortStrategy {

    @Override
    public int[] sort(int[] numbers) {
        long startTime = System.nanoTime(); // Startzeit

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        System.out.println("BubbleSort: " + java.util.Arrays.toString(numbers));
        long endTime = System.nanoTime();    // Endzeit
        long duration = endTime - startTime; // Dauer in Nanosekunden
        System.out.println("Dauer: " + duration + " ns");
        return numbers;
    }
}