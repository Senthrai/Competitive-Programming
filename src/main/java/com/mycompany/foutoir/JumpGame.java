package com.mycompany.foutoir;

public class JumpGame {
    static int[] nums1 = {2, 3, 1, 1, 4};
    static int[] nums2 = {3, 2, 1, 0, 4};

    static int[] nums3 = {0};

    static int[] nums4 = {1,0,1,0};

    static int[] nums5 = {5,9,3,2,1,0,2,3,3,1,0,0};

    public static void main(String[] args) {
//        System.out.println(canJump(nums1));
//        System.out.println(canJump(nums2));
//        System.out.println(canJump(nums3));
//        System.out.println(canJump(nums4));
        System.out.println(canJump(nums5));
    }

    static public boolean canJump(int[] nums) {
        if(nums.length==1) return true;
        if(nums[0]==0)return false;
        int compteur = nums[0];
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] + i >= nums.length-1) {
                return true;
            }
            compteur--;
            if(nums[i]>compteur) compteur = nums[i];
            if(nums[i]==0){
                if (compteur==0) return false;
            }
        }
        return false;
    }

    static public boolean canJump2(int[]nums){
        int reachable = 0;
        for (int i=0; i<nums.length; ++i) {
            if (i > reachable) return false;
            reachable = Math.max(reachable, i + nums[i]);
        }
        return true;
    }
}
