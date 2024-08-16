package Array.Problems;

import java.util.ArrayList;
import java.util.Arrays;

// https://leetcode.com/problems/sort-colors/description/
/*
* Given an array nums with n objects colored red, white, or blue,
* sort them in-place so that objects of the same color are adjacent,
* with the colors in the order red, white, and blue.
* We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
* */
public class sortColors {
    public static void main(String[] args) {
        int n = 6;
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(new Integer[]{0, 2, 1, 2, 0, 1}));
        optimal(arr);

        System.out.println("After sorting:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
    }

    //  Dutch National flag algorithm || TC => O(n) || SC => O(1)
    public static void optimal(ArrayList<Integer> nums) {
        int low = 0;
        int mid = 0;
        int high = nums.size() - 1;

        while (mid <= high) {
            if (nums.get(mid) == 0) {
                // swapping arr[low] and arr[mid]
                int temp = nums.get(low);
                nums.set(low, nums.get(mid));
                nums.set(mid, low);

                low++;
                mid++;
            } else if (nums.get(mid) == 2) {
                // swapping arr[mid] and arr[high]
                int temp = nums.get(mid);
                nums.set(mid, nums.get(high));
                nums.set(high, temp);
                high--;
            } else mid++;
        }
    }

    public static void swap(int i, int j) {
        int temp = i;
        i = j;
        j = temp;
    }

}
