package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;
import java.util.stream.Collectors;

public class Add {
    int sum1, sum2, sum3 = 0;

    public int getSumOfEvens(int leftBorder, int rightBorder) {
        //int sum = 0;
        for (int i = leftBorder; i <= rightBorder; i++) {
            if (i % 2 == 0) {
                sum1 += i;
            }
        }
        System.out.print(sum1);
        return sum1;
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        for (int i = leftBorder; i <= rightBorder; i++) {
            if (i % 2 == 1) {
                sum2 += i;
            }
        }
        System.out.print(sum2);
        return sum2;
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        // System.out.println(arrayList.get(0));
        for (int i = 0; i <= arrayList.size() - 1; i++) {
            sum3 += arrayList.get(i) * 3 + 2;
        }
        return sum3;

    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) % 2 == 1) {
                arrayList.set(i, arrayList.get(i) * 3 + 2);
            }
        }
        System.out.println(arrayList);
        return arrayList;
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        int sum4 = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) % 2 == 1) {
                sum4 += arrayList.get(i) * 3 + 5;
            }
        }
        return sum4;
    }

    public double getMedianOfEvenIndex(List<Integer> arrayList) {
        List<Integer> tmp = new ArrayList<>();
        for (int i = 0; i <arrayList.size()-1; i++) {
            if (arrayList.get(i) % 2 == 0) {
                tmp.add(arrayList.get(i));
            }
        }
        int mid=0;
        for (int i = 0; i <tmp.size() ; i++) {
            mid += tmp.get(i);
        }

       return mid/2;
    }

    public double getAverageOfEvenIndex(List<Integer> arrayList) {
        int avg=0,count=0;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) % 2 == 0) {
                avg += arrayList.get(i);
                count+=1;
            }
        }
        return  avg/count;
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        List<Integer> tmp = new ArrayList<>();
        for (Integer ele:arrayList) {
            if (ele % 2 == 0) {
                tmp.add(ele);
            }
        }
        return tmp.contains(specialElment);
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        List<Integer> tmp = new ArrayList<>();
        for (int i = 0; i <arrayList.size() ; i++) {
            if (arrayList.get(i) % 2 == 0) {
                tmp.add(arrayList.get(i));
            }
        }

        return tmp;
    }

    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
        List<Integer> odd = new ArrayList<>();
        List<Integer> ev = new ArrayList<>();
        for (int i = 0; i <arrayList.size() ; i++) {
            if (arrayList.get(i)%2==0) {
                odd.add(arrayList.get(i));
            }
            else {
                ev.add(arrayList.get(i));
            }
        }
       /* odd.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        ev.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(odd);
        System.out.println(ev);*/
       Collections.sort(odd);
       Collections.reverse(ev);
        ev.addAll(0,odd);
        return ev;

    }

    public List<Integer> getProcessedList(List<Integer> arrayList) {
        ArrayList<Integer> tmp = new ArrayList<>();
        for (int i = 0; i < arrayList.size()-1; i++) {
            tmp.add((arrayList.get(i) + arrayList.get(i + 1)) * 3);
        }
        return tmp;
    }
}
