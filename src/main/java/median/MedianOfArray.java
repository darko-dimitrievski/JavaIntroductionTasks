package median;

/**
 * <h1>Find index of the median of element of an array!</h1>
 * A median is such an element that the
 * difference of the sums of the elements
 * in the left and the right are equal.
 *
 * @author darko.dimitrievski
 */
public class MedianOfArray {

    /**
     * Finds the index of the median of element of an array.
     *
     * @param numbers array of integers
     * @return index of the median.
     */
    public static int findMedianIndex(final int[] numbers) {
        int sum = 0;
        int median = 0;
        int sumRight = 0;
        int sumLeft = 0;
        int lowestSumDifference = Integer.MAX_VALUE;
        int closestToMedian = 0;
        for (Integer element : numbers) {
            sum += element.intValue();
        }

        if (numbers.length != 1) {
            for (int i = 0; i < (numbers.length - 1); i++) {
                sumLeft += numbers[i];
                
                int nextIndex = i + 1;
                sumRight = sum - numbers[nextIndex] - sumLeft;

                if (lowestSumDifference >  Math.abs(sumLeft - sumRight)) {
                    lowestSumDifference =  Math.abs(sumLeft - sumRight);
                    closestToMedian = median++;
                }

                if (sumRight == sumLeft) {
                    median = nextIndex;
                    break;
                }

                if (nextIndex == (numbers.length - 1)) {
                    median = closestToMedian;
                    break;
                }
            }
        } else {
            median = numbers[0];
        }
        return median;
    }
}
