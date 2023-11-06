package com.mycompany.foutoir;

public class GasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0;
        int currentGas = 0;
        int startingIndex = 0;

        for (int i = 0; i < gas.length; i++) {
            int diff = gas[i] - cost[i];
            totalGas += diff;
            currentGas += diff;

            // If currentGas becomes negative, reset and update the starting index.
            if (currentGas < 0) {
                currentGas = 0;
                startingIndex = i + 1;
            }
        }

        // If totalGas is non-negative, a valid starting point exists.
        return totalGas >= 0 ? startingIndex : -1;


    }

}
