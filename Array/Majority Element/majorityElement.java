package Array.Problems;

import java.util.HashMap;
import java.util.Map;

public class majorityElement {
    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
//        int[] nums = {3, 2, 3};

        int n = nums.length;

        System.out.println(brute(nums, n));
        System.out.println(better(nums, n));
        System.out.println(optimal(nums, n));
    }

    //    Time Complexity => O(n^2) || Space Complexity => O(1)
    public static int brute(int[] nums, int n) {
        for (int i = 0; i < n - 1; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {

                if (nums[j] == nums[i]) count++;
            }
            if (count > (n / 2)) return nums[i];
        }
        return -1;
    }

    //    Time Complexity => O(2n) || Space Complexity => O(n)
    public static int better(int[] nums, int n) {
//        create a hashmap and add all elements
        HashMap<Integer, Integer> map = new HashMap<>();

//        add element into map || O(n)
        for (int el : nums) {
            map.put(el, map.getOrDefault(el, 0) + 1);
        }

//        loop through map and find elem that have the highest occurrence than N/2
        for (Map.Entry<Integer, Integer> em : map.entrySet()) {
            if (em.getValue() > n / 2) return em.getKey();
        }

        return -1;
    }

    //    Moore Majority Voting Algorithm || Time Complexity => O(2n) || Space Complexity => O(1)
    public static int optimal(int[] nums, int n) {
        int count = 0;
        int el = 0;

        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                count = 1;
                el = nums[i];
            } else if (el == nums[i]) {
                count++;
            } else count--;
        }

//        checking if the stored element is the majority element
        int count1 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == el) count1++;
        }
        if (count1 > (nums.length / 2)) return el;

        return -1;
    }
}
