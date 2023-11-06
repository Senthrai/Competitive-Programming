package com.mycompany.foutoir;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        List<List<Integer>> list = new ArrayList<>();
        List<Set<Integer>> listSet = new ArrayList<>();
        for(int i = 0; i < n;i++){
            for(int j = 1; j < n;j++){
                for(int k = 2; k < n;k++){
                    if(nums[i]+nums[j]+nums[k]==0){
                        Set<Integer> subList = new HashSet<>();
                        subList.add(nums[i]);
                        subList.add(nums[j]);
                        subList.add(nums[k]);
                        // list.add(subList);
                        listSet.add(subList);
                    }
                }
            }
        }

        for(Set<Integer> set:listSet){
            list.add(set.stream().toList());
        }
        return list;
    }
}
