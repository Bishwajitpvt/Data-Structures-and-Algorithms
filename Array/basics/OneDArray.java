package Array.basics;

import java.util.Arrays;
import java.util.Scanner;

public class OneDArray {
    public static void main(String[] args) {
//        array declaration && initialization
        int[] arr2 = {1, 3, 6, 8, 2}; // initializing array

        System.out.println(Arrays.toString(arr2));

//        taking input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("enter len: ");
        int len = sc.nextInt();
        int[] arr = new int[len]; // declared array of size "len"

        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }

//        print
        System.out.println("printing .....");
        for (int i = 0; i < len; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
