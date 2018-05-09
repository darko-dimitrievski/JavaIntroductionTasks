package sumContiguousSubarray;

/**
 * TODO: Missing javadoc.
 *
 * @author darko.dimitrievski
 */
public class SumContiguousSubarray {
    /**
     * Calculates max sum of contiguous subarray
     *
     * @param array of integers contiguousSubarray
     * @return maxSum
     */
    public static int maxSumContiguousSubarrayTest(final int[] contiguousSubarray) {
        int maxSum = Integer.MIN_VALUE;
        int nextNumber = 0;

        // TODO: can be replaced with foreach.
        for (int i = 0; i < contiguousSubarray.length; i++) {
            nextNumber = nextNumber + contiguousSubarray[i];
            maxSum = (maxSum < nextNumber) ? nextNumber : maxSum;
            nextNumber = (nextNumber < 0) ? 0 : nextNumber;
        }
        return maxSum;
    }

    // TODO: Do you really need this if you have an unit test?
    public static void main(final String[] args) {
        int[] d = {-2, -3, 4, -1, -6, 1, 5, -3, 4, 5, 7, -3};
        System.out.println(SumContiguousSubarray.maxSumContiguousSubarrayTest(d));
    }
}
