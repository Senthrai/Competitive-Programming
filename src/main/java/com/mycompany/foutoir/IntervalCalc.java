package com.mycompany.foutoir;

public class IntervalCalc {
//    write the body of the calc(int [] array, int n1, int n2)
//
//    n1 and n2 : 0 <= n1 <= n2 < array.length
//
//    the method should return the sum of the integers of array whose index belongs to the [n1;n2] interval

    public int calc(int[] array, int n1, int n2){
        if(n1 < 0 || n1 > n2 || n2 >= array.length) return -1;

        int sum = 0;
        for(int i = n1; i <= n2;i++){
            sum += array[i];
        }

        //TODO
        return sum;
    }
}
