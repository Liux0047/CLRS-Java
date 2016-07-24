package mergesort;

import static util.SortingUtil.isCorrect;

/**
 * Created by Allen on 7/24/2016.
 */
public class MergeSortApp {

    public static void main(String[] args) {
        int[] input = {5, 2, 4, 7, 1, 3, 2, 6};
        MergeSort.mergeSort(input, 0, input.length - 1);

        if (isCorrect(input)) {
            for (int i : input) {
                System.out.print(i + " ");
            }
        } else {
            System.out.println("Algo incorrect");
        }
    }

}
