package com.mycompany.foutoir;

import java.util.*;

public class MapToList {
    public static void main(String[] args) {
        test3();
    }

    static void test1(){
        Map<String, Integer> mapUrl = new HashMap<>();

        mapUrl.put("google", mapUrl.getOrDefault("google", 0)+1);
        mapUrl.put("amazon", mapUrl.getOrDefault("amazon", 0)+1);
        mapUrl.put("google", mapUrl.getOrDefault("google", 0)+1);
        mapUrl.put("google", mapUrl.getOrDefault("google", 0)+1);
        mapUrl.put("google", mapUrl.getOrDefault("google", 0)+1);
        mapUrl.put("mtg", mapUrl.getOrDefault("mtg", 0)+1);
        mapUrl.put("warhammer", mapUrl.getOrDefault("warhammer", 0)+1);
        mapUrl.put("amazon", mapUrl.getOrDefault("amazon", 0)+1);

        List<String> listUrl = new ArrayList<>();
        int max = Integer.MIN_VALUE;

        for(Map.Entry<String, Integer> entry : mapUrl.entrySet()){
            String key = entry.getKey();
            int value = entry.getValue();

            int insertIndex = 0;
            while(insertIndex < listUrl.size() && mapUrl.get(listUrl.get(insertIndex)) < value){
                insertIndex++;
            }

            listUrl.add(insertIndex, key);
        }

        System.out.println(listUrl);
        System.out.println(mapUrl);
    }

    static void test2(){
        Map<String, Integer> mapUrl = new HashMap<>();

        mapUrl.put("google", mapUrl.getOrDefault("google", 0)+1);
        mapUrl.put("amazon", mapUrl.getOrDefault("amazon", 0)+1);
        mapUrl.put("google", mapUrl.getOrDefault("google", 0)+1);
        mapUrl.put("google", mapUrl.getOrDefault("google", 0)+1);
        mapUrl.put("google", mapUrl.getOrDefault("google", 0)+1);
        mapUrl.put("mtg", mapUrl.getOrDefault("mtg", 0)+1);
        mapUrl.put("warhammer", mapUrl.getOrDefault("warhammer", 0)+1);
        mapUrl.put("amazon", mapUrl.getOrDefault("amazon", 0)+1);

        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(mapUrl.entrySet());

        System.out.println("Original List : " + entryList);

        Collections.sort(entryList, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                int valueComparison = o1.getValue().compareTo(o2.getValue());
                if(valueComparison==0){
                    return o2.getKey().compareTo(o1.getKey());
                }
                return valueComparison;
            }
        });
        System.out.println("Sorted List : " + entryList);

        ArrayList<String> resultList = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : entryList) {
            resultList.add(entry.getKey());
        }

        Collections.reverse(resultList);

        System.out.println("Result List : " + resultList);
    }

    static void test3(){
        Map<String, Integer> mapUrl = new HashMap<>();

        mapUrl.put("google", mapUrl.getOrDefault("google", 0)+1);
        mapUrl.put("amazon", mapUrl.getOrDefault("amazon", 0)+1);
        mapUrl.put("google", mapUrl.getOrDefault("google", 0)+1);
        mapUrl.put("google", mapUrl.getOrDefault("google", 0)+1);
        mapUrl.put("google", mapUrl.getOrDefault("google", 0)+1);
        mapUrl.put("mtg", mapUrl.getOrDefault("mtg", 0)+1);
        mapUrl.put("warhammer", mapUrl.getOrDefault("warhammer", 0)+1);
        mapUrl.put("amazon", mapUrl.getOrDefault("amazon", 0)+1);

        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(mapUrl.entrySet());

//        entryList.sort(new Comparator<Map.Entry<String, Integer>>() {
//            @Override
//            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
//                int valueComparison = o2.getValue().compareTo(o1.getValue());
//                if (valueComparison == 0) {
//                    return o1.getKey().compareTo(o2.getKey());
//                }
//                return valueComparison;
//            }
//        });
        entryList.sort((o1, o2) -> {
            int valueComparison = o2.getValue().compareTo(o1.getValue());
            if(valueComparison==0){
                return o1.getKey().compareTo(o2.getKey());
            }
            return valueComparison;
        });

        ArrayList<String> resultList = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : entryList) {
            resultList.add(entry.getKey());
        }

        System.out.println(resultList);
    }
}