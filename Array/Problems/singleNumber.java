package Array.Problems;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/single-number/description/
//Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
//You must implement a solution with a linear runtime complexity and use only constant extra space.
public class singleNumber {
    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
//        int[] nums = {2,2,1};
//        int[] nums = {1};

        System.out.println(singleNumBrute(nums));
        System.out.println(singleNumOptimalXOR(nums));
    }

//    time complexity => O(2n) => O(n) || space complexity => O(n)
    public static int singleNumBrute(int[] nums){
        HashMap<Integer,Integer> map = new HashMap<>();

//        put data into hashmap
        for(int e : nums){
            map.put(e, map.getOrDefault(e,0)+1);
        }

//        loop through entire map
        for (Map.Entry<Integer,Integer> m : map.entrySet()) {
            if(m.getValue() == 1){
                return m.getKey();
            }
        }

        return -1;
    }

//    tc => O(n)  || sc => O(1)
    public static int singleNumOptimalXOR(int[] nums){
        int xor = 0;
        for(int el : nums){
            xor = xor ^ el;
        }
        return xor;
    }
}
