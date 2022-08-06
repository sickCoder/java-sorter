package gibault.alexandre.sorters;

/**
 * This class is a sorter for an <code>int</code> array
 * using a bubble sort algorithm.
 * 
 * @author Alexandre Gibault
 *
 */
class BubbleSorter {

	/**
	 * The array to sort.
	 */
	private int[] arrayToSort;
	
	/**
	 * Clone <code>arrayToSort</code> into
	 * <code>this.arrayToSort</code>.
	 * And sort <code>this.arrayToSort</code>.
	 * 
	 * @param arrayToSort The array to sort
	 */
	public BubbleSorter(int[] arrayToSort) {
		this.arrayToSort = arrayToSort.clone();
		sort();
	}
	
	/**
	 * Sort <code>this.arrayToSort</code> using a bubble sort
	 * algorithm.
	 */
	private void sort() {
		
		for (int i = 0; i < arrayToSort.length - 1; i++) {
			
			for (int j = 0; j < arrayToSort.length - i - 1; j++) {
				if (arrayToSort[j] > arrayToSort[j + 1])
					swap(j);
			}
		}
	}
	
	/**
	 * Swap <code>this.arrayToSort</code> elements at index
	 * <code>index</code> and <code>index + 1</code>.
	 * 
	 * @param index1 The index of the element to swap
	 */
	private void swap(int index) {
		int temp = arrayToSort[index];
		arrayToSort[index] = arrayToSort[index + 1];
		arrayToSort[index + 1] = temp;
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
