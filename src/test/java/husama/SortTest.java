package husama;

import junit.framework.TestCase;

/**
 * Created by hu on 2017/3/8.
 */
public class SortTest extends TestCase{
    public void testInsertionSort() {
        Integer[] test = {12,3,4,190,3,44,77};
        Sort.insertionSort(test);
        for(Integer integer : test) {
            System.out.print(integer+" ");
        }
    }

    public void testBubbleSort() {
        Integer[] test = {12,3,4,190,3,44,77};
        Sort.bubbleSort(test);
        for(Integer integer : test) {
            System.out.print(integer+" ");
        }
    }

    public void testBubbleSort2() {
        Integer[] test = {12,3,4,190,3,44,77};
        Sort.bubbleSort2(test);
        for(Integer integer : test) {
            System.out.print(integer+" ");
        }
    }

    public void testMergeSort() {
        Integer[] test = {12,3,4,190,3,44,77};
        Sort.mergeSort(test);
        for(Integer integer : test) {
            System.out.print(integer+" ");
        }

    }

    public void testQuickSort() {
        Integer[] test = {12,3,4,190,3,44,77};
        Sort.qucikSort(test);
        for(Integer integer : test) {
            System.out.print(integer+" ");
        }
    }

    public void testHeapSort() {
        Integer[] test = {12,3,4,190,3,44,77};
        Sort.heapSort(test);
        for(Integer integer : test) {
            System.out.print(integer+" ");
        }
    }
}
