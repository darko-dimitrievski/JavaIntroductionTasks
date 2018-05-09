/**
 *
 */
package mergeSort;

/**
 * @author darko.dimitrievski
 *
 */
public class MergeSortAlgorithm {

    public static void main(final String[] args) {
        int[] n = { 1, 3, 5 };
        int[] m = { 2, 4, 6 };
        MergeSortAlgorithm.merge(n, m);
    }

    /**
     *
     * Merges two subarrays into one
     *
     * @param firstHalfSubarray
     * @param secondHalfSubarray
     * @return sorted merged array
     */
    public static int[] merge(final int[] firstHalfSubarray, final int[] secondHalfSubarray) {
        int[] sortedArray = new int[firstHalfSubarray.length + secondHalfSubarray.length];
        int counterFirstHalfSubarray = 0, counterSecondHalfSubarray = 0, counterSortedArray = 0;

        while ((counterFirstHalfSubarray < firstHalfSubarray.length) && (counterSecondHalfSubarray < secondHalfSubarray.length)) {
            if (firstHalfSubarray[counterFirstHalfSubarray] <= secondHalfSubarray[counterSecondHalfSubarray]) {
                sortedArray[counterSortedArray] = firstHalfSubarray[counterFirstHalfSubarray];
                counterFirstHalfSubarray++;
            } else {
                sortedArray[counterSortedArray] = secondHalfSubarray[counterSecondHalfSubarray];
                counterSecondHalfSubarray++;
            }
            counterSortedArray++;
        }

        while (counterFirstHalfSubarray < firstHalfSubarray.length) {
            sortedArray[counterSortedArray] = firstHalfSubarray[counterFirstHalfSubarray];
            counterFirstHalfSubarray++;
            counterSortedArray++;
        }

        while (counterSecondHalfSubarray < secondHalfSubarray.length) {
            sortedArray[counterSortedArray] = secondHalfSubarray[counterSecondHalfSubarray];
            counterSecondHalfSubarray++;
            counterSortedArray++;
        }

        return sortedArray;
    }
}
