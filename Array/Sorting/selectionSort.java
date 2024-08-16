package Array.Sorting;

import java.util.Scanner;

public class selectionSort {
    public static void main(String[] args) {
        System.out.println("enter length , arr value");

//        Scanner sc = new Scanner(System.in);
//        int len = sc.nextInt();
//        int[] arr = new int[len];
//        for (int i = 0; i < len; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        System.out.println("Original Array : ");
//        for (int i = 0; i < len; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
        int[] arr = {9, 3, 2, 7, 6, 1};

        sSBrute(arr);
    }

    static void sSBrute(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int tempV = i;

//          finding smallest value
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[tempV]) {
                    tempV = j;
                }
            }
//            swap
            int temp = arr[tempV];
            arr[tempV] = arr[i];
            arr[i] = temp;
        }

        //        print
        System.out.println("Output : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

