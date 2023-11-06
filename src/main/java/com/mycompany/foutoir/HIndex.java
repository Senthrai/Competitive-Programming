package com.mycompany.foutoir;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

public class HIndex {
    public int hIndex(int[] citations) {
        int h = 0;
        Arrays.sort(citations);
        if (citations[citations.length - 1] == 0) return 0;
        
        reverse(citations);
        for (int i = 0; i < citations.length; i++) {
            if (citations[i] >= i + 1) {
                h++;
            }
        }
        return h;
    }

    public void reverse(int[] array) {

        if (array == null || array.length < 2) {
            return;
        }

        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }

    }
}
