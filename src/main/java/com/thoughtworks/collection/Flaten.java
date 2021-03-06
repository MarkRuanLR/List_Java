package com.thoughtworks.collection;


import java.util.ArrayList;
import java.util.List;

public class Flaten {

    Integer[][] array;
    public Flaten(Integer[][] array) {
        this.array = array;
    }
    public List<Integer> transformToOneDimesional() {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            for(int j = 0;j < array[i].length; j++)
                result.add(array[i][j]);
        }
        return result;
    }

    public List<Integer> transformToUnrepeatedOneDimesional() {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            for(int j = 0;j < array[i].length; j++) {
                boolean flag = true;
                for (Integer temp : result){
                    if (temp == array[i][j])
                        flag = false;
                }
                if (flag)
                    result.add(array[i][j]);
            }
        }
        return result;
    }
}
