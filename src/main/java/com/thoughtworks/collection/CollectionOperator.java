package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {
        List<Integer> result = new ArrayList<>();
        if (left < right) {
            for (int i = left; i <= right; i++) {
                result.add(i);
            }
        } else {
            for (int j = left; j >= right; j--) {
                result.add(j);
            }
        }
        System.out.println(result);
        return result;
    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
        List<Integer> result = new ArrayList<>();
        if (left < right) {
            for (int i = left; i <= right; i++) {
                if (i % 2 == 0) {
                    result.add(i);
                }
            }
        } else {
            for (int j = left; j >= right; j--) {
                if (j % 2 == 0) {
                    result.add(j);
                }
            }
        }
        return result;
    }

    public List<Integer> popEvenElments(int[] array) {
        List<Integer> result = new ArrayList<>();
        for (Integer ele : array) {
            if (ele % 2 == 0) {
                result.add(ele);
            }
        }
        return result;
    }

    public int popLastElment(int[] array) {
        return array[array.length - 1];
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        List<Integer> first = IntStream.of(firstArray).boxed().collect(Collectors.toList());//数组转换为流
        List<Integer> second = IntStream.of(secondArray).boxed().collect(Collectors.toList());
        first.retainAll(second);
        return first;
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        List<Integer> first1= Arrays.asList(firstArray);
        List<Integer> first= new ArrayList(first1);
        List<Integer> second = Arrays.asList(secondArray);
        Boolean t = true;
        for (int i = 0; i <second.size() ; i++) {
            if (first.contains(secondArray[i])!=t) {
                first.add(secondArray[i]);
            }
            }
        System.out.println(first);
            return first;

    }
}
