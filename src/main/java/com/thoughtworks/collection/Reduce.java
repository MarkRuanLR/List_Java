package com.thoughtworks.collection;


import java.util.Collections;
import java.util.List;

public class Reduce implements SingleLink<Integer>{

    List<Integer> arrayList;
//    修改了Reduce的构造器
//    把arratlist直接传入singlelink
    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
        header = new Node();
        tail = header;
        size = 0;
    }
//    构造器到此结束
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
//    创建了Node类
//    实现接口

        private class Node{
            private Integer data;
            private Node next = null;
            public Node(){
                data = null;
            }
            public Node(Integer data){
                this.data = data;
            }
        }

        private Node header;
        private Node tail;
        private Node point;
        private int size;

        @Override
        public Integer getHeaderData() {
            return header.data;
        }

        @Override
        public Integer getTailData() {
            return tail.data;
        }

        @Override
        public int size() {
            return this.size;
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
        public void addHeadPointer(Integer item) {
            point = new Node(item);
            point.next = header;
            header = point;
            size++;
        }

        @Override
        public void addTailPointer(Integer item) {
            point = new Node(item);
            tail.next = point;
            tail = point;
            this.size++;
        }

        @Override
        public Integer getNode(int index) {
            Integer temp = 0;
            if(index >= arrayList.size())
                return null;
            point = header;
            for (int i = 0; i <=index ; i++) {
                point = point.next;
                temp = point.data;
            }
            return temp;
        }
//实现接口到此结束
//    以下是测试用例要求的函数
    public Double getMedianInLinkList(SingleLink singleLink) {
        double result = 0;
        Integer temp1,temp2;
        for (int temp : arrayList){
            singleLink.addTailPointer(temp);
        }

        if(arrayList.size()%2 == 0) {
            temp1 = singleLink.getNode(arrayList.size() / 2);
            temp2 = singleLink.getNode(arrayList.size() / 2 + 1);

            result = temp1/2.0+temp2/2.0;

        }
        else{
            result = singleLink.getNode(arrayList.size() / 2);
        }
        return result;
    }
//测试用例要求的函数到此结束

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
