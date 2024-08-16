package Array.Problems;

import java.util.ArrayList;

//https://www.geeksforgeeks.org/problems/union-of-two-sorted-arrays-1587115621/1
/*
 * Given two sorted arrays of size n and m respectively, find their union.
 * The Union of two arrays can be defined as the common and distinct elements in the two arrays.
 *  Return the elements in sorted order.
 * */

public class unionTwoSortedArrays {
    public static void main(String[] args) {

        int arr1[] = {1, 2, 3, 4, 5};
        int n = 5;
        int arr2[] = {1, 2, 3, 6, 7};
        int m = 5;
        System.out.println(findUnion(arr1, arr2, n, m));
    }

    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m) {
        // add your code here
        ArrayList<Integer> result = new ArrayList<>();
        int i = 0; // pointer for arr1
        int j = 0; // pointer for arr2

        while (i < n && j < m) {

            //   If the current element in arr1 is smaller, check if it's unique and add it to result.
            if (arr1[i] < arr2[j]) {
                //Ensures that the element is not a duplicate (i.e., it's not the same as the last added element).
                if (result.isEmpty() || result.get(result.size() - 1) != arr1[i]) {
                    result.add(arr1[i]);
                }
                i++;
            }
            //   If the current element in arr2 is smaller, check if it's unique and add it to result.
            else if (arr1[i] > arr2[j]) {
                //Ensures that the element is not a duplicate (i.e., it's not the same as the last added element).
                if (result.isEmpty() || result.get(result.size() - 1) != arr2[j]) {
                    result.add(arr2[j]);
                }
                j++;
            }
            //   If both elements are equal, add the element to result once and move both pointers forward.
            else {
                if (result.isEmpty() || result.get(result.size() - 1) != arr1[i]) {
                    result.add(arr1[i]);
                }
                i++;
                j++;
            }
        }

        //   remaining arr1 elem
        while (i < n) {
            if (result.isEmpty() || result.get(result.size() - 1) != arr1[i]) {
                result.add(arr1[i]);
            }
            i++;
        }

        //   remaining arr2 elem
        while (j < m) {
            if (result.isEmpty() || result.get(result.size() - 1) != arr2[j]) {
                result.add(arr2[j]);
            }
            j++;
        }

        return result;
    }
}
