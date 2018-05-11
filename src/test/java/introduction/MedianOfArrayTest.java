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



    /**
     * Comparing the actual and the expected index of the median
     */
    @Test
    public void test_median() {
        int[] findMedianArray = { 1, 2, 3, 4, 1, 5 };
        int   actualMedianIndex    = 3;
        Assert.assertEquals(MedianOfArray.findMedianIndex(findMedianArray), actualMedianIndex);
    }
    
    /**
     * Comparing the actual and the expected index of the median
     */
    @Test
    public void test_closeMedian() {
        int[] findMedianArray = { 1, 2, 3, 1, 5 };
        int   closeMedianIndex    =  2;
        Assert.assertEquals(MedianOfArray.findMedianIndex(findMedianArray), closeMedianIndex);
    }

}
