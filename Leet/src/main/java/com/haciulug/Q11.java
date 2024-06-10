package com.haciulug;

public class Q11 {
}

class Solution11 {
    public int maxArea(int[] height) {
        int max = 0;
        int i = 0;
        int j = height.length - 1;

        while (i < j) {
            int h = Math.min(height[i], height[j]);
            max = Math.max(max, h * (j - i));

            while (height[i] <= h && i < j) {
                i++;
            }

            while (height[j] <= h && i < j) {
                j--;
            }
        }

        return max;
    }
}