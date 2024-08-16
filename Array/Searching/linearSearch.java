package Array.Searching;

//6
//1 4 2 8 5 10
//5

import java.util.Scanner;

public class linearSearch {
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

        System.out.println("Target at " + lsBrute(arr,target));
    }

//    Time Complexity - O(N)
    public static int lsBrute(int[] arr, int t){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == t) return i;
        }
        return 0;
    }
}
