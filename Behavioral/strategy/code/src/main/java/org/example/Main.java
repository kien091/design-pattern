package org.example;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 5, 3, 2, 4};
        SortingContext context = new SortingContext(new BubbleSortStrategy());
        context.performSort(array);

        int[] array2 = {1, 5, 3, 2, 4};
        context.setStrategy(new QuickSortStrategy());
        context.performSort(array2);

        int[] array3 = {1, 5, 3, 2, 4};
        context.setStrategy(new MergeSortStrategy());
        context.performSort(array3);
    }
}