package com.mycompany.foutoir;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        int[] height2 = {2,3,4,5,18,17,6};
        System.out.println(maxArea(height2));
    }
    public static int maxArea(int[] height) {
        int start = 0;
        int end = height.length -1;
        int maxWater = 0;

        while(start < end){
            int min = Math.min(height[start], height[end]);
            int currentWater = min * (end - start);
            if(currentWater > maxWater){
                maxWater = currentWater;
            }
            if(height[start] < height[end]){
                start++;
            }else{
                end--;
            }
        }

        return maxWater;
    }
}
