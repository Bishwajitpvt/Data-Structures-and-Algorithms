package Array.Problems;

//There’s an array ‘A’ of size ‘N’ with positive and negative elements (not necessarily equal).
// Without altering the relative order of positive and negative elements, you must return an array of alternately positive and negative values.
// The leftover elements should be placed at the very end in the same order as in array A.

//Input:
//arr[] = {1,2,-4,-5,3,4}, N = 6
//Output: 1 -4 2 -5 3 4
//
//Explanation:
//Positive elements = 1,2
//Negative elements = -4,-5
//To maintain relative ordering, 1 must occur before 2, and -4 must occur before -5.
//Leftover positive elements are 3 and 4 which are then placed at the end of the array.

import java.util.ArrayList;
import java.util.Arrays;

public class rearrangeArrayElementsBySign2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, -4, -5, 3, 4};

        System.out.println(Arrays.toString(rearrangeArray(arr)));
    }

    public static int[] rearrangeArray(int[] arr) {
        ArrayList<Integer> positive = new ArrayList<>();
        ArrayList<Integer> negative = new ArrayList<>();
        int[] result = new int[arr.length];

//        sort elem into +ve and -ve
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                positive.add(arr[i]);
            } else {
                negative.add(arr[i]);
            }
        }

//        if +ve array is bigger
        if (positive.size() > negative.size()) {

            // add elements into order
            for (int i = 0; i < negative.size(); i++) {
                result[2 * i] = positive.get(i);
                result[2 * i + 1] = negative.get(i);
            }

            // add remaining +ve elem
            int index = negative.size() * 2;
            for (int i = negative.size(); i < positive.size(); i++) {
                result[index] = positive.get(i);
                index++;
            }
        } else {
            // add elements into order
            for (int i = 0; i < positive.size(); i++) {
                result[2 * i] = positive.get(i);
                result[2 * i + 1] = negative.get(i);
            }

            // add remaining -ve elem
            int index = positive.size() * 2;
            for (int i = positive.size(); i < negative.size(); i++) {
                result[index] = negative.get(i);
                index++;
            }
        }

        return result;
    }
}
