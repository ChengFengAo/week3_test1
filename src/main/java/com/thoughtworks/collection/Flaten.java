package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Arrays;
public class Flaten {

    Integer[][] array;
    public Flaten(Integer[][] array) {
        this.array = array;
    }

    public List<Integer> transformToOneDimesional() {
        List<Integer> lis = new ArrayList<>();
      for(Integer[] i:this.array){
              List<Integer> tmpli=Arrays.asList(i);
              lis.addAll(tmpli);
          }
        return lis;
    }

    public List<Integer> transformToUnrepeatedOneDimesional() {
        List<Integer> lis = new ArrayList<>();
        for(Integer[] i:this.array){
            List<Integer> tmpli=Arrays.asList(i);
            tmpli.forEach(x->{
                if(lis.contains(x)!=true)
                {
                    lis.add(x);
                }
            });
        }
        return lis;
    }
}
