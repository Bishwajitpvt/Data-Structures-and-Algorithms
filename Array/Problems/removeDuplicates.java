package Array.Problems;

import java.util.HashSet;

//
public class removeDuplicates {
    public static void main(String[] args) {
//        int[] arr = {1, 2, 2, 3, 4, 4, 5};
        int[] arr ={1,1,2,2,2,3,3};
        System.out.println(removeDuplicatesBrute(arr));
        System.out.println(removeDuplicateOptimal(arr));
    }

    //    Time Complexity => O(n log n )
    public static int removeDuplicatesBrute(int[] arr) {
        /*
         * create a hash-set and insert every element
         * loop through the has map and return the array
         * */
        HashSet < Integer > set = new HashSet < > ();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        int k = set.size();
//        int j = 0;
//        for (int x: set) {
//            arr[j] = x;
//        }
        return k;
    }

//    Time Complexity => O(n)
    public static int removeDuplicateOptimal(int[] arr){
        int i = 0;
        for (int j = 0; j < arr.length; j++) {
            if(arr[i] != arr[j]){
                i++;
                arr[i] = arr[j];
            }
        }
        return i+1; // i+1 => "i indicates the index(0 based) , so +1"
    }
}
