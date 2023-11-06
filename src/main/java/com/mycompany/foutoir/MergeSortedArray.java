package com.mycompany.foutoir;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //Extract values and put them in a sorted list
        List<Integer> sortedList = new ArrayList<>();

        for(int i = 0; i < m ; i++){
            sortedList.add(nums1[i]);
        }
        for(int j = 0; j < n ; j++){
            sortedList.add(nums2[j]);
        }

        Collections.sort(sortedList);

        for(int i = 0; i < nums1.length ; i++){
            nums1[i] = sortedList.get(i);
        }
    }

    public void merge2(int[] nums1, int m, int[] nums2, int n) {
        for (int j = 0, i = m; j < n; j++) {
            nums1[i] = nums2[j];
            i++;
        }
        Arrays.sort(nums1);
    }
}