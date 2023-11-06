/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.foutoir;

/**
 *
 * @author senth
 */
public class Foutoir {

    public Foutoir() {
    }

    
    public static void main(String[] args) {
        Foutoir foutoir = new Foutoir();
        foutoir.permutation("cat");
    }
    
    void permutation(String str){
        permutation(str, "");
    }
    
    void permutation(String str, String prefix){
        System.out.println("\nString : " + str + " | prefix : " + prefix);
        System.out.println("New loop");
        if(str.length() == 0){
            System.out.println(prefix);
            System.out.println("Out of recusion\n");
        }else{
            for(int i = 0; i < str.length();i++){
                System.out.println("i : " + i + "\nsubstring [0,i] : " + str.substring(0,i));
                System.out.println("substring [i+1] : " + str.substring(i+1));
                String reste = str.substring(0,i)+str.substring(i+1);
                System.out.println("reste : " + reste);
                permutation(reste, prefix + str.charAt(i));
                System.out.println("After the recursion");
            }
        }
    }
}
