package countinversions;

/**
 * Created by Allen on 7/30/2016.
 */
public class CountInversions {

    public static int sortAndCount(int[] A, int begin, int end) {
        if (begin == end) {
            return 0;
        }
        int mid = (begin + end) / 2;
        int leftCount = sortAndCount(A, begin, mid);
        int rightCount = sortAndCount(A, mid + 1, end);
        int splitCount = countSplit(A, begin, mid, end);
        return leftCount + rightCount + splitCount;
    }

    private static int countSplit(int[] A, int begin, int mid, int end) {
        int leftSize = mid - begin + 1, rightSize = end - mid;
        int[] leftArray = new int[leftSize];
        int[] rightArray = new int[rightSize];

        System.arraycopy(A, begin, leftArray, 0, leftSize);
        System.arraycopy(A, mid + 1, rightArray, 0, rightSize);

        int i = 0, j = 0, splitCount = 0;
        for (int k = begin; k <= end; k++) {
            if (i == leftSize) {
                A[k] = rightArray[j++];
            } else if (j == rightSize) {
                A[k] = leftArray[i++];
            } else {
                if (leftArray[i] > rightArray[j]) {
                    A[k] = rightArray[j++];
                    splitCount += leftSize - i;
                } else {
                    A[k] = leftArray[i++];
                }
            }
        }
        return splitCount;
    }
}
