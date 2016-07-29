package maxsubarray;

/**
 * Created by Allen on 7/29/2016.
 */
public class SubArraySum {

    private int low, high, sum;

    public SubArraySum(int low, int high, int sum) {
        this.low = low;
        this.high = high;
        this.sum = sum;
    }

    public int getLow() {
        return low;
    }

    public int getHigh() {
        return high;
    }

    public int getSum() {
        return sum;
    }

    public void setLow(int low) {
        this.low = low;
    }

    public void setHigh(int high) {
        this.high = high;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}
