/**
 *
 */
package introduction;

import median.MedianOfArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


/**
 * TODO: you can write as a javadoc which class you are testing.
 *
 * @author darko.dimitrievski
 */
public class MedianOfArrayTest {

    int[] findMedianArray = {2, 3, 1, 5, 4, 2};
    int actualMedian = 5;

    /**
     * Comparing the actual and the expected index of the median
     */
    @Test
    public void findIndexOfMedianOfAnArrayTest() {
        Assertions.assertEquals(MedianOfArray.findIndexOfMedianOfAnArray(findMedianArray), actualMedian);
    }

}
