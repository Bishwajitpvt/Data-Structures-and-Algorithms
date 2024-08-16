package Array.Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class quickSort {
    public static void main(String[] args) {
        int[] arr = {4, 6, 2, 5, 7, 9, 1, 3};
        quickSortFn(arr, 0, arr.length - 1);

        System.out.println("After insertion sort: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void quickSortFn(int[] arr, int low, int high) {
        if (low < high) {
            int pa = partition(arr, low, high);
            quickSortFn(arr, low, pa - 1);
            quickSortFn(arr, pa + 1, high);
        }

    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // initial pivot element
        int i = (low - 1);

//        0 => arr.length
        for (int j = low; j < high; j++) {

            //  If current element is smaller than the pivot
            if (arr[j] < pivot) {
                i++; // increment index of smaller element
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
}
