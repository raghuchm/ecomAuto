package com.eclectic.interview.filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestCount {

    public static void main(String[] args) {
        String test="mahesh";
        char[] arr=test.toCharArray();
        List<char[]> listVal = Arrays.asList(arr);
        printList(listVal);
        List testList = listVal.stream().distinct().collect(Collectors.toList());
        printList1(testList);

//        HashSet hashSet=new HashSet();
//        hashSet.addAll(Arrays.asList(test.toCharArray()));

//        System.out.println(testList.toString());
    }

    public static void printList(List<char[]> l1){

        for (char[] l:l1
             ) {
            System.out.println(l);

        }
    }

    public static void printList1(List l1){

        for (Object l:l1
        ) {
            System.out.println(l);

        }
    }
}
