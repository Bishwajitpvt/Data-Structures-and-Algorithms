package Array.Searching;

import java.util.Scanner;

public class binarySearch {
    public static void main(String[] args) {
        System.out.println("enter length , arr and target value");

        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();

        System.out.println("Original Array : ");
        for (int i = 0; i < len; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.println("Target at " + bsBrute(arr, target));
    }

//    Time complexity => O(log N)
//    repeatedly divides the search space in half with each step, leading to a logarithmic time complexity
    public static int bsBrute(int[] arr, int t) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
//            mid should be inside while loop as it needs to be calculated everytime
            int mid = left + (right - left) / 2;
            if (arr[mid] == t) return mid;
            else if (arr[mid] < t) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return 0;
    }
}
