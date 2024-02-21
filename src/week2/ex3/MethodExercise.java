package week2.ex3;

import java.util.Arrays;
import java.util.Scanner;

public class MethodExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        testExponent(sc);
        System.out.println("\n-----");
        testMagicSum(sc);
        System.out.println("\n-----");
        testPrintArray();
        System.out.println("\n-----");
        testArrayToString();
        System.out.println("\n-----");
        testContains();
        System.out.println("\n-----");
        testSearch();
        System.out.println("\n-----");
        testEquals();
        System.out.println("\n-----");
        testCopyOf();
        System.out.println("\n-----");
        testSwap();
        System.out.println("\n-----");
        testReverse();
    }
    public static int exponent(int base, int exp) {
        int result = 1;
        for (int i = 0; i < exp; i++) {
            result *= base;
        }
        return result;
    }
    public static void testExponent(Scanner sc) {
        System.out.println("Enter the base : ");
        int base = sc.nextInt();
        System.out.println("Enter the exponent: ");
        int exponent = sc.nextInt();
        System.out.printf("%d raises to the power of %d is: %d",base,exponent,exponent(base,exponent));
    }
    public static boolean hasEight(int number) {
        return number % 10 == 8;
    }
    public static void testMagicSum(Scanner sc) {
        final int SENTINEL = -1;
        int magicSum = 0;
        int input;
        System.out.println("Enter a positive integer (or -1 to end): ");
        input = sc.nextInt();
        while (input != -1) {
            if (input % 10 == 8) {
                magicSum += input;
            }
            System.out.println("Enter a positive integer (or -1 to end): ");
            input = sc.nextInt();
        }
        System.out.println("The magic sum is " + magicSum);
    }
    public static void print(int[] array) {
        System.out.println(Arrays.toString(array));
    }
    public static void print(double[] array) {
        System.out.println(Arrays.toString(array));
    }
    public static void print(float[] array) {
        System.out.println(Arrays.toString(array));
    }
    public static void testPrintArray() {
        int[] emptyArray = {};
        int[] oneElementArray = {5};
        int[] nElementArray = {1, 2, 3, 4, 5};

        System.out.println("Printing empty array:");
        print(emptyArray);

        System.out.println("\nPrinting one-element array:");
        print(oneElementArray);

        System.out.println("\nPrinting n-element array:");
        print(nElementArray);
    }
    public static String arrayToString(int[] array) {
        return Arrays.toString(array);
    }
    public static void testArrayToString() {
        int[] emptyArray = {};
        int[] oneElementArray = {5};
        int[] nElementArray = {1, 2, 3, 4, 5};

        System.out.println("Empty array as string: " + arrayToString(emptyArray));
        System.out.println("One-element array as string: " + arrayToString(oneElementArray));
        System.out.println("N-element array as string: " + arrayToString(nElementArray));
    }
    public static boolean contains(int[] arr, int target) {
        // Iterate through the array to check if the target value exists
        for (int num : arr) {
            if (num == target) {
                return true; // Return true if the target is found
            }
        }
        return false; // Return false if the target is not found
    }
    public static void testContains() {
        int[] array1 = {1, 2, 3, 4, 5};
        int target1 = 3;
        int target2 = 6;

        System.out.println("Array contains target1: " + contains(array1, target1));
        System.out.println("Array contains target2: " + contains(array1, target2));
    }
    public static int search(int[] array, int key) {
        // Iterate through the array to find the key
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i; // Return the index if key is found
            }
        }
        return -1; // Return -1 if key is not found
    }

    public static void testSearch() {
        // Test cases
        int[] array = {1, 3, 5, 7, 9};
        int key1 = 5;
        int key2 = 8;

        int result1 = search(array, key1);
        int result2 = search(array, key2);

        System.out.println("Index of " + key1 + ": " + result1);
        System.out.println("Index of " + key2 + ": " + result2);
    }
    public static boolean equals(int[] array1, int[] array2) {
        // Check if arrays have the same length
        if (array1.length != array2.length) {
            return false; // Arrays cannot be equal if they have different lengths
        }

        // Check if each element in both arrays is equal
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false; // Arrays cannot be equal if any corresponding elements differ
            }
        }
        return true; // Arrays are equal if all elements are equal
    }

    public static void testEquals() {
        // Test cases
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {1, 2, 3, 4};
        int[] array3 = {1, 2, 3, 5};
        int[] array4 = {1, 2, 3};

        System.out.println("Arrays 1 and 2 are equal: " + equals(array1, array2));
        System.out.println("Arrays 1 and 3 are equal: " + equals(array1, array3));
        System.out.println("Arrays 1 and 4 are equal: " + equals(array1, array4));
    }
    public static int[] copyOf(int[] array) {
        return Arrays.copyOf(array,array.length);
    }
    public static int[] copyOf(int[] array,int newLength) {
        return Arrays.copyOf(array,newLength);
    }
    public static void testCopyOf() {
        int[] originalArray = {1, 2, 3, 4, 5};

        int[] copiedArray = copyOf(originalArray);
        // Print the original and copied arrays
        System.out.println("Original Array: " + Arrays.toString(originalArray));
        System.out.println("Copied Array: " + Arrays.toString(copiedArray));

        int newLength = 7;
        copiedArray = copyOf(originalArray, newLength);
        // Print the original and copied arrays
        System.out.println("Original Array: " + Arrays.toString(originalArray));
        System.out.println("Copied Array with new length " + newLength + ": " + Arrays.toString(copiedArray));
    }
    public static boolean swap(int[] array1, int[] array2) {
        // Check if arrays have the same length
        if (array1.length != array2.length) {
            return false; // Cannot swap if arrays have different lengths
        }

        // Swap contents of arrays
        for (int i = 0; i < array1.length; i++) {
            int temp = array1[i];
            array1[i] = array2[i];
            array2[i] = temp;
        }
        return true; // Successfully swapped contents
    }
    public static void testSwap() {
        // Test cases
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};

        System.out.println("Before swapping:");
        System.out.println("Array1: " + Arrays.toString(array1));
        System.out.println("Array2: " + Arrays.toString(array2));

        boolean result = swap(array1, array2);

        System.out.println("\nAfter swapping:");
        System.out.println("Array1: " + Arrays.toString(array1));
        System.out.println("Array2: " + Arrays.toString(array2));

        System.out.println("\nContents swapped successfully: " + result);
    }
    public static void reverse(int[] array) {
        int start = 0;
        int end = array.length - 1;

        // Swap elements from start and end until they meet in the middle
        while (start < end) {
            // Swap elements at start and end indices
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            // Move start and end indices towards the middle
            start++;
            end--;
        }
    }

    public static void testReverse() {
        // Test case
        int[] array = {1, 2, 3, 4};

        System.out.println("Before reverse:");
        System.out.println(Arrays.toString(array));

        reverse(array);

        System.out.println("After reverse:");
        System.out.println(Arrays.toString(array));
    }
}
