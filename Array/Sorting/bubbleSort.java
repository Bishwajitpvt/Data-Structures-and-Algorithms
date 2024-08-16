package Array.Sorting;

import java.util.Scanner;

public class bubbleSort {
    public static void main(String[] args) {
        System.out.println("enter length , arr value");

        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Original Array : ");
        for (int i = 0; i < len; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        bsBrute(arr);
        impVerBS(arr);
    }

    //    Time complexity => O(N^2)
    public static void bsBrute(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
//                    swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

//        print
        System.out.print("Standard Version : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    //    improved version of bubble sort
    static void impVerBS(int[] arr) {
        int n = arr.length;
        boolean isSwapped;

        for (int i = 0; i < n - 1; i++) {
            isSwapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
                isSwapped = true;
            }

            // If no elements were swapped, the array is sorted
            if (!isSwapped) {
                break;
            }
        }

        //        print
        System.out.println("Improved Version : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
