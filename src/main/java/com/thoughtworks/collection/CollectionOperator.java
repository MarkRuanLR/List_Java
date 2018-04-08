package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {
        List<Integer> result = new ArrayList<>();
        boolean flag = true;
        if(left > right){
            int temp = left;
            left = right;
            right = temp;
            flag = false;
        }
        for (int i = left; i <= right; i++) {
            result.add(i);
        }
        if(!flag)
            Collections.reverse(result);
        return result;
    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
        List<Integer> result = new ArrayList<>();
        boolean flag = true;
        if(left > right){
            int temp = left;
            left = right;
            right = temp;
            flag = false;
        }
        for (int i = left; i <= right; i++) {
            if(i%2 == 0)
            result.add(i);
        }
        if(!flag)
            Collections.reverse(result);
        return result;
    }

    public List<Integer> popEvenElments(int[] array) {
        List<Integer> result = new ArrayList<>();
        for(Integer temp : array){
            if(temp%2 ==0)
                result.add(temp);
        }
        return result;
    }

    public int popLastElment(int[] array) {
        int temp;
        temp = array[array.length-1];
        return temp;
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        List<Integer> result = new ArrayList<>();
        boolean flag;
        for(Integer temp1 : firstArray) {
            flag = false;
            for (Integer temp2 : secondArray) {
                if (temp1 == temp2)
                    flag = true;
            }
            if (flag)
                result.add(temp1);
        }
        return result;
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        List<Integer> result = new ArrayList<>();
        for(Integer temp : firstArray)
            result.add(temp);
        boolean flag;
        for(Integer temp1 : secondArray) {
            flag = false;
            for (Integer temp2 : firstArray) {
                if (temp1 == temp2)
                    flag = true;
            }
            if (!flag)
                result.add(temp1);
        }
        return result;
    }
}
