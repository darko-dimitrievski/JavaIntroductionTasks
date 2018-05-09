/**
 *
 */
package introduction;

import org.junit.Assert;
import org.junit.Test;

import mergeSort.MergeSortAlgorithm;


/**
 * @author darko.dimitrievski
 *
 */
public class MergeSortAlgorithmTest {

    /**
     * Tests if two subarrays are merged and sorted properly
     */
    @Test
    public void test() {
        int[] firstHalfSubarray = { 1, 3, 5 };
        int[] secondHalfSubarray = { 2, 4, 6 };

        int[] expectedArray = { 1, 2, 3, 4, 5, 6 };
        int[] actualArray = MergeSortAlgorithm.merge(firstHalfSubarray, secondHalfSubarray);

        Assert.assertArrayEquals(actualArray, expectedArray);

    }

}
