package com.mycompany.foutoir;

import java.util.Arrays;

public class RemoveDuplicateArray2 {
    static int[] array1 = {1,1,1,2,2,3};
    static int[] array2 = {0,0,1,1,1,1,2,3,3};

    public static void main(String[] args) {
        System.out.println("number of differents numbers : " + removeDuplicates(array1));
        System.out.println(Arrays.toString(array1));

        System.out.println("number of differents numbers : " + removeDuplicates(array2));
        System.out.println(Arrays.toString(array2));

    }
    public static int removeDuplicates(int[] nums) {
        if (nums.length <= 2) {
            return nums.length;
        }

        int k = 2;  // Maximum allowed occurrences for each unique element
        int count = 1;  // Count of the current unique element
        int index = 1;  // Index to place the next unique element

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                count++;
            } else {
                count = 1;
            }

            if (count <= k) {
                nums[index] = nums[i];
                index++;
            }
        }

        return index;
    }

    public static int removeDuplicates2(int[] nums) {
        int index = 0;
        boolean hasDuplicate = false;
        int totalNumbersOfSameValue = 1;
        for(int i = 1; i < nums.length ; i++){
            if(nums[i] == nums[index] && !hasDuplicate){
                hasDuplicate = true;
                index ++;
                nums[index] = nums[i];
                totalNumbersOfSameValue++;
            }else if(nums[i] != nums[i-1]){
                index ++;
                nums[index] = nums[i];
                totalNumbersOfSameValue++;
                if(hasDuplicate){
                    hasDuplicate=false;
                }
            }
        }
        return totalNumbersOfSameValue;
    }
}
