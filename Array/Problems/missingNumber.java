package Array.Problems;

import java.util.HashMap;

//https://leetcode.com/problems/missing-number/description/
// Given an array containing n distinct numbers in the range [0, n],
// return the only number in the range that is missing from the array.
public class missingNumber {
    public static void main(String[] args) {
//        int[] arr = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        int[] arr= {3,0,1};
        int n = arr.length;

        System.out.println(missingNumBrute(arr, n));
        System.out.println(missingNumberOptimal(arr, n));
        System.out.println(missingNumberOptimalXOR(arr,n));
    }

    //    TC => O(n) || SC => O(n)
    public static int missingNumBrute(int[] arr, int n) {
        /*
         * Using HashMap to store value ( initial value = 0)
         * if a value occurs increment by 1
         * return the value that have value = 0
         */
        HashMap<Integer, Integer> map = new HashMap<>();

//        Add each element to the HashMap
        for (int i : arr) {
            map.put(i, 1);
        }

        for (int i = 0; i <= n; i++) {
            if (!map.containsKey(i)) {
                return i;
            }
        }
        return -1;
    }

    // Using Summation Formula
    // TC => O(n)  || sc => O(n)
    public static int missingNumberOptimal(int[] arr, int n) {
        /*
         * calculate the sum of all natural number 0 -> n
         * calculate the sum of all elem in the array
         * subtract both value , and return the diff
         * */

        int sum1 = n * (n + 1) / 2; // sum of the first n natural numbers
        int sum2 = 0;

        for (int i = 0; i < n; i++) {
            sum2 += arr[i];
        }

//        there is no missing number
        if (sum1 == sum2) return -1;

        return sum1 - sum2;
    }

    // Using XOR
    // TC => O(n)  || sc => O(n) (it is slightly better than summation approach)
    public static int missingNumberOptimalXOR(int[] arr, int n) {
        /*
         * a loop to  XOR all values 0 -> n
         * a loop to xor all array elements
         * return ( xor loop1 and loop2 )
         * */

        int xorAllElem = 0;
        int xorArrElem = 0;

        // XOR all numbers from 0 to n
        for (int i = 0; i <= n; i++) {
            // xorAllElem = xorAllElem ^ i;
            xorAllElem ^= i;
        }

        // XOR all elements of the array
        for (int e : arr) {
            xorArrElem ^= e;
        }

        // RETURN missing number
        return xorAllElem ^ xorArrElem;
    }

}
