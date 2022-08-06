package gibault.alexandre.sorters;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Test;

public class BubbleSorterTest {
/*
	@Test
	public void testBubbleSorter() {
		int[] array = {5, 3, 1, 4};
		BubbleSorter sorter = new BubbleSorter(array);
		assertThat(sorter.arrayToSort, equalTo(array));
	}

	@Test
	public void testSort() {
		int[] array = {5, 3, 1, 4};
		int[] expected = {1, 3, 4, 5};
		BubbleSorter sorter = new BubbleSorter(array);
		assertThat(sorter.getSortedArray(), equalTo(expected));
	}

	@Test
	public void testSwap() {
		int[] array = {5, 3, 1, 4};
		int[] expected = {3, 5, 1, 4};
		BubbleSorter sorter = new BubbleSorter(array);
		sorter.swap(0);
		assertThat(sorter.arrayToSort, equalTo(expected));
	}
*/
	@Test
	public void testGetSortedArray() {
		int[] array = {5, 3, 1, 4};
		int[] expected = {1, 3, 4, 5};
		BubbleSorter sorter = new BubbleSorter(array);
		assertThat(sorter.getSortedArray(), equalTo(expected));
	}

}
