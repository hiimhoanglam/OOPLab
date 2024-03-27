package week3;

import java.util.Arrays;

public class SortingAndSearching {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        System.out.println(linearSearchIndex(array,2));
        System.out.println(linearSearchIndex(array,3));
        System.out.println(linearSearchIndex(array,6));
        int[] sortedArray = {11, 14, 16, 18, 20, 25, 28, 30, 34, 40, 45};
        System.out.println(recursiveBinarySearch(sortedArray,18,0,sortedArray.length - 1));
        System.out.println(recursiveBinarySearch(sortedArray,34,0,sortedArray.length - 1));
        System.out.println(recursiveBinarySearch(sortedArray,100,0,sortedArray.length - 1));
        int[] unsortedArray = {9, 2, 4, 1, 5};
//        bubbleSort(unsortedArray);
        insertionSort(unsortedArray);
        System.out.println(Arrays.toString(unsortedArray));
    }
    public static boolean linearSearch(int[] array, int key) {
       if (array.length == 0) {
           return false;
       }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return true;
            }
        }
        return false;
    }
    public static int linearSearchIndex(int[] array, int key) {
        if (array.length == 0) {
            return -1;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }
    public static boolean recursiveBinarySearch(int[] array, int key, int fromIdx, int toIdx) {
        if (toIdx < fromIdx) {
            return false;
        }
        int midIdx = (fromIdx + toIdx) / 2;
        if (array[midIdx] == key) {
            return true;
        }
        if (array[midIdx] > key) {
            toIdx = midIdx;
        }
        else {
            fromIdx = midIdx + 1;
        }
        return recursiveBinarySearch(array,key,fromIdx,toIdx);

    }
    public static void bubbleSort(int[] array) {
        boolean swap = false;
        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
            if (!swap) {
                return;
            }
        }
    }
    public static void insertionSort(int[] array) {
        for (int firstIdx = 1; firstIdx < array.length; firstIdx++) {
            int key = array[firstIdx];
            int secondIdx = firstIdx - 1;
            while (secondIdx >= 0 && array[secondIdx] > key) {
                array[secondIdx+1] = array[secondIdx];
                secondIdx = secondIdx - 1;
            }
            array[secondIdx+1] = key;
        }
    }
}
