package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.toList;

public class MyMap {

    List<Integer> array;
    private String[] letters = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private List<String> letterList = Arrays.asList(letters);

    public MyMap(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> getTriple() {
       /* for (int i = 0; i < this.array.size(); i++) {
            this.array.set(i,this.array.get(i)*3);
        }
        return this.array;*/
        List<Integer> result = new ArrayList<>();
        result = this.array.stream()
                .map(x -> x * 3)
                .collect(toList());
        return result;

    }

    public List<String> mapLetter() {
        List<String> result = new ArrayList<>();
       result=this.array.stream()
               .map( x->((char)(x+64)+ "").toLowerCase())
               .collect(toList());
       return result;
    }

    public List<String> mapLetters() {
    List<String> result= new ArrayList<>();
    for (Integer it:array){
        int tmp=it.intValue();
        String map =new String();
        double flags= Math.log(tmp)/Math.log(26);
        for (int i=0;i<=flags;i++)
        {
            char c;
            int cur;
            cur=tmp-i*26;
            int d=cur/26;
            int m=cur%26;
            if (m==0){
                d-=1;
                m=26;
            }
            if(d==0)
            {
                cur=m+96;
                c=(char)cur;
                map += c;
            }
            else {
                cur=d+96;
                c=(char)cur;
                map +=c;
            }

        }
        result.add(map);
    }
    return result;
    }

    public List<Integer> sortFromBig() {
        List<Integer> result = new ArrayList<>();
        result=array.stream().sorted(Comparator.reverseOrder()).collect(toList());
        return result;
    }

    public List<Integer> sortFromSmall() {
        List<Integer> result = new ArrayList<>();
        result=array.stream().sorted(Comparator.naturalOrder()).collect(toList());
        return result;
    }
}
