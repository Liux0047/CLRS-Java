package insertionsort;

/**
 * Created by Allen on 7/24/2016.
 */
public class InsertionSort {

    public static void sort(int[] input) {
        for (int i = 1; i < input.length; i++) {
            int key = input[i];
            int j = i - 1;
            while (j >= 0 && key < input[j]) {
                input[j + 1] = input[j];
                j--;
            }
            input[j + 1] = key;
        }
    }
}
