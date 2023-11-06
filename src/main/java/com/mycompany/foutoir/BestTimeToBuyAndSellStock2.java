package com.mycompany.foutoir;

public class BestTimeToBuyAndSellStock2 {
    static int[] prices = {7,1,5,3,6,4};
    static int[] prices2 = {1,2,3,4,5};
    static int[] prices3 = {7,6,4,3,1};

    public static void main(String[] args) {
//        System.out.println(maxProfit(prices));
        System.out.println(maxProfit(prices2));
//        System.out.println(maxProfit(prices3));
    }

    public static int maxProfit(int[] prices) {
        var hasStock = false;
        var stockPrice = 0;
        var profit = 0;
        for(int i = 0; i < prices.length ; i++){
            //sell stock
            if(hasStock){
                //sell when currentPrince < stockPrice
                if(prices[i]>stockPrice){
                    profit += prices[i] - stockPrice;
                    hasStock = false;
                }
            }

            //Identify a peak
            //Can't buy on the last day
            if(i != prices.length - 1){
                if(prices[i] < prices[i+1]){
                    //buy stock
                    if(!hasStock){
                        hasStock = true;
                        stockPrice = prices[i];
                    }
                }
            }

        }
        return profit;
    }
}
