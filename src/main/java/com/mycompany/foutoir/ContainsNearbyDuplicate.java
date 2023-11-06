package com.mycompany.foutoir;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ContainsNearbyDuplicate {


    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        int k = 3;
        System.out.println(containsNearbyDuplicate(nums, k));

        int[] nums2 = {1,0,1,1};
        int k2 = 1;
        System.out.println(containsNearbyDuplicate2(nums2, k2));

        int[] nums3 = {1,2,3,1,2,3};
        int k3 = 2;
        System.out.println(containsNearbyDuplicate(nums3, k3));
    }
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        if(k==0) return false;
        Map<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            List<Integer> list = map.getOrDefault(num, new ArrayList<>());
            list.add(i);
            map.put(num, list);
        }

        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
            if (entry.getValue().size() > 1) {
                for (int i = 0, j = 1; i < entry.getValue().size() - 1; i++) {
                    if (Math.abs(entry.getValue().get(j)) - Math.abs(entry.getValue().get(i))<= k) return true;
                }
            }
        }
        return false;

    }

    public static boolean containsNearbyDuplicate2(int[] nums, int k) {
        Map<Integer, Integer> numToIndex = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];

            if (numToIndex.containsKey(num) && i - numToIndex.get(num) <= k) {
                return true; // Found a duplicate within k indices
            }

            numToIndex.put(num, i);
        }

        return false; // No duplicate within k indices
    }
}
