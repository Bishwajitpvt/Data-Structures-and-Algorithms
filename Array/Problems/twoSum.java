package Array.Problems;

//1st variant: Return YES if there exist two numbers such that their sum is equal to the target. Otherwise, return NO.
//2nd variant: Return indices of the two numbers such that their sum is equal to the target. Otherwise, we will return {-1, -1}.


import java.util.Arrays;
import java.util.HashMap;

public class twoSum {
    public static void main(String[] args) {
        int[] arr = {2, 6, 5, 8, 11};
        int target = 14;

        int n = arr.length;

        System.out.println(Arrays.toString(bruteForce(arr, n, target)));

        System.out.println(Arrays.toString(optimalSolution(arr, n, target)));
    }

    // 2pointer approach || TC => O(n^2) || SC => O(2)
    public static int[] bruteForce(int[] arr, int n, int target) {

        int[] result = new int[2];

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }

    //    HashMap || TC => O(n) || SC => O(n)
    public static int[] optimalSolution(int[] arr, int n, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
//        int[] result = new int[2];

        for (int i = 0; i < n; i++) {
            int el = arr[i];
            int temp = target - el;

            // check if the difference is present in the map
            if (map.containsKey(temp)) {
//                result[0] = map.get(temp);
//                result[1] = i;
//                return result;
                return new int[]{map.get(temp), i};
            }
            // if not, then add into the map
            map.put(arr[i], i);
        }
//        return result;
        return null;
    }
}
