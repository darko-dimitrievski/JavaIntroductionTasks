package median;

// TODO: The 3 classes: MedianOfArray, MergeSortAlgorithm and SumContiguousSubarray all have methods that do something
// with arrays. A good idea would be to merge them into sinngle class ArrayUtils and have the logic there.

/**
 * TODO: Missing javadoc.
 *
 * @author darko.dimitrievski
 */
public class MedianOfArray {

    /**
     * Finds the index of the median of element of an array.
     * <p>
     * <p>
     * TODO: the parameter name is wrong. Also array is a good name, not sure why you have changed it.
     *
     * @param array of integers findMedianArray
     * @return index of the median.
     */
    public static int findIndexOfMedianOfAnArray(final int[] findMedianArray) {
        int median = 0;
        // TODO: your algorithm has time complexity of O(n^2) it can be O(n). Think how you can improve it.
        // TODO: also here the problem is with the task description, but every array has a median. We just seek the
        // minimum difference between the two sums.
        for (int i = 0; i < (findMedianArray.length - 1); i++) {
            int medianIndex = i + 1;
            // TODO: leftSum and rightSum would be better names.
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
