package com.mycompany.foutoir;

import java.util.Arrays;

public class ArrayExceptSelf {
    static int[] nums = {1,2,3,4};
    public static void main(String[] args) {
        System.out.println(Arrays.toString(productExceptSelf2(nums)));
    }
    public static int[] productExceptSelf(int[] nums) {
        int[] leftProducts = new int[nums.length];
        int[] rightProducts = new int[nums.length];
        int[] result = new int[nums.length];

        // Initialize leftProducts and rightProducts
        leftProducts[0] = 1;
        rightProducts[nums.length - 1] = 1;

        // Calculate leftProducts
        for (int i = 1; i < nums.length; i++) {
            leftProducts[i] = leftProducts[i - 1] * nums[i - 1];
        }

        // Calculate rightProducts
        for (int i = nums.length - 2; i >= 0; i--) {
            rightProducts[i] = rightProducts[i + 1] * nums[i + 1];
        }

        // Calculate result array
        for (int i = 0; i < nums.length; i++) {
            result[i] = leftProducts[i] * rightProducts[i];
        }

        return result;
    }

    public static int[] productExceptSelf2(int[] nums) {
        int n = nums.length;
        int[] result =  new int[n];

        Arrays.fill(result, 1);
        int current = 1;
        for(int i = 0; i < n;i++){
            result[i] *= current;
            current *= nums[i];
        }

        current=1;
        for(int i = n-1; i >= 0;i--){
            result[i] *= current;
            current *= nums[i];
        }

        return result;
    }
}
