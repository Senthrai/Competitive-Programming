package com.mycompany.foutoir;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public List<String> summaryRanges(int[] nums) {
        List<String> intervalList = new ArrayList<>();
        boolean intervalStarted = false;
        int intervalBegin = 0;

        for(int i = 0; i < nums.length;i++){
            if(i+1 < nums.length && nums[i] == nums[i+1]-1){
                if(intervalStarted)continue;
                //save beginning interval
                intervalStarted = true;
                intervalBegin = nums[i];
            }else{
                if(intervalStarted){
                    intervalStarted = false;
                    intervalList.add(intervalBegin +"->"+nums[i]);//No need to cast as a String
                }else{
                    intervalList.add(String.valueOf(nums[i]));
                }
            }
        }

        return intervalList;
    }

    public List<String> summaryRanges2(int[] nums) {
        ArrayList<String> al=new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            int start=nums[i];
            while(i+1<nums.length && nums[i]+1==nums[i+1])
                i++;

            if(start!=nums[i]){
                al.add(""+start+"->"+nums[i]);
            }
            else{
                al.add(""+start);
            }
        }
        return al;
    }
}
