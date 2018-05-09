/**
 *
 */
// TODO: remove this trailing comment.
package introduction;

import org.junit.Assert;
import org.junit.Test;

import sumContiguousSubarray.SumContiguousSubarray;


/**
 * TODO: you can write as a javadoc which class you are testing.
 *
 * @author darko.dimitrievski
 *
 */
public class SumContiguousSubarrayTest {

    /**
     * Comparing the actual and the expected sum of contiguous subarray
     */
    @Test
    public void maxSumContiguousSubarrayTest() {
        int[] contiguousSubarrayTest = { -2, -3, 4, -1, -2, 1, 5, -3 };
        int maxSum = 7;
        // TODO: Actual and expected are switched here. This makes reading test errors confisung.
        Assert.assertEquals(SumContiguousSubarray.maxSumContiguousSubarrayTest(contiguousSubarrayTest), maxSum);
    }
}
