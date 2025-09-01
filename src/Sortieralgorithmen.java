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
        list.setSortStrategy(new BubbleSortStrategy());
        int [] bubbleSortStrategyList = list.sort();

        // QuickSort
        list.setSortStrategy(new QuickSortStrategy());
        int [] QuickSortStrategyList = list.sort();

        // InsertionSort
        list.setSortStrategy(new InsertionSortStrategy());
        int [] InsertionSortStrategyList = list.sort();

        // MergeSort
        list.setSortStrategy(new MergeSortStrategy());
        int [] MergeSortStrategyList = list.sort();

        // SelectionSort
        list.setSortStrategy(new SelectionSortStrategy());
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
