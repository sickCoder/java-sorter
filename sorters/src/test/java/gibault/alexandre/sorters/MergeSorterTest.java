package gibault.alexandre.sorters;

import static org.junit.Assert.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import org.junit.Test;

public class MergeSorterTest {

	@Test
	public void testMergeSorter() {
		int[] arrayToSort = {5, 3, 1, 4};
		int[] expected = {1, 3, 4, 5};
		MergeSorter sorter = new MergeSorter(arrayToSort);
		assertThat(sorter.getSortedArray(), equalTo(expected));
	}

	@Test
	public void testMergeSort() {
		int[] array = {5, 3, 1, 4};
		final int[] expected = {1, 3, 4, 5};
		MergeSorter sorter = new MergeSorter(array);
		sorter.mergeSort(array);
		assertThat(array, equalTo(expected));
	}

	@Test
	public void testMerge() {
		int[] array = new int[4];
		int[] left = {3, 4};
		int[] right = {2, 6};
		int[] expected = {2, 3, 4, 6};
		MergeSorter sorter = new MergeSorter(array);
		sorter.merge(left, right);
		assertThat(sorter.arrayToSort, equalTo(expected));
	}
	
	@Test
	public void testMerge_DifferentSize() {
		int[] array = new int[3];
		int[] left = {7, 8};
		int[] right = {1};
		int[] expected = {1, 7, 8};
		MergeSorter sorter = new MergeSorter(array);
		sorter.merge(left, right);
		assertThat(sorter.arrayToSort, equalTo(expected));
	}

	@Test
	public void testMerge_Unsorted() {
		int[] array = new int[4];
		int[] left = {8, 7};
		int[] right = {3, 1};
		int[] expected = {3, 1, 8, 7};
		MergeSorter sorter = new MergeSorter(array);
		sorter.merge(left, right);
		assertThat(sorter.arrayToSort, equalTo(expected));
	}
	@Test
	public void testInitializeSubArrays() {
		int[] array = {5, 3, 1, 4};
		int middle = array.length/2;
		int[] left = new int[middle];
		int[] right = new int[array.length - middle];
		int[] expectedLeft = {5, 3};
		int[] expectedRight = {1, 4};
		MergeSorter sorter = new MergeSorter(array);
		sorter.initializeSubArrays(left, right);
		assertThat(left, equalTo(expectedLeft));
		assertThat(right, equalTo(expectedRight));
	}

	@Test
	public void testGetSortedArray() {
		int[] array = {5, 3, 1, 4};
		int[] clonedArray = array.clone();
		int[] expected = {1, 3, 4, 5};
		MergeSorter sorter = new MergeSorter(array);
		assertThat(sorter.getSortedArray(), equalTo(expected));
		assertThat(array, equalTo(clonedArray));
	}

}
