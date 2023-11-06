package com.mycompany.foutoir;

public class LuckyChineseGift {
//    write a program that calculates the number of "lucky" gifts (equal to 8) based on the budget : money, and the number of giftees
//
//    rules : "
//    gifts must not contain the amount 4
//    it is auspicious to give an amount of 8
//    it would be wrong to give nothing
//
//    the program should return the number of gifts equal to 8 following these rules :
//    spend the entire budge(unless there is enough budget to give 8 to everyone)
//    do not give any 4
//    do not give any 0
//    give a max amount of 8 once the above rules are met
//
//    implement the method: int  luckyMoney(int money, int giftees)

    public static void main(String[] args) {
        System.out.println(luckyMoney(16, 2));//return 2
        System.out.println(luckyMoney(12, 2));//return 0
        System.out.println(luckyMoney(24, 4));//return 2
        System.out.println(luckyMoney(7,2));//return 0
        System.out.println(luckyMoney(80,10));//return -2
        System.out.println(luckyMoney(64,8));//return 8
        System.out.println(luckyMoney(64,5));//return 5
    }

    static int luckyMoney(int money, int giftees){
        if (money < 0 || money >= 100) return -1;
        if (giftees < 0 || giftees >= 10) return -2;

        int numberOfLuckyGift = 0;
        int gifteesLeft = giftees;

        if(money>=giftees*8) return giftees;

        while (money >= 8 && money>gifteesLeft && gifteesLeft>0){
            money-=8;
            numberOfLuckyGift++;
            gifteesLeft--;
        }

        if(money==4 || money==0)return numberOfLuckyGift-1;

        return numberOfLuckyGift;
    }

    static int luckyMoney2(int money, int giftees){
        if (money < 0 || money >= 100) return -1; //incorrect money input
        if (giftees < 0 || giftees >= 10) return -2; //incorrect giftees input
        if (money >= giftees * 8) return giftees; //spend the entire budget (unless there is enough budget to give everyone 8)
        if (money < giftees) return 0; // not enough money

        var b = money;
        var g = giftees;
        // enough budget for giftees left after donating 8 as much as possible
        while (b >= 8 + (g - 1) && g > 0) {
            b -= 8;
            g--;
        }
        if(g == 1 && b == 4) return 0;
        return giftees - g;
    }
}
