package countinversions;

/**
 * Created by Allen on 7/30/2016.
 */
public class CountInversionsApp {

    public static void main(String[] args) {
        int[] input = {2, 3, 8, 6, 1};
        int counts = CountInversions.sortAndCount(input, 0, input.length-1);
        System.out.println(counts);
    }

}
