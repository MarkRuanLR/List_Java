package com.thoughtworks.collection;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {

    List<Integer>  array;

    public Filter(List<Integer> array) {
     this.array = array;
    }

    public List<Integer> filterEven() {
        List<Integer>result = new ArrayList<>();
        result = array;
        result = result.stream()
                .filter(temp -> temp%2 == 0)
                .collect(Collectors.toList());



        return result;
    }

    public List<Integer> filterMultipleOfThree() {
        List<Integer>result = new ArrayList<>();
        result = array;
        result = result.stream()
                .filter(temp -> temp%3 == 0)
                .collect(Collectors.toList());
        return result;
    }

    public List<Integer> getCommonElements(List<Integer> firstList, List<Integer> secondList) {
        firstList = firstList.stream()
                .filter(temp -> secondList.contains(temp))
                .collect(Collectors.toList());
        return firstList;
    }

    public List<Integer> getDifferentElements() {
        List<Integer>result = new ArrayList<>();
        result = array;
        result = result.stream()
                .distinct()
                .collect(Collectors.toList());
        return result;
    }
}