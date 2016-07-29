package maxsubarray;

/**
 * Created by Allen on 7/29/2016.
 */
public class MaxSubArrayApp {

    public static void main(String[] args) {
        int[] input = {13, -3, -25, 20, -3, -16, -23, 18, 20, -7, 12, -5, -22, 15, -4, 7};
        SubArraySum result = MaxSubArray.findMaxSubArray(input, 0, input.length - 1);

        System.out.println(result.getSum());

    }
}
