package com.mycompany.foutoir;

public class PointsInRing {
    public static int countPointsInRing(int inner, int outer, int[] points_x, int[] points_y) {
        int count = 0;

        for (int i = 0; i < points_x.length; i++) {
            int distance =points_x[i] * points_x[i] + points_y[i] * points_y[i];

            if (inner * inner < distance){
                if(distance < outer * outer) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        // Example 1
        int inner1 = 1;
        int outer1 = 3;
        int[] pointsX1 = {0, 1, 2, -2, 3};
        int[] pointsY1 = {0, 1, 4, 1, 0};
        int result1 = countPointsInRing(inner1, outer1, pointsX1, pointsY1);
        System.out.println(result1+ " Output should be 2"); // Output should be 2

        // Example 2
        int inner2 = 2;
        int outer2 = 4;
        int[] pointsX2 = {4, 0, 1, -2};
        int[] pointsY2 = {-4, 4, 3, 0};
        int result2 = countPointsInRing(inner2, outer2, pointsX2, pointsY2);
        System.out.println(result2 + " Output should be 1"); // Output should be 1

        // Example 3
        int inner3 = 0;
        int outer3 = 1;
        int[] pointsX3= {0};
        int[] pointsY3 = {0};
        int result3 = countPointsInRing(inner3, outer3, pointsX3, pointsY3);
        System.out.println(result3 + " Output should be 0"); // Output should be 0

        // Example 4
        int inner4 = 0;
        int outer4 = 10000;
        int[] pointsX4= {0, 5000, -5000};
        int[] pointsY4 = {0, 5000, -5000};
        int result4 = countPointsInRing(inner4, outer4, pointsX4, pointsY4);
        System.out.println(result4+ " Output should be 2"); // Output should be 3


    }
}