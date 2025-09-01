import SortStrategies.*;
import java.util.Random;
import java.util.TreeSet;

public class Sortieralgorithmen {
    public static void main(String[] args) {
        int size = 10000;       // Anzahl der Elemente
        int minValue = 1;       // Minimalwert
        int maxValue = 100000;  // Maximalwert

        int[] numbers = generateRandomList(size, minValue, maxValue);


        NumberList list = new NumberList(numbers);

        // BubbleSort
        SortStrategy sortStrategy = new BubbleSortStrategy();
        list.setSortStrategy(sortStrategy);
        int [] bubbleSortStrategyList = list.sort();

        // QuickSort
        sortStrategy = new QuickSortStrategy();
        list.setSortStrategy(sortStrategy);
        int [] QuickSortStrategyList = list.sort();

        // InsertionSort
        sortStrategy = new InsertionSortStrategy();
        list.setSortStrategy(sortStrategy);
        int [] InsertionSortStrategyList = list.sort();

        // MergeSort
        sortStrategy = new MergeSortStrategy();
        list.setSortStrategy(sortStrategy);
        int [] MergeSortStrategyList = list.sort();

        // SelectionSort
        sortStrategy = new SelectionSortStrategy();
        list.setSortStrategy(sortStrategy);
        int [] SelectionSortStrategyList = list.sort();

    }

    public static int[] generateRandomList(int size, int minValue, int maxValue) {
        int[] numbers = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            numbers[i] = random.nextInt(maxValue - minValue + 1) + minValue;
        }
        return numbers;
    }

}
