import SortStrategies.SortStrategy;

public class NumberList {
    private int[] numbers;
    private SortStrategy sortStrategy;

    public NumberList(int[] numbers) {
        this.numbers = numbers;
    }

    public void setSortStrategy(SortStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }

    public long sort() {
        if (sortStrategy == null) {
            System.out.println("Keine Sortierstrategie gesetzt!");
            return -1;
        }
        return sortStrategy.sort(numbers);
    }
}
