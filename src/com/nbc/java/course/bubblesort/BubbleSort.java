package com.nbc.java.course.bubblesort;

public class BubbleSort {

    public static void main(String... args) {
        System.out.println("Bubble sort");

        int[] numberToSorted = {4, 1, 3, -2, 2, 5, 8, 1, -12, 0};
        int[] sortedArray;

        System.out.println("Array before bubble sort");
        showArray(numberToSorted);

        sortedArray = bubbleSort(numberToSorted);
        System.out.println("Array after bubble sort");
        showArray(sortedArray);

    }

    private static int[] bubbleSort(int array[]) {
        int temp;
        boolean doChange;
        do {
            doChange = false;
            for (int n = 0; n < array.length - 1; n++) {
                if (array[n] > array[n + 1]) {
                    temp = array[n + 1];
                    array[n + 1] = array[n];
                    array[n] = temp;
                    doChange = true;
                }
            }
        } while (doChange);

        return array;
    }

    private static void showArray(int arr[]) {
        for (int n = 0; n < arr.length; n++) {
            System.out.println(arr[n]);
        }
    }


}
