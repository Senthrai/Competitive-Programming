package com.mycompany.foutoir;

public class TrappingRainWater {
    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap2(height));
    }
    public static int trap(int[] height) {
        int n = height.length;
        if (n <= 2) {
            return 0; // You can't trap water with less than 3 bars.
        }

        int left = 0;
        int right = n - 1;
        int leftMax = 0;
        int rightMax = 0;
        int trappedWater = 0;

        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] > leftMax) {
                    leftMax = height[left];
                } else {
                    trappedWater += leftMax - height[left];
                }
                left++;
            } else {
                if (height[right] > rightMax) {
                    rightMax = height[right];
                } else {
                    trappedWater += rightMax - height[right];
                }
                right--;
            }
        }

        return trappedWater;
    }

    public static int trap2(int[] height) {
        int n = height.length;
        if (n <= 2) {
            return 0; // You can't trap water with less than 3 bars.
        }

        int[] leftMax = new int[n];
        int[] rightMax = new int[n];

        // Calculate the left maximum height for each bar.
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }

        // Calculate the right maximum height for each bar.
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }

        int trappedWater = 0;

        // Calculate the trapped water for each bar.
        for (int i = 1; i < n - 1; i++) {
            int minHeight = Math.min(leftMax[i], rightMax[i]);
            trappedWater += minHeight - height[i];
        }

        return trappedWater;
    }
}
