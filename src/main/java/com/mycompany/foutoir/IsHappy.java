package com.mycompany.foutoir;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IsHappy {
    public boolean isHappy(int n) {
        while (n != 1 && n != 4) {
            int sum = 0;
            while (n > 0) {
                int digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }
            n = sum;
        }
        return n == 1;
    }

    public boolean isHappy2(int n) {
        Set<Integer> seen = new HashSet<>();

        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            n = calculateSumOfSquares(n);
        }

        return n == 1;
    }

    private int calculateSumOfSquares(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }

    public boolean isHappy3(int n) {
        int s = n,f = n; // slow , fast

        do{
            s = compute(s); // slow computes only once
            f = compute(compute(f)); // fast computes 2 times

            if(s == 1)return true; // if we found 1 then happy indeed !!!
        }while(s != f); // else at some point they will meet in the cycle

        return false; // it's a cycle , not happy at all !!!
    }

    public int compute(int n){
        int s = 0;
        while(n != 0){
            s += (n%10)*(n%10);
            n = n/10;
        }
        return s;
    }
}
