package Array.Problems;


import java.util.Arrays;

/**
 * Given an array arr, return the second-largest distinct element from an array.
 * If the second-largest element doesn't exist then return -1.
 */


public class secondLargestElement {
    public static void main(String[] args) {
//        int[] arr = {12, 35, 1, 10, 34, 1};
        int[] arr = {1,2,7,7,7,7,7,7};

        System.out.println("second-largest element (Brute) is : " + secondLargeBrute(arr));
        System.out.println("second-largest element (Better) is : " + secondLargeBetter(arr));
        System.out.println("second-largest element (Optimal) is : " + secondLargeOptimal(arr));


    }

    //    Time Complexity => O(N log N)
    public static int secondLargeBrute(int[] arr) {
//        base case
        if (arr.length <= 1) {
            return -1;
        }

        Arrays.sort(arr); // using sort function , and return 2nd last element

//        worst case
        int secondL = 0;
        int largest = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] != largest) {
                secondL = arr[i];
                return secondL;
            }
        }
        return -1;
    }

    //    Time Complexity => O(2N)
    public static int secondLargeBetter(int[] arr) {
        /*
         * using 2 loops. 1st to find the largest element and
         * 2nd loop to find the second-largest element
         */

        int n = arr.length;
        int largest = arr[0];
        int secondLargest = -1;

        if (n < 2) {
            return -1; // If there are fewer than 2 elements
        }

        for (int j : arr) {
            if (j > largest) {
                largest = j; // from this we get the largest elem
            }
        }

        for (int j : arr) {
            if (j > secondLargest && j != largest) {
                secondLargest = j;
            }
        }
        return secondLargest; // no 2nd largest elem found
    }

    //    Time Complexity => O(N)
    public static int secondLargeOptimal(int[] arr) {
        /*
         * using 2 pointer , one for largest and 2nd for 2nd-largest
         * */

        int n = arr.length;
        int largest = arr[0];
        int secondLargest = -1;

        if (n < 2) {
            return -1; // If there are fewer than 2 elements
        }

        for (int i = 0; i < n; i++) {
            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            } // If the current element is not the largest but is greater than secondLargest,
            else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        return  secondLargest;
    }
}
