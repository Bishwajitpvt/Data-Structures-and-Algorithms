package Array.Problems;

import java.util.Arrays;

public class finding_Kth_Element {
    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;

//        int result = kBruteForce(arr, k);
//        System.out.print("K'th smallest element is " + result);

        System.out.print("K'th smallest element is " + kBetterApproach(arr, k));
    }

    //    Time complexity => O(N^2)
    public static int kBruteForce(int[] arr, int k) {
        int n = arr.length;

//        sorting
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr[k - 1];
    }

    //    Time Complexity => O(N log N)
    public static int kBetterApproach(int[] arr, int k) {
        Arrays.sort(arr);
        return arr[k - 1];

    }
}
