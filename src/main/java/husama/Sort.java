package husama;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hu on 2017/3/7.
 */
public class Sort {

    public static <T extends Comparable<T>> void insertionSort(T[] a) {
        T temp;
        int i, j;
        for(i = 1; i < a.length; i++) {
            temp = a[i];
            for(j = i; j > 0 && a[j-1].compareTo(temp) > 0 ; j--)
                a[j] = a[j-1];
            a[j] = temp;
        }
    }

    public static <T extends Comparable<T>> void bubbleSort(T[] a) {
        T temp;
        for(int i = a.length - 1; i >= 0; i--) {
            for(int j = 0; j < i; j++) {
                if (a[j].compareTo(a[j+1]) > 0) {
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }

    public static <T extends Comparable<T>> void bubbleSort2(T[] a) {
        int bound, t;
        bound = a.length - 1;
        T temp;
        while (bound != 0) {
            t = 0;
            for(int i = 0; i < bound; i++) {
                if (a[i].compareTo(a[i+1]) > 0) {
                    temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                    t = i;
                }
            }
            bound = t;
        }
    }

    public static <T extends Comparable<T>> void mergeSort(T[] a) {
        mSort(a, 0, a.length-1);
    }

    private static <T extends Comparable<T>> void mSort(T[] a, int begin, int end) {
        if(begin < end) {
            int mid = (end - begin)/2 + begin;//防止溢出
            mSort(a, begin, mid);
            mSort(a, mid + 1, end);
            merge(a, begin, mid, end);
        }
    }

    private static <T extends Comparable<T>> void merge(T[] a, int begin, int mid, int end) {
        List<T> temp = new ArrayList<T>();
        int i = begin, j = mid + 1;

        while (i <= mid && j <= end) {
            if (a[i].compareTo(a[j]) <= 0) {
                temp.add(a[i++]);
            } else {
                temp.add(a[j++]);
            }
        }

        while (i <= mid) {
            temp.add(a[i++]);
        }

        while (j <= end) {
            temp.add(a[j++]);
        }

        for(int k = 0; k < temp.size(); k++) {
            a[begin + k] = temp.get(k);
        }
    }

    public static <T extends Comparable<T>> void qucikSort(T[] a) {
        qSort(a, 0, a.length - 1);
    }

    public static <T extends Comparable<T>> void qSort(T[] a, int begin, int end) {

        if (begin >= end) return;

        //最终划为三份，[begin, lt) < pivot = [lt, gt] < (gt, end]
        int lt = begin, gt = end, i = begin + 1;
        T temp, pivot = a[begin];
        while ( i <= gt) {
            int cmp = a[i].compareTo(pivot);
            if (cmp < 0) {
                temp = a[i];
                a[i] = a[lt];
                a[lt] = temp;
                i++;
                lt++;
            } else if (cmp > 0) {
                temp = a[i];
                a[i] = a[gt];
                a[gt] = temp;
                gt--;
            } else {
                i++;
            }
        }

        qSort(a, begin, lt - 1);
        qSort(a, gt + 1, end);

    }

    /**
     * 此版本存在性能问题，即数组存在大量重复元素时也会不断划分，造成不公平的切分
     * 但比较简短，适合面试时书写
     */
    public static <T extends Comparable<T>> void qSort2(T[] a, int begin, int end) {
        int i, m;  //i指向下一个待处理的元素，[begin+1, m]位置保存着当前已处理元素之中所有的小于a[begin]的元素
        T temp;
        if (begin >= end) return;

        m = begin; //最初[begin+1, m] = [begin+1, begin]是空集

        for(i = begin + 1; i <= end; i++) {
            if(a[i].compareTo(a[begin]) < 0) {   //对相等的元素没有优化
                m++;
                temp = a[i];
                a[i] = a[m];
                a[m] = temp;
            }
        }

        temp = a[begin];
        a[begin] = a[m];
        a[m] = temp;

        qSort(a, begin, m - 1);
        qSort(a, m + 1, end);
    }

    public static <T extends Comparable<T>> void heapSort(T[] a) {
        T temp;
        buildMaxHeap(a);

        for (int i = a.length - 1; i > 0; i--) {
            temp = a[i];
            a[i] = a[0];
            a[0] = temp;
            maxHeapify(a, 0, i);
        }
    }

    private static <T extends Comparable<T>> void buildMaxHeap(T[] a){
        for (int i = (a.length - 1) / 2; i >= 0; i--) {
            maxHeapify(a, i, a.length);
        }
    }

    private static <T extends Comparable<T>> void maxHeapify(T[] a, int i, int heapSize) {
        int left, right, largest;
        T temp;
        for(;;) {
            left = 2 * i + 1;
            right = 2 * i + 2;
            largest = (left < heapSize && a[left].compareTo(a[i]) > 0) ? left : i;
            if (right < heapSize && a[right].compareTo(a[largest]) > 0) {
                largest = right;
            }

            if(largest == i) return;

            temp = a[i];
            a[i] = a[largest];
            a[largest] = temp;
        }
    }
}
