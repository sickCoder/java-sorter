# Sorters

In this project you will find different sorting algorithms written in Java.
- Merge sort
- Insertion sort
- Bubble sort

## Merge sort

One of the most efficient sorting algorithm. The idea is to divide and conquer in order to sort an array.
It divides recursively the initial array in two halves sub arrays. It continuously splits the array in half until it cannot
be divided again (the sub arrays are empty or contain only one element). Then, the merge process begins. It takes two sorted
arrays and combines them into a larger array.

Note : If you whant to try the test file in eclipse IDE, delete the comment tokens in `MergeSorterTest.java` and comment the `private` key words before all methods in `MergeSorter.java`.

## Selection sort

The Selection sort algorithm search for the minimal element in an array
in order to put it at the begining of the array.
The array is splited in two sub arrays: one sorted and one 
unsorted array. The left part of the array becomes the sorted
sub array as the algorithm is executed, the rest of the array
is the unsorted sub array. At the beginning, the whole array is
unsorted.
In each iterations of selection sort algorithm, the minimal
element of the unsorted sub array is moved to the sorted
sub array.

Note: if you to run the tests in eclipse IDE. 
1. Uncomment the commented section of `SelectionSorterTest.java`
2. In `SelectionSorter.java`
   1. Comment the `private` key word on field and methods
   2. Comment `sort()` line in `SelectionSorter(int[] arrayToSort)`
   3. Uncomment the `sort()`line in `getSortedArray()`
3. Run the tests
## Bubble sort

Not yet implemented.
