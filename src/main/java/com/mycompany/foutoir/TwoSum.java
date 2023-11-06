package com.mycompany.foutoir;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr1 = {2,7,11,15};
        System.out.println(Arrays.toString(twoSum_bs(arr1, 9)));
    }

    public int[] twoSum3(int[] nums, int target) {
        int l = 0, r = nums.length - 1;

        while (nums[l] + nums[r] != target) {
            if (nums[l] + nums[r] < target) l++;
            else r--;
        }

        return new int[] {l+1, r+1};
    }
    public int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];

        Map<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length;i++){
            map.put(nums[i], i);
        }

        for (Map.Entry<Integer, Integer> number : map.entrySet()){
            int index = target - number.getKey();
            if(map.containsKey(index)){
                answer[0] = (int) number.getValue();
                answer[1] = map.get(index);
            }
            break;
        }

        return answer;
    }

    public int[] twoSum2(int[] numbers, int target) {
        Map<Integer, Integer> sumMap = new HashMap<>();

        for(int i = 0; i < numbers.length;i++){
            sumMap.put(numbers[i], i);
        }

        int[] result = new int[2];
        for(int i = 0; i < numbers.length;i++){
            if(sumMap.containsKey(target-numbers[i])){
                result[0] = i+1;
                result[1] = sumMap.get(numbers[i])+1;
                return result;
            }
        }
        return result;
    }

    public static int[] twoSum_hash(int[] numbers, int target) {
        int len = numbers.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < len; i++) {
            if (map.containsKey(target - numbers[i])) {
                return new int[]{map.get(target - numbers[i]), i + 1};
            }

            map.putIfAbsent(numbers[i], i + 1);
        }

        return new int[0];
    }

    public static int[] twoSum_bs(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; ++i) {
            int low = i + 1;
            int high = numbers.length - 1;
            while (low <= high) {
                int mid = (high - low) / 2 + low;
                if (numbers[mid] == target - numbers[i]) {
                    return new int[]{i + 1, mid + 1};
                } else if (numbers[mid] > target - numbers[i]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
        }
        return new int[]{-1, -1};
    }
}
