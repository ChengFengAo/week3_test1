package com.thoughtworks.collection;

public class Node implements SingleLink <Integer>{
    private class Data{
        private int data;//存放数据
        private Data next; //存放节点的变量；

        public Data(int datas) {
            this.data =datas;
        }

    }
    private Data head=null;  //头指针
    private Data tail=null;


    public Integer getHeaderData(){return 0;}
    public Integer getTailData(){return 0;};
    public int size(){
        int length=0;
          Data tmp =head;
          while (tmp.next!=null)
          {
              length++;
              tmp=tmp.next;
          }
          return length;
          }
    public boolean isEmpty(){return head==null;}
    public boolean deleteFirst(){return true;}
    public boolean deleteLast(){return true;}            //删除尾部元素；
    public void addHeadPointer(Integer item){
       head=new Data(0);//头指针指向第一个元素
    }    //添加头指针
    public void addTailPointer(Integer item){   //添加尾指针
         Data tmp=head;
         int length=1;
        for (int i = 0; i <size() ; i++) {
            if(item==length++)
            {
                tail=tmp.next;
            }
        }

    }
    public Integer getNode(int index) {
        Integer result=0;
        if(index<1||index>size())
        {
            try {
                throw  new  Exception("Out of Range");
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
        int length=1; ///???/c
        Data tmp=head;
        while (tmp.next!=null)
        {
            if(index==length++)
            {
                result=tmp.data;
            }
        }
        return result;
    }
}
