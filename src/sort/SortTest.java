package sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SortTest {

    private Sort Sort = new Sort();
    private int[] sortedArr = new int[]{-2, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

    @Test
    public void bubbleSortTest() {
        int[] nums = new int[]{-2, 4, 8, 9, 3, 7, 0, 2, 1, 5, 6};
        Sort.bubbleSort(nums);

        printArr(nums);
        assertArrayEquals(sortedArr, nums);
    }

    @Test
    public void selectionSortTest() {
        int[] nums = new int[]{-2, 4, 8, 9, 3, 7, 0, 2, 1, 5, 6};
        Sort.selectionSort(nums);

        printArr(nums);
        assertArrayEquals(sortedArr, nums);
    }

    @Test
    public void insertionSortTest() {
        int[] nums = new int[]{-2, 4, 8, 9, 3, 7, 0, 2, 1, 5, 6};
        Sort.insertionSort(nums);

        printArr(nums);
        assertArrayEquals(sortedArr, nums);
    }

    private void printArr(int[] arr) {
        for (int num : arr) {
            System.out.print(num + ", ");
        }
    }
}
