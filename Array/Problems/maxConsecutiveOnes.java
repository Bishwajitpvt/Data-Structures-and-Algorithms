package Array.Problems;

// https://leetcode.com/problems/max-consecutive-ones/description/
// Given a binary array nums,return the maximum number of consecutive 1's in the array.


public class maxConsecutiveOnes {
    public static void main(String[] args) {
//        int[] nums = {1,1,0,1,1,1};
        int[] nums = {1, 0, 1, 1, 0, 1};

        System.out.println(consecutiveOnes(nums));
    }

    // TC => O(n) || SC => O(1)
    public static int consecutiveOnes(int[] nums) {
        int counter = 0;
        int maxCounter = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                counter++;
//                if(counter > maxCounter) {
//                    maxCounter = counter;
//                }
                maxCounter = Math.max(maxCounter, counter);
            } else {
                counter = 0;
            }
        }
        return maxCounter;
    }
}
