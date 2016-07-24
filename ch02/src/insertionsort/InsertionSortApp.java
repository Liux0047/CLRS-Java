package insertionsort;

/**
 * Created by Allen on 7/24/2016.
 */
public class InsertionSortApp {

    public static void main(String[] args) {
        int[] a = {5, 2, 4, 6, 1, 3};
        InsertionSort.sort(a);
        if (isCorrect(a)) {
            for (int i : a) {
                System.out.print(i + " ");
            }
        } else {
            System.out.println("Algo incorrect");
        }
    }

    public static boolean isCorrect(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
