package gibault.alexandre.sorters;

/**
 * This class is intended to sort an <code>int</code> array
 * using a merge sort algorithm.
 * 
 * @author Alexandre Gibault
 *
 */
class MergeSorter {

	/**
	 * The array to Sort.
	 */
	private int[] arrayToSort;
	
	/**
	 * Initialize <code>this.arrayToSort</code> by cloning
	 * <code>arrayToSort</code> parameter. Sort
	 * <code>this.arrayToSort</code>.
	 * 
	 * @param arrayToSort The array to sort
	 */
	public MergeSorter(int[] arrayToSort) {
		this.arrayToSort = arrayToSort.clone();
		mergeSort(this.arrayToSort);
	}
	
	/**
	 * Sort <code>arrayToSort</code> parameter using a merge sort
	 * algorithm.
	 * 
	 * @param arrayToSort The array to sort
	 */
	private void mergeSort(int[] arrayToSort) {
		
		if (arrayToSort.length > 1) {
			int middle = arrayToSort.length / 2;
			int[] left = new int[middle];
			int[] right = new int[arrayToSort.length - middle];
			initializeSubArrays(arrayToSort, left, right);
			mergeSort(left);
			mergeSort(right);
			merge(arrayToSort, left, right);
		}	
	}
	
	/**
	 * Compares <code>left</code> and <code>right</code> elements
	 * and puts the smaller into <code>arrayToSort</code> assuming that
	 * <code>left</code> and <code>right</code> are already sorted.
	 * This means if we have <code>left = {6, 1}</code> and
	 * <code>right = {3, 4}</code> then 
	 * <code>arrayToSort = {3, 4, 6, 1}</code>.
	 * 
	 * @param arrayToSort The array to sort
	 * @param left left part of <code>arrayToSort</code>
	 * @param right right part of <code>arrayToSort</code>
	 */
	private void merge(int[] arrayToSort, int[] left, int[] right) {
		int index = 0;
		int leftIndex = 0;
		int rightIndex = 0;
		
		//Comparing left and right elements
		while (leftIndex < left.length && rightIndex < right.length) {
			if (left[leftIndex] <= right[rightIndex])
				arrayToSort[index++] = left[leftIndex++];
			else
				arrayToSort[index++] = right[rightIndex++];
		}
		
		//If left elements are not fully processed
		while (leftIndex < left.length)
			arrayToSort[index++] = left[leftIndex++];
		//If right elements are not fully processed
		while (rightIndex < right.length)
			arrayToSort[index++] = right[rightIndex++];
	}
	
	/**
	 * Initialize <code>left</code> and <code>right</code>
	 * with <code>arrayToSort</code> elements. <code>left</code>
	 * will contain the first half of <code>arrayToSort</code>.
	 * <code>right</code> will contain the second half of
	 * <code>arrayToSort</code>.
	 * 
	 * @param left the left part of <code>arrayToSort</code>
	 * @param right the right part of <code>arrayToSort</code>
	 */
	private void initializeSubArrays(int[] arrayToSort, int[] left, int[] right) {
		for (int i = 0; i < arrayToSort.length; i++) {
			if (i < left.length)
				left[i] = arrayToSort[i];
			else
				right[i - arrayToSort.length / 2] = arrayToSort[i];
		}
	}
	
	/**
	 * Returns <code>arrayToSort</code> sorted using a merge sort
	 * algorithm.
	 * 
	 * @return <code>arrayToSort</code> sorted
	 */
	public int[] getSortedArray() {
		return arrayToSort;
	}
}
