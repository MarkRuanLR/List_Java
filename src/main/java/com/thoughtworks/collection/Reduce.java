package com.thoughtworks.collection;


import java.awt.*;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Reduce implements SingleLink{

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
        header = new Node();
        tail = header;
        size = 0;
        for(int temp : arrayList){
            this.addTailPointer(temp);
        }
    }

    public int getMaximum() {
        return Collections.max(arrayList);
    }

    public double getMinimum() {
        return Collections.min(arrayList);
    }

    public double getAverage() {
        double temp = arrayList.stream()
                .reduce(0,Integer::sum);
        return temp/arrayList.size();
    }

    public double getOrderedMedian() {
        double result;
        if(arrayList.size()%2 == 0)
            result = (arrayList.get(arrayList.size()/2) + arrayList.get(arrayList.size()/2 - 1))/2.0;
        else{
            result = arrayList.get(arrayList.size()/2);
        }
        return result;
    }

    public int getFirstEven() {
        for (int temp : arrayList){
            if(temp % 2 == 0)
                return temp;
        }
        return 0;
    }

    public int getIndexOfFirstEven() {
        for (int temp : arrayList){
            if(temp % 2 == 0)
                return arrayList.indexOf(temp);
        }
        return 0;
    }

    public boolean isEqual(List<Integer> arrayList1) {
        boolean result = arrayList1.containsAll(arrayList);
        return result;
    }
    //实现接口SingleLink，然后再此函数内使用
//    public class Singlelink<T> implements SingleLink{
        private class Node{
            private Object data;
            private Node next = null;
            public Node(){
                data = null;
            }
            public Node(Object data){
                this.data = data;
            }
        }

        private Node header;
        private Node tail;
        private Node point;
        private int size;

        @Override
        public Object getHeaderData() {
            return header.data;
        }

        @Override
        public Object getTailData() {
            return tail.data;
        }

        @Override
        public int size() {
            return size;
        }

        @Override
        public boolean isEmpty() {
            if (size==0)
            return true;
            else
                return false;
        }

        @Override
        public boolean deleteFirst() {
            return false;
        }

        @Override
        public boolean deleteLast() {
            return false;
        }

        @Override
        public void addHeadPointer(Object item) {
            point = new Node(item);
            point.next = header;
            header = point;
            size++;
        }

        @Override
        public void addTailPointer(Object item) {
            point = new Node(item);
            tail.next = point;
            tail = point;
            size++;
        }

        @Override
        public Object getNode(int index) {
            Object temp = 0;
            if(index >= size)
                return null;
            point = header;
            for (int i = 0; i <=index ; i++) {
                point = point.next;
                temp = point.data;
            }
            return temp;
        }
//    }

    public Double getMedianInLinkList(SingleLink singleLink) {

        double result;
        if(this.size()%2 == 0)
            result = ((int)this.getNode(this.size()/2) + (int)this.getNode(this.size()/2 - 1))/2.0;
        else{

            result = (int)this.getNode(this.size()/2);
        }
        return result;
    }


    public int getLastOdd() {
        int result=0;
        for (int temp : arrayList){
            if(temp % 2 != 0)
                result = temp;
        }
        return result;
    }

    public int getIndexOfLastOdd() {
        int result=0;
        for (int temp : arrayList){
            if(temp % 2 != 0)
                result = temp;
        }
        return arrayList.indexOf(result);
    }
}
