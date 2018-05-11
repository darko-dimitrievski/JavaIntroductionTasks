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
        int[] unsortedArray = { 1, 3, 5, 2, 4, 6 };

        int[] expectedArray = { 1, 2, 3, 4, 5, 6 };
        MergeSortAlgorithm mergesort = new MergeSortAlgorithm();
        int[] actualArray = mergesort.merge(unsortedArray);

        Assert.assertArrayEquals(actualArray, expectedArray);

    }

}
