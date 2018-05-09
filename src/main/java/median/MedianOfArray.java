package median;

/**
 * @author darko.dimitrievski
 *
 */
public class MedianOfArray {

    /**
     * Finds the index of the median of element of an array.
     *
     * @param array of integers findMedianArray
     * @return index of the median.
     */
    public static int findIndexOfMedianOfAnArray(final int[] findMedianArray) {
        int median = 0;
        for (int i = 0; i < (findMedianArray.length - 1); i++) {
            int medianIndex = i + 1;
            int firstHalfSubarraySum = 0;
            for (int k = 0; k < medianIndex; k++) {
                firstHalfSubarraySum += findMedianArray[k];
            }
            median = findMedianArray[medianIndex];
            int secondHalfSubarraySum = 0;
            for (int j = i + 2; j < findMedianArray.length; j++) {
                secondHalfSubarraySum += findMedianArray[j];
            }
            if (firstHalfSubarraySum == secondHalfSubarraySum) {
                break;
            }
        }
        return median;
    }
}
