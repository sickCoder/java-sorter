package gibault.alexandre.sorters;

/**
 * This class is intended to sort an <code>int</code>
 * array using a selection sort algorithm.
 * 
 * @author Alexandre Gibault
 *
 */
class SelectionSorter {

	/**
	 * The array to sort.
	 */
	private int[] arrayToSort;
	
	/**
	 * Clone <code>arrayToSort</code> into
	 * <code>this.arrayToSort</code>.
	 * 
	 * @param arrayToSort The array to sort
	 */
	public SelectionSorter(int[] arrayToSort) {
		this.arrayToSort = arrayToSort.clone();
		sort();
	}
	
	/**
	 * Sort <code>arrayToSort</code> with a selection sort
	 * algorithm.
	 * 
	 * @param arrayToSort The array to sort
	 */
	private void sort() {
		
		for (int i = 0; i < arrayToSort.length - 1; i++) {
			int minIndex = i;
			
			minIndex = getMinIndex(i, minIndex);
			swap(minIndex, i);
		}
	}

	/**
	 * Retruns the minimal element index starting from <code>index</code>
	 * in <code>array</code>.
	 * 
	 * @param array The array to find the minimal element index
	 * @param index The begining index
	 * @param minIndex The current minimal element index
	 * @return The minimal element index in <code>array</code>
	 */
	private int getMinIndex(int index, int minIndex) {
		for (int j = index + 1; j < arrayToSort.length; j++) 
			if (arrayToSort[j] < arrayToSort[minIndex]) {
				minIndex = j;
			}
		return minIndex;
	}
	
	/**
	 * Swap the <code>minIndex</code> element to
	 * the <code>index</code> element in <code>array</code>.
	 * 
	 * @param array The array to swap elements with
	 * @param minIndex The index of the minimal value in <code>array</code>
	 * @param index The index to swap
	 */
	private void swap(int minIndex, int index) {
		int temp = arrayToSort[minIndex];
		arrayToSort[minIndex] = arrayToSort[index];
		arrayToSort[index] = temp;
	}
	
	/**
	 * Return <code>this.arrayToSort</code> sorted.
	 * 
	 * @return <code>this.arrayToSort</code> sorted
	 */
	public int[] getSortedArray() {
		//sort();
		return arrayToSort;
	}
}
