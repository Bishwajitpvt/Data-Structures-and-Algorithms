package Array.Sorting;

import java.util.ArrayList;

public class mergeSort {
    public static void main(String[] args) {
        int[] arr = {9, 4, 7, 6, 3, 1, 5};
        int n = arr.length;

        mergeSortB(arr, 0, n - 1);
        System.out.println("After sorting array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    //    dividing the array in two sections
    public static void mergeSortB(int[] arr, int left, int right) {
//        get mid-value
//        use recursion for left and right side
//        join the arrays (merge function)
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSortB(arr, left, mid); // left side
            mergeSortB(arr, mid + 1, right); // right side
            merge(arr, left, mid, right);
        }
    }

    public static void merge(int[] arr, int left, int mid, int right) {
        ArrayList<Integer> temp = new ArrayList<>(); // temporary array
        int l = left; // starting index of left half
        int r = mid + 1;  // starting index of right half

        while (l <= mid && r <= right) {
//            add left element and increase pointer
            if (arr[l] <= arr[r]) {
                temp.add(arr[l]);
                l++;
            } else {
//                add right element and increase pointer
                temp.add(arr[r]);
                r++;
            }
        }
//        if elements on the left half are still left
        while (l <= mid) {
            temp.add(arr[l]);
            l++;
        }
//        if elements on the right half are still left
        while (r <= right) {
            temp.add(arr[r]);
            r++;
        }

//        transferring all elements from temporary to arr
        for (int i = left; i <= right; i++) {
            arr[i] = temp.get(i - left);
        }
    }
}
