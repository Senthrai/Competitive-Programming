package com.mycompany.foutoir;

import java.util.Arrays;

public class Candy {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int[] candies = new int[n];

        // Initialize each child with one candy
        Arrays.fill(candies, 1);

        // Go from left to right, making sure that higher-rated children get more candies
        for(int i = 1; i < n ;i++){
            if(ratings[i] > ratings [i-1]){
                candies[i] = candies[i-1]+1;
            }
        }

        // Go from right to left, checking and updating if needed
        for(int i = n-2; i >= 0 ;i--){
//            if(ratings[i] > ratings [i+1] && candies[i] <= candies[i+1]){
//                candies[i] = candies[i+1]+1;
//            }
            if (ratings[i] > ratings[i + 1]) {
                candies[i] = Math.max(candies[i], candies[i + 1] + 1);
            }
        }

        // Calculate the total minimum candies needed

        return Arrays.stream(candies).sum();
    }
}
