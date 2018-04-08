package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MyMap {

    List<Integer> array;
    private String[] letters = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private List<String> letterList = Arrays.asList(letters);

    public MyMap(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> getTriple() {
        List<Integer> result = new ArrayList<>();
        for (Integer temp : array)
            result.add(temp*3);
        return result;
    }

    public List<String> mapLetter() {
        List<String> result = new ArrayList<>();
        for (Integer temp : array)
            result.add(letterList.get(temp-1));
        return result;
    }

    public List<String> mapLetters() {
        List<String> result = new ArrayList<>();
        for(int temp : array){
            int count = -1;
            while (temp > 26){
                temp -=26;
                count++;
            }
            if(count == -1){
                result.add(letterList.get((temp-1)));
            }
            else
                result.add(letterList.get(count).concat(letterList.get(temp-1)));
        }
        return result;
    }

    public List<Integer> sortFromBig() {
        Collections.sort(array);
        Collections.reverse(array);
        return array;
    }

    public List<Integer> sortFromSmall() {
        Collections.sort(array);
        return array;
    }
}
