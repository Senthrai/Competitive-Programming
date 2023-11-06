package com.mycompany.foutoir;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Majority {
    static int[] nums = {3,2,3};
    public static void main(String[] args) {
        System.out.println(majorityElement(nums));
    }
    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> majorityMap = new HashMap<>();
        int n = nums.length;

        for (int num : nums) {
            majorityMap.put(num, majorityMap.getOrDefault(num, 0) + 1);
        }

        int majorityThreshold = n / 2;
        for (Map.Entry<Integer, Integer> entry : majorityMap.entrySet()) {
            if (entry.getValue() > majorityThreshold) {
                return entry.getKey();
            }
        }
        throw new IllegalArgumentException("No majority element found");
    }

    public static int majorityElements2(int[] nums){
        Arrays.sort(nums);
        int n = nums.length;
        return nums[n/2];
    }
}
