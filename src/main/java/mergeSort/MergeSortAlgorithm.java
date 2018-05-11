package mergeSort;

import java.util.Arrays;

import org.apache.commons.lang.ArrayUtils;

/**
 * <h1>Merge sort algorithm!</h1> Implement a merge sort algorithm. <b>Note:</b>
 * Read what the difference is between merge and quick sort.
 *
 * @author darko.dimitrievski
 */
public class MergeSortAlgorithm {

	private int indexToBeRemoved = 0;
	
	public int getIndexToBeRemoved() {
		return indexToBeRemoved;
	}

	public void setIndexToBeRemoved(int indexToBeRemoved) {
		this.indexToBeRemoved = indexToBeRemoved;
	}

	public static void main(final String[] args) {
		int[] n = { 1, 4, 5, 6, 2, 4, 1, 8 };
		MergeSortAlgorithm m = new MergeSortAlgorithm();
		System.out.println(m.merge(n));
	}

	/**
	 * Unsorted array is sorted with mergesort
	 *
	 * @param unsorted
	 *            array
	 * @return sorted merged array
	 */
	public int[] merge(final int[] unsortedArray) {
		int[] sortedArray = new int[unsortedArray.length];

		int[] leftSubarray = new int[unsortedArray.length / 2];
		int[] rightSubarray = new int[unsortedArray.length / 2];

		for (int numberElements = 0; numberElements < unsortedArray.length/2; numberElements ++) {
			leftSubarray[numberElements] = unsortedArray[numberElements];
			rightSubarray[numberElements] = unsortedArray[(unsortedArray.length/2 + numberElements)];
		}
		
		int elementsLeftSubarray = 0;
		int elementsRightSubarray = 0;
		int counterSortedArray = 0;
		
		while ((elementsLeftSubarray < leftSubarray.length) && (elementsRightSubarray < rightSubarray.length)) {
			int smallestFromLeft = smallestElementInArray(leftSubarray);
			int smallestFromRight = smallestElementInArray(rightSubarray);
			if (smallestFromLeft <= smallestFromRight) {
				sortedArray[counterSortedArray] = smallestFromLeft;
				leftSubarray = ArrayUtils.remove(leftSubarray, getIndexToBeRemoved());
			} else {
				sortedArray[counterSortedArray] = smallestFromRight;
				rightSubarray = ArrayUtils.remove(rightSubarray, getIndexToBeRemoved());
			}
			counterSortedArray++;
		}

		while (elementsLeftSubarray < leftSubarray.length) {
			sortedArray[counterSortedArray] = leftSubarray[elementsLeftSubarray];
			elementsLeftSubarray++;
			counterSortedArray++;
		}

		while (elementsRightSubarray < rightSubarray.length) {
			sortedArray[counterSortedArray] = rightSubarray[elementsRightSubarray];
			elementsRightSubarray++;
			counterSortedArray++;
		}

		for (int i=0; i<sortedArray.length; i++) {
			System.out.println(sortedArray[i]);
		}
		return sortedArray;
	}
	
	public int smallestElementInArray (int [] numbers) {
		int smallest = Integer.MAX_VALUE;
		for(int i=0; i<numbers.length; i++) {
			if (smallest > numbers[i]) {
				smallest = numbers[i];
				setIndexToBeRemoved(i);
			}
		}
		return smallest;
	}
}
