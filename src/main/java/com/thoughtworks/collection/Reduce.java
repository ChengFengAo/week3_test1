package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;

public class Reduce{

    List<Integer> arrayList;
    public int data;
    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public int getMaximum() {
        int result = this.arrayList.stream()
                .reduce(this.arrayList.get(0), Integer::max);
        return result;
    }

    public double getMinimum() {
        int result = this.arrayList.stream()
                .reduce(this.arrayList.get(0), Integer::min);
        return result;
    }

    public double getAverage() {
        int result = this.arrayList.stream()
                .reduce(0, Integer::sum);
        //  System.out.print( result/this.arrayList.size());
        double result11 = (result + 0.0) / (this.arrayList.size() + 0.0);
        return result11;
    }

    public double getOrderedMedian() {
        double tmp;
        double result = 0;
        if (this.arrayList.size() % 2 == 0) {
            tmp = this.arrayList.stream()
                    .sorted(Comparator.naturalOrder())
                    .skip(this.arrayList.size() / 2 - 1)
                    .limit(2)            //限制两个步长
                    .reduce(Integer::sum).get();   //求和
            result = (double) tmp / 2;

        } else {
            result = this.arrayList.stream()
                    .sorted()
                    .skip(this.arrayList.size() / 2)
                    .limit(1)
                    .findFirst()
                    .get();
        }
        return result;
    }

    public int getFirstEven() {
        int result = 0;
        for (int i = 0; i < this.arrayList.size(); i++) {
            if (this.arrayList.get(i) % 2 == 0) {
                result = this.arrayList.get(i);
                break;
            }
        }
        return result;
    }

    public int getIndexOfFirstEven() {
        int result = 0;
        for (int i = 0; i < this.arrayList.size(); i++) {
            if (this.arrayList.get(i) % 2 == 0) {
                result = i;
                break;
            }
        }
        return result;
    }

    public boolean isEqual(List<Integer> arrayList) {
        Boolean result;
        if (this.arrayList.size() != arrayList.size()) {
            result = false;
        } else {
            if (this.arrayList.containsAll(arrayList)) {
                result = true;
            } else {
                result = false;
            }
        }
        return result;

    }

    //实现接口SingleLink，然后再此函数内使用
    public Double getMedianInLinkList(SingleLink singleLink) {
        int tmp;
        tmp =this.arrayList.stream()
                .skip(this.arrayList.size()/2-1)
                .limit(2)
                .reduce(Integer::sum)
                .get();
        return (double)tmp/2;
    /*    singleLink.addHeadPointer(this.arrayList.get(0));  //头指针指向链表
        for (int i = 0; i <this.arrayList.size() ; i++) {

        }*/
    }

    public int getLastOdd() {
        int result = 0;
        for (int i = 0; i < this.arrayList.size(); i++) {
            if (this.arrayList.get(i) % 2 != 0) {
                result = this.arrayList.get(i);
            }
        }
        return result;
    }

    public int getIndexOfLastOdd() {
        int result = 0;
        for (int i = 0; i < this.arrayList.size(); i++) {
            if (this.arrayList.get(i) % 2 != 0) {
                result = i;
            }
        }
        return result;
    }
    //创建一个node类

  /*  public class Node {
        private int data;
        private Node next;

        public Node() {
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
    private Node head;//指向链表头节点的引用变量
    private Node tail;//指向链表尾节点的引用变量
    int size;//链表中当前总节点数

    //生成链表对象是一个空表
    public Reduce() {
        head = null;
        tail = null;
    }

    //生成链表对象时有一个头节点 （有参构造器）
    public Reduce(int data) {
        head = new Node(data, null);//指定一个头节点的数据域值为data,不指向其他节点
        tail = head;
        size++;
    }

    public Integer getHeaderData() {
        head = new Node(data, null);//指定一个头节点的数据域值为data,不指向其他节点
        tail = head;
        size++;
        return this.getNode(0);
    }

    public Integer getTailData() {
       // return s.getNode(s.size());
    }

    public int size() {
        return size;
    }   //返回长度

    public boolean isEmpty() {
        return true;
    }

    public boolean deleteFirst() {
        return true;
    }
    public boolean deleteLast() { return true;}               //删除尾部元素；

    public void addHeadPointer(T item){}    //添加头指针
    public void addTailPointer(T item){}        //添加尾指针

    //按索引查找元素
    public Integer getNode(int index) {
        if (index < 0 || index > size - 1) {
            throw new IndexOutOfBoundsException("线性表索引越界");
        }
        Node current = head;//从头节点开始下移遍历
        for (int i = 0; i < size && current.next != null; i++, current = current.next) {
            if (i == index) {
                return current.data;
            }
        }
        return null;
    } //返回指定元素*/
}
