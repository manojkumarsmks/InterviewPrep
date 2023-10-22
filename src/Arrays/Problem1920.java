package Arrays;

import java.util.Arrays;

/* https://leetcode.com/problems/build-array-from-permutation/description/*/

public class Problem1920 {
    public static void main(String[] args) {
        int[] nums = { 5, 0, 1, 2, 3, 4 };
        System.out.println(Arrays.toString(solution(nums)));
    }

    /**
     * The function takes an array of integers as input and returns a new array
     * where each element is the value at the
     * index specified by the corresponding element in the input array.
     * 
     * @param nums The parameter `nums` is an array of integers.
     * @return The method `solution` returns an array of integers.
     */
    public static int[] solution(int[] nums) {
        int[] ans = new int[nums.length];

        for (int i = 0; i < ans.length; i++) {
            ans[i] = nums[nums[i]];
        }

        return ans;
    }
}
