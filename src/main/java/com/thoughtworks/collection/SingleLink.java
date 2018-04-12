package com.thoughtworks.collection;

public interface SingleLink<Integer> {
    public Integer getHeaderData();
    public Integer getTailData();
    public int size();
    public boolean isEmpty();
    public boolean deleteFirst();
    public boolean deleteLast();                //删除尾部元素；
    public void addHeadPointer(Integer item);    //添加头指针
    public void addTailPointer(Integer item);         //添加尾指针
    public Integer getNode(int index) ;
}