package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Filter {

    List<Integer>  array;

    public Filter(List<Integer> array) {
     this.array = array;
    }

    public List<Integer> filterEven() {
    List<Integer> result = this.array.stream()
             .filter(x ->(x%2) ==0) //过滤
             .collect(Collectors.toList());//将流数据转换为list,并将数据分到一个流中
      return result;
    }

    public List<Integer> filterMultipleOfThree() {
       List<Integer>  result = this.array.stream()
               .filter(x -> x%3 ==0)
               .collect(Collectors.toList());
       return result;
    }

    public List<Integer> getCommonElements(List<Integer> firstList, List<Integer> secondList) {
       List<Integer> first = new ArrayList(firstList);
       List<Integer> second = new ArrayList(secondList);
        first.retainAll(second);
        return first;
    }

    public List<Integer> getDifferentElements() {
        List<Integer> result = this.array.stream()
                .distinct()
                .collect(Collectors.toList());
        return result;
    }
}