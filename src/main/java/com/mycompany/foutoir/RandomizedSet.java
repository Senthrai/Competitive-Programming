package com.mycompany.foutoir;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomizedSet {

    List<Integer> randomizedSet;
    public RandomizedSet() {
        randomizedSet = new ArrayList<>();
    }

    public boolean insert(int val) {
        if(randomizedSet.contains(val)){
            return false;
        }else{
            randomizedSet.add(val);
            return true;
        }
    }

    public boolean remove(int val) {
        int index = randomizedSet.indexOf(val);
        if(index != -1){
            randomizedSet.remove(index);
            return true;
        }else{
            return false;
        }
    }

    public int getRandom() {
        Random random = new Random();
        return randomizedSet.get(random.nextInt(randomizedSet.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
