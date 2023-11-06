package com.mycompany.foutoir;

import java.util.Arrays;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {

    }

    public int maxProfit(int[] prices) {
        int currentRatio = 0;
        int biggestRatio = 0;
        for (int i = 0; i < prices.length; i++) {
            currentRatio = getRatio(prices[i], Arrays.copyOfRange(prices, i, prices.length));
            if (biggestRatio < currentRatio) {
                biggestRatio = currentRatio;
            }
        }
        return biggestRatio;
    }

    public int getRatio(int price, int[] pricesToCheckAgainst) {
        int ratio = 0;
        for (int j : pricesToCheckAgainst) {
            if ((j - price) > ratio) {
                ratio = j - price;
            }
        }
        return ratio;
    }
}
