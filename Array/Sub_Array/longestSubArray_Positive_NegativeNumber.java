package Array.Sub_Array;

import java.util.HashMap;

//  Longest Subarray with Sum K (Array Contains Both Positive and Negative Elements)
public class longestSubArray_Positive_NegativeNumber {
    public static void main(String[] args) {
        //        int[] arr = {2,3,5,1,9};
//        int k = 10;

        int[] arr = {10, 2, -2, -20, 10};
        int k = -10;

        int n = arr.length;

        System.out.println(brute(arr, n, k));
    }

    //    two for-loop pointer || TC => O(n^2) || SC => O(1)
    public static int brute(int[] arr, int n, int k) {
//        Iterate through all possible subarrays.
//        Calculate the sum of each subarray.
//        If the sum equals K, check if this subarray is the longest one found so far.

        int maxLen = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += arr[j];

                if (sum == k) {
                    maxLen = Math.max(maxLen, j - i + 1);
                }
            }
        }

        return maxLen;
    }

    public static int optimal(int[] arr, int n, int k) {

//        Index:
//        0 1 2 3 4
//        Array:      [10] [2] [-2] [-20][10]
//        CurrentSum:
//        10 12 10 - 10 0
//
//        PrefixSumMap:
//        {
//            10:0,   // First occurrence of currentSum = 10
//            12:1,   // First occurrence of currentSum = 12
//            -10:3,  // First occurrence of currentSum = -10
//            0:4    // First occurrence of currentSum = 0
//        }
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int maxLen = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i]; // add the current elm to "sum"

            if (sum == k) {
                maxLen = i + 1; // as i start wit 0
            }

//            This line checks if the difference between sum and K exists as a key in map
//            If it does, this indicates that there’s a subarray with a sum equal to K ending at the current index i
            if (map.containsKey(sum - k)) {
                maxLen = Math.max(maxLen, i - map.get(sum - k));
            }

//          his checks if the current sum is already in the map.
//          If it’s not, it adds the sum as a key and stores the current index i as its value.
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }

        }

        return maxLen;
    }
}
