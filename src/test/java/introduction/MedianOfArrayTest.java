/**
 *
 */
package introduction;

import org.junit.Assert;
import org.junit.Test;

import median.MedianOfArray;


/**
 * @author darko.dimitrievski
 *
 */
public class MedianOfArrayTest {

    int[] findMedianArray = { 2, 3, 1, 5, 4, 2 };
    int   actualMedian   = 5;

    /**
     * Comparing the actual and the expected index of the median
     */
    @Test
    public void findIndexOfMedianOfAnArrayTest() {
        Assert.assertEquals(MedianOfArray.findIndexOfMedianOfAnArray(findMedianArray), actualMedian);
    }

}
