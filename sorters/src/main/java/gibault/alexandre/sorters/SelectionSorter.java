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
		sort(this.arrayToSort);
	}
	
	/**
	 * Sort <code>arrayToSort</code> with a selection sort
	 * algorithm.
	 * 
	 * @param arrayToSort The array to sort
	 */
	/*private*/ void sort(int[] arrayToSort) {
		
		for (int i = 0; i < arrayToSort.length - 1; i++) {
			int minIndex = i;
			
			for (int j = i + 1; j < arrayToSort.length; j++) 
				if (arrayToSort[j] < arrayToSort[minIndex]) {
					minIndex = j;
				}
			
			swap(arrayToSort, minIndex, i);
		}
	}
	
	/**
	 * Swap the <code>minIndex</code> element to
	 * the <code>index</code> element in <code>array</code>.
	 * 
	 * @param array The array to swap elements with
	 * @param minIndex The index of the minimal value in <code>array</code>
	 * @param index The index to swap
	 */
	/*private*/ void swap(int[] array, int minIndex, int index) {
		int temp = array[minIndex];
		array[minIndex] = array[index];
		array[index] = temp;
	}
	
	/**
	 * Return <code>this.arrayToSort</code> sorted.
	 * 
	 * @return <code>this.arrayToSort</code> sorted
	 */
	/*private*/ int[] getSortedArray() {
		return arrayToSort;
	}
}
