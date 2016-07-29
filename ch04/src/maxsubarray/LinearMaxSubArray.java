package maxsubarray;

/**
 * Created by Allen on 7/29/2016.
 */
public class LinearMaxSubArray {

    public static SubArraySum findMaxSubArray(int[] A) {
        SubArraySum max = new SubArraySum(0, 0, A[0]);
        int reserve = 0;
        int reserveBegin = -1;
        for (int i = 1; i < A.length; i++) {    // i is the j+1 th element
            if (max.getHigh() == i) {
                if (A[i] >= 0) {
                    max.setHigh(i);
                    max.setSum(max.getSum() + A[i]);
                }
            } else {
                if (reserve <= 0 && reserve + A[i] > 0) {   // start from first positive element after max sub array
                    reserveBegin = i;
                    reserve += A[i];
                } else if (reserve > 0 && reserve + A[i] > 0) { //continue to add if positive number
                    reserve += A[i];
                } else if (reserve > 0 && reserve + A[i] <= 0) {    //stop if negative sum encountered

                    reserveBegin = -1;
                    reserve = 0;
                }
                if (reserve > max.getSum() && reserveBegin != -1) {
                    max = new SubArraySum(reserveBegin, i, reserve);
                }
            }
        }
        return max;
    }
}
