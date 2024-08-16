package Array.Problems;

// https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/description/

/*
 * Given an array of size n, write a program to check if the given array is sorted in
 * (ascending / Increasing / Non-decreasing) order or not.
 * If the array is sorted then return True, Else return False.
 */

public class checkIfArrayIsSorted {
    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5};
        int[] arr = {5, 4, 6, 7, 8};

        System.out.println(isSortedBrute(arr));
        System.out.println(isSortedOptimal(arr));
    }

    //    Time Complexity => O(N^2)
    public static boolean isSortedBrute(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[i]) {
                    return false;
                }
            }
        }
        return true;
    }

    //    Time Complexity => O(N)
    public static boolean isSortedOptimal(int[] arr) {
//        using a counter value to check errors in order of elem
        int n = arr.length;
        int counter = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                counter++;
            }
        }
        return counter != 0 ? false : true;
    }
}
