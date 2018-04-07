package com.thoughtworks.collection;

import javafx.print.Collation;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {
        int sum = 0;
        if(leftBorder > rightBorder){
            int temp = leftBorder;
            leftBorder = rightBorder;
            rightBorder = temp;
        }
        for(int i = leftBorder; i <= rightBorder; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        return sum;
//        throw new NotImplementedException();
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        int sum = 0;
        if(leftBorder > rightBorder){
            int temp = leftBorder;
            leftBorder = rightBorder;
            rightBorder = temp;
        }
        for(int i = leftBorder; i <= rightBorder; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
            }
        }
        return sum;
//        throw new NotImplementedException();
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        int sum = 0;
        for(Integer temp : arrayList){
            sum = sum + temp*3 + 2;
        }
        return sum;
//        throw new NotImplementedException();
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            if(arrayList.get(i) % 2 != 0){
                arrayList.set(i,arrayList.get(i) * 3 +2);
            }
        }
        return arrayList;
//        throw new NotImplementedException();
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        int sum = 0;
        for(Integer temp : arrayList){
            if(temp % 2 != 0)
                sum = sum + temp*3 + 5;
        }
        return sum;
//        throw new NotImplementedException();
    }

    public double getMedianOfEvenIndex(List<Integer> arrayList) {
        List<Integer> resultList = new ArrayList<Integer>();
        double result = 0;
        for(Integer temp : arrayList){
            if(temp % 2 == 0){
                resultList.add(temp);
            }
        }
        if(resultList.size()%2 == 0)
            result = (resultList.get(resultList.size()/2) + resultList.get(resultList.size()/2 - 1))/2;
        else{
            result = resultList.get(resultList.size()/2);
        }
        return result;
//        throw new NotImplementedException();
    }

    public double getAverageOfEvenIndex(List<Integer> arrayList) {
        double average = 0;
        double sum = 0;
        int count = 0;
        for(Integer temp : arrayList){
            if(temp % 2 ==0){
                sum = sum + temp;
                count++;
            }
        }
        average = sum / count;
        return average;
//        throw new NotImplementedException();
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        List<Integer> resultList = new ArrayList<Integer>();
        for(Integer temp : arrayList){
            if(temp % 2 == 0){
                resultList.add(temp);
            }
        }
        boolean flag = false;
        for(Integer temp2 : resultList){
            if(temp2 == specialElment)
                flag = true;
        }
        return flag;
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        List<Integer> resultList = new ArrayList<Integer>();
        for(Integer temp : arrayList){
            if(temp % 2 == 0){
                resultList.add(temp);
            }
        }
        return resultList;
    }

    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
        List<Integer> resultListEven = new ArrayList<Integer>();
        List<Integer> resultListOdd = new ArrayList<Integer>();
        List<Integer> resultList = new ArrayList<Integer>();
        for(Integer temp : arrayList){
            if(temp % 2 == 0){
                resultListEven.add(temp);
            }
            else
                resultListOdd.add(temp);
        }
        Collections.sort(resultListEven);
        Collections.sort(resultListOdd, Collections.reverseOrder());
        resultList.addAll(resultListEven);
        resultList.addAll(resultListOdd);
        return resultList;
    }

    public List<Integer> getProcessedList(List<Integer> arrayList) {
        List<Integer> resultList = new ArrayList<Integer>();
        for (int i = 0; i < arrayList.size(); i++) {
            if(i + 1 != arrayList.size()){
                resultList.add(3 * (arrayList.get(i) + arrayList.get(i + 1)));
            }
        }
        return resultList;
//        throw new NotImplementedException();
    }
}
