package maxsubarray;

/**
 * Created by Allen on 7/29/2016.
 */
public class MaxSubArray {

    private static SubArraySum findMaxCrossingSubArray(int[] A, int low, int mid, int high) {
        int leftMax = Integer.MIN_VALUE, rightMax = Integer.MIN_VALUE;
        int leftSum = 0, rightSum = 0;
        int left = mid, right = mid + 1;

        for (int i = mid; i >= low; i--) {
            leftSum += A[i];
            if (leftSum > leftMax) {
                leftMax = leftSum;
                left = i;
            }
        }

        for (int i = mid + 1; i <= high; i++) {
            rightSum += A[i];
            if (rightSum > rightMax) {
                rightMax = rightSum;
                right = i;
            }
        }

        return new SubArraySum(left, right, leftMax + rightMax);
    }

    public static SubArraySum findMaxSubArray(int[] A, int low, int high) {
        if (low == high) {
            return new SubArraySum(low, high, A[low]);
        }
        int mid = (low + high) / 2;
        SubArraySum leftMax = findMaxSubArray(A, low, mid);
        SubArraySum rightMax = findMaxSubArray(A, mid + 1, high);
        SubArraySum crossingMax = findMaxCrossingSubArray(A, low, mid, high);

        if (leftMax.getSum() >= rightMax.getSum() && leftMax.getSum() >= crossingMax.getSum()) {
            return leftMax;
        } else if (rightMax.getSum() >= leftMax.getSum() && rightMax.getSum() >= crossingMax.getSum()) {
            return rightMax;
        } else {
            return crossingMax;
        }

    }
}

