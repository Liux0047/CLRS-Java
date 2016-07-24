package util;

/**
 * Created by Allen on 7/24/2016.
 */
public class SortingUtil {
    public static boolean isCorrect(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
