package com.whq.container.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.NoSuchElementException;

import static com.whq.util.Print.*;

/**
 * @author: wanghuanqing
 * @date: Create in 2018/6/26 9:40
 * @desc:
 */
public class TestLinkedList {
    public static void main(String[] args) {
        LinkedList<Object> linkedList = new LinkedList<Object>();
        for (int i = 0; i < 10; i++) {
            linkedList.add(i);
        }

        for (Object obj: linkedList
             ) {
            printnb(obj);
        }
        print();

        //通过迭代器遍历
        Iterator iter = linkedList.iterator();
        while (iter.hasNext()){
            printnb(iter.next());
        }
        print();


        ListIterator iter1 = linkedList.listIterator(linkedList.size());
        while (iter1.hasPrevious()){
            printnb(iter1.previous());
        }
        print();
        //linkedList也可以随机访问元素，但是效率比ArrayList低
        //ArrayList是直接通过数组下标获取到元素对象
        //而linkedList从头或者从尾部开始查看每个元素，直到找到指定的元素Node，然后再返回需要的元素item
        print(linkedList.get(3));

        //获取第一个元素，但不移除元素
        //在调用add()方法时，会生成first及last元素
        print(linkedList.getFirst());
        //element方法内部其实也是调用的getFirst方法，那为什么会多此一举呢？
        //此处只是为了适应相应的场景而已，例如实现的Queue接口中方法element与Deque接口中的方法getFirst方法
        print(linkedList.element());

        //调用没有元素的LinkList的getFirst方法会返回NoSuchElementException
        LinkedList linkedList1 = new LinkedList();
        try {
            print(linkedList1.getFirst());
            print(linkedList1.element());
        } catch (NoSuchElementException e) {
            print("getFirst method return null!");
        }

        //peek方法不会抛出异常，只会返回null
        print(linkedList1.peek());
        print(linkedList1.peekFirst());

        //remove方法与removeFirst方法移除并返回第一个元素
        print(linkedList.remove());
        print(linkedList.removeFirst());

        try {
            print(linkedList1.remove());
        } catch (NoSuchElementException e) {
            print("remove method return null!");
        }

        print(linkedList.poll());
        print(linkedList.pollFirst());
        //poll方法不会抛出异常
        print(linkedList1.poll());
    }
}
