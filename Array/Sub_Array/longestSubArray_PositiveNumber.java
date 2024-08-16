package Array.Sub_Array;

// Longest Sub-array with Sum K (All Elements Positive)
public class longestSubArray_PositiveNumber {
    public static void main(String[] args) {
//        int[] arr = {2,3,5,1,9};
//        int k = 10;

        int[] arr = {2, 3, 5};
        int k = 5;

        int n = arr.length;

        System.out.println(bruteForce(arr, n, k));
        System.out.println(betterSolution(arr, n, k));

    }

    //    Two Pointer approach  ||  TC => O(n^2)  || SC => O(1)
    public static int bruteForce(int[] arr, int n, int k) {
        /*
         * Start with two nested loops to generate all possible subarrays.
         * For each subarray, calculate its sum.
         * If the sum equals K, update the maximum length.
         * Return the maximum length found.
         * */

        int maxLen = 0;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if (sum == k) {
                    maxLen = Math.max(maxLen, j - i + 1);
                }
            }
        }

        return maxLen;
    }

    //    Sliding Window approach  || TC => O(n)  || SC => O(1)
    public static int betterSolution(int[] arr, int n, int k) {
//        Initialize two pointers (start and end) and a variable currentSum.
//        Expand the window by moving end to the right and adding elements to currentSum.
//        If currentSum exceeds K, move start to the right to reduce the sum.
//        If currentSum equals K, update the maximum length.
//        Continue until end reaches the end of the array.

        int star = 0;
        int end = 0;
        int sum = 0;
        int maxLen = 0;

        while (end < n) {
            sum += arr[end];

            while (sum > k && star < n) {
                sum -= arr[star];
                star++;
            }

            if (sum == k) {
                maxLen = Math.max(maxLen, end - star + 1);
            }
            end++;
        }

        return maxLen;
    }

}
