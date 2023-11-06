package com.mycompany.foutoir;

import java.util.*;

public class Mountains {
    void test(){
        Scanner in = new Scanner(System.in);
        Map<Integer, List<Integer>> mapM = new HashMap<>();
        for (int i = 0; i < 8; i++) {
            int mountainH = in.nextInt(); // represents the height of one mountain.
            List<Integer> mountainList = mapM.getOrDefault(mountainH, new ArrayList<>());
            mountainList.add(i);
            mapM.put(mountainH, mountainList);
        }
    }
}
