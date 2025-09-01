import SortStrategies.SortStrategy;

public class NumberList {
    private int[] numbers;
    private SortStrategy sortStrategy;

    public NumberList(int[] numbers, SortStrategy sortStrategy) {
        this.numbers = numbers;
        this.sortStrategy = sortStrategy;
    }


    public NumberList(int[] numbers) {
        this.numbers = numbers;
    }

    public NumberList() {

    }

    public void setSortStrategy(SortStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }

    public SortStrategy getSortStrategy() {
        return sortStrategy;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    public int[] sort() {
        if (sortStrategy == null) {
            System.out.println("Keine Sortierstrategie gesetzt!");
            return null;
        }
        return sortStrategy.sort(numbers);
    }
}
