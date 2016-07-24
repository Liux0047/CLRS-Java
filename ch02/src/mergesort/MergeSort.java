package mergesort;

/**
 * Created by Allen on 7/24/2016.
 */
public class MergeSort {

    public static void mergeSort(int[] input, int begin, int end) {
        if (end > begin) {
            int mid = (end + begin) / 2 + 1;
            mergeSort(input, begin, mid -1);
            mergeSort(input, mid, end);
            merge(input, begin, mid, end);
        }
    }

    public static void merge(int[] input, int begin, int mid, int end) {
        int leftSize = mid - begin;
        int rightSize = end - mid + 1;

        int[] left = new int[leftSize + 1];
        System.arraycopy(input, begin, left, 0, leftSize);

        int[] right = new int[rightSize + 1];
        System.arraycopy(input, mid, right, 0, rightSize);

        left[leftSize] = right[rightSize] = Integer.MAX_VALUE;

        int i = 0, j = 0;
        for (int k = begin; k <= end; k++) {
            if (left[i] < right[j]) {
                input[k] = left[i++];
            } else {
                input[k] = right[j++];
            }
        }

    }
}
