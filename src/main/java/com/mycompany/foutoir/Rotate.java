package com.mycompany.foutoir;

import java.util.Arrays;

public class Rotate {
    static int[] nums = {1,2,3,4,5,6,7};
    static int[] nums2 = {1,2,3};
    public static void main(String[] args) {
        rotate3(nums,2);
        System.out.println(Arrays.toString(nums));
    }
    //BAD because we do this operation k times
    public static void rotate(int[] nums, int k) {
        int currentValue=nums[0];
        int previousValue;
        for(int j = 0; j < k; j++){
            previousValue = nums[0];
            for(int i = 1; i < nums.length;i++){
                currentValue = nums[i];
                nums[i] = previousValue;
                previousValue = currentValue;
            }
            nums[0] = currentValue;
        }
    }

    //BAD because we do this operation k times
    public static void rotate2(int[] nums, int k) {
        k = k % nums.length;

        //reverse the array
        for(int j = 0; j < k; j++){
            //reverse once
            for(int i = 0; i < nums.length/2 ;i++){
                int tmp = nums[i];
                nums[i] = nums[nums.length-(i+1)];
                nums[nums.length-(i+1)] = tmp;
            }
            //reverse starting from 1
            for(int i = 1; i < nums.length/2 ;i++){
                int tmp = nums[i];
                nums[i] = nums[nums.length-(i)];
                nums[nums.length-(i)] = tmp;
            }
        }
    }

    //Cycling stuff
    public static void rotate4(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // Normalize k to handle cases where k is larger than array size

        int count = 0; // Counter to keep track of how many elements have been rotated
        for (int start = 0; count < n; start++) {
            int current = start; // Start rotating from this index
            int prev = nums[start]; // Store the element at the start index
            do {
                int next = (current + k) % n; // Calculate the new index after rotation
                int temp = nums[next]; // Store the element at the new index
                nums[next] = prev; // Replace the element at the new index with the previous element
                prev = temp; // Update the previous element for the next iteration
                current = next; // Move to the next index
                count++; // Increment the counter
            } while (start != current); // Continue rotating until we return to the start index
        }
    }

    //better reverse
    public static void rotate3(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // Normalize k to handle cases where k is larger than array size

        // Reverse the entire array
        reverse(nums, 0, n - 1);
        // Reverse the first k elements
        reverse(nums, 0, k - 1);
        // Reverse the remaining elements
        reverse(nums, k, n - 1);
    }

    // Helper function to reverse elements in a range
    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

}
