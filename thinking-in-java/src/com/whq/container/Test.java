package com.whq.container;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author: wanghuanqing
 * @date: Create in 2018/6/21 10:04
 * @desc:
 */
public class Test {
    private static int size;
    public static void main(String[] args) {
        List list = Arrays.asList(1,2,3);
        //Arrays类返回的是受指定数组支持的固定大小的列别。
        //Arrays类中的内部类ArrayList中的属性private final E[] a;final不可再更改
        //list.add(4);
        Integer[] i = {};
        System.out.println(i.length);
        i = Arrays.copyOf(i , 2);
        System.out.println(i.length);
        i[size++] = 3;
        System.out.println(i.length);
        for (Integer in: i
             ) {
            if(in == null || in == 0){
                System.out.println("whq");
            }else {
                System.out.println(in);
            }
        }
        ArrayList list1 = new ArrayList(2);
        list1.add(1);
        list1.add(2);
        list1.add(3);


    }
}
