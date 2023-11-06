/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.foutoir;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author senth
 */
public class FizzBuzz {
    
    public static void main(String[] args){
        FizzBuzz fizbuzz = new FizzBuzz();
        System.out.println(fizbuzz.fizzBuzz(3));
    }

    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            String tmp;
            if ((i % 3) == 0) {
                tmp = "Fizz";
                if ((i % 5) == 0) {
                    tmp = "FizzBuzz";
                }
            } else if (i % 5 == 0) {
                tmp = "Buzz";
            } else {
                tmp = String.valueOf(i);
            }
            list.add(tmp);
        }
        return list;
    }

}
