package gibault.alexandre.sorters;

import static org.junit.Assert.*;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class SelectionSorterTest {

	@Test
	public void testSelectionSorter() {
		int[] arrayToSort = {5, 3, 1, 4};
		int[] expected = {1, 3, 4, 5};
		SelectionSorter sorter = new SelectionSorter(arrayToSort);
		assertThat(sorter.getSortedArray(), equalTo(expected));
	}

	@Test
	public void testSort() {
		int[] arrayToSort = {5, 3, 1, 4};
		int[] expected = {1, 3, 4, 5};
		SelectionSorter sorter = new SelectionSorter(arrayToSort);
		sorter.sort(arrayToSort);
		assertThat(arrayToSort, equalTo(expected));
	}

	@Test
	public void testSwap() {
		int[] array = {5, 3, 1, 4};
		int[] expected = {1, 3, 5, 4};
		SelectionSorter sorter = new SelectionSorter(array);
		sorter.swap(array, 2, 0);
		assertThat(array, equalTo(expected));
	}

	@Test
	public void testGetSortedArray() {
		int[] array = {5, 3, 1, 4};
		int[] clonedArray = array.clone();
		int[] expected = {1, 3, 4, 5};
		SelectionSorter sorter = new SelectionSorter(array);
		assertThat(sorter.getSortedArray(), equalTo(expected));
		assertThat(array, equalTo(clonedArray));
	}

}
