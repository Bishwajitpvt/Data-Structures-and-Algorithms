package Array.Problems;

//https://leetcode.com/problems/rearrange-array-elements-by-sign/description/

import java.util.ArrayList;
import java.util.Arrays;

//Input: nums = [3,1,-2,-5,2,-4]
//Output: [3,-2,1,-5,2,-4]
//Explanation:
//The positive integers in nums are [3,1,2]. The negative integers are [-2,-5,-4].
//The only possible way to rearrange them such that they satisfy all conditions is [3,-2,1,-5,2,-4].
//Other ways such as [1,-2,2,-5,3,-4], [3,1,2,-2,-5,-4], [-2,3,-5,1,-4,2] are incorrect because they do not satisfy one or more conditions.
public class rearrangeArrayElementsBySign {
    public static void main(String[] args) {
        int[] nums = {3, 1, -2, -5, 2, -4};

        System.out.println(Arrays.toString(rearrangeArrayBrute(nums)));
        System.out.println(Arrays.toString(Optimal(nums)));
    }

    // TC => O(2n) || Sc= > O(n)
    public static int[] rearrangeArrayBrute(int[] nums) {
//        create 2 arrayList of half size of main array
//        sort the elements into +ve and -ve, and add it into 2 arrays
//        loop through the 2 arrays and add result into main array
        int n = nums.length;
        ArrayList<Integer> positive = new ArrayList<>();
        ArrayList<Integer> negative = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                positive.add(nums[i]);
            } else {
                negative.add(nums[i]);
            }
        }

        for (int i = 0; i < n / 2; i++) {
            nums[2 * i] = positive.get(i);
            nums[2 * i + 1] = negative.get(i);
        }

        return nums;
    }

    public static int[] Optimal(int[] nums){
        int[] result = new int[nums.length];
        int positive=0; int negative =1;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > 0){
                result[positive] = nums[i];
                positive+=2;
            }else {
                result[negative] = nums[i];
                negative+=2;
            }
        }

        return result;
    }

}
