package com.haciulug;

public class Q1 {
}
class Solution1 {
    public int[] twoSum(int[] nums, int target) {

        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == diff) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }
}