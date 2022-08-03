package gibault.alexandre.sorters;

import java.util.Random;

/**
 * This app tries different sorting algorithm on
 * an <code>int</code> array before printing each result.
 * 
 * @author Alexandre Gibault
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Random randomInt = new Random();
    	int[] array = new int[50];
    	
    	for (int i = 0; i < array.length; i++) {
			array[i] = randomInt.nextInt(100);
		}
    	
    	MergeSorter mergeSorter = new MergeSorter(array);
    	
    	System.out.println("==== Merge Sort ====\n");
    	System.out.println("Initial array");
    	printIntArray(array);
    	System.out.println("Sorted array");
    	printIntArray(mergeSorter.getSortedArray());
    }

    /**
     * Print <code>array</code>.
     * 
     * @param array The array to print
     */
	public static void printIntArray(int[] array) {
		System.out.print("{ ");
		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");
		System.out.println("}");
	}
}
