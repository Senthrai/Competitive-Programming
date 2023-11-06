package com.mycompany.foutoir;

public class JumpGame2 {
    static int[] nums = {2, 3, 1, 1, 4};
    static int[] nums2 = {2, 3, 0, 1, 4};
    static int[] nums3 = {1, 2};
    static int[] nums4 = {2, 1};
    static int[] nums5 = {1, 2, 3};
    static int[] nums6 = {1, 1, 1, 1};


    public static void main(String[] args) {
        System.out.println(jump(nums));
        System.out.println(jump(nums2));
        System.out.println(jump(nums3));
        System.out.println(jump(nums4));
        System.out.println(jump(nums5));
        System.out.println(jump(nums6));
    }

    public static int jump(int[] nums) {
        int jumpCount = 0;
        int jumpDistance;
        int currentJumpDistance=0;
        int jumpDistanceCandidate = 0;
        for(int i = 0; i < nums.length; i++){
            //Did we reach the end ?
            if(i == nums.length -1){
                return jumpCount;
            }

            //Initialize
            if(i==0) {
                if(nums[i]==0) return jumpCount;
                jumpDistanceCandidate = nums[i] + i;
                currentJumpDistance = nums[i];
            }else{
                currentJumpDistance--;
            }

            //From the case we are, can we reach the end ?
            if(nums[i] + i >= nums.length -1){
                //yes we can reach the end
                if(i!=0)jumpCount++;
                return jumpCount+1;
            }else{
                //no we cannot yet

                //How much can I jump from this case
                jumpDistance = nums[i]+i;

                //What's the best case to jump
                if(jumpDistance > jumpDistanceCandidate){
                    jumpDistanceCandidate = jumpDistance;
                }

                //Should we jump to it now ? Is this the best candidate ?
                if(currentJumpDistance==0){
                    jumpCount++;
                    currentJumpDistance = jumpDistanceCandidate - i;
                    jumpDistanceCandidate = 0;
                }
            }
        }
        return jumpCount;
    }

    public static int jump2(int[] nums) {
        if (nums.length == 1) return 0;

        int jumpCount = 0;
        int jumpValue = nums[0];
        int jumpValueCandidate = nums[0];
        for (int i = 1; i < nums.length; i++) {
            //Finding the highest jumpValue
            if (jumpValueCandidate < nums[i] + i) {
                jumpValueCandidate = nums[i] + i;
            }
            jumpValue--;
            //Changing jumpValue to jumpCandidate once exhausted
            if (jumpValue == 0) {
                jumpValue = jumpValueCandidate - i;
                jumpCount++;
            }
            //if the new candidate can reach the end
            if (jumpValue >= nums.length - 1) {
                return (jumpCount + 1);
            }
        }
        return jumpCount;
    }

    public static int badJump(int[] nums) {
        int jumpCount = 0;
        int jumpValue = nums[0];
        int jumpValueCandidate = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (i == nums.length - 1) {
                return jumpCount + 1;
            } else {
                jumpValue--;
                //Finding the highest jumpValue
                if (jumpValueCandidate < nums[i] + i) {
                    jumpValueCandidate = nums[i] + i;
                }
                //Changing jumpValue to jumpCandidate once exhausted
                if (jumpValue == 0) {
                    jumpValue = jumpValueCandidate - i;
                    jumpCount++;
                }
            }
        }
        return jumpCount;
    }
}
