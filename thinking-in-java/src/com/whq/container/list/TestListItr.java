package com.whq.container.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import static com.whq.util.Print.print;
import static com.whq.util.Print.printf;
import static com.whq.util.Print.printnb;

/**
 * @author: wanghuanqing
 * @date: Create in 2018/6/25 9:24
 * @desc: 测试List迭代器ListIterator
 */
public class TestListItr {
    private static int index0, index1;
    public static void main(String[] args) {
        List list = new ArrayList();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        print(list.get(3));
        //如果只是顺序遍历容器中的元素时，foreach是最好的选择
        for (Object i : list
             ) {
            printnb(i);
        }
        print();
        print("for each方式遍历完成");

        //以下通过迭代器Iterator顺序遍历list集合中的元素
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            printnb(iterator.next());
        }
        print();
        print("迭代器 Iterator 方式遍历完成");

        //以下通过listIterator方法顺序遍历list集合中的元素
        ListIterator listIterator = list.listIterator();
        /*while (listIterator.hasNext()){
            //此处不取出元素将会无限循环
            System.out.println("无限循环？");
        }*/
        //以下不会执行，正如testListIterator()方法中注释所说，之所以后面的逆序查看可以，
        //是因为在之前做了一个顺序遍历，修改了集合中的cursor变量
        while (listIterator.hasPrevious()){
            System.out.println("逆序查看结果！");
        }
        while (listIterator.hasNext()){
            Object obj = listIterator.next();
            printnb(obj);
            if("3".equals(obj.toString())){
                print();
                //顺序遍历元素的时候nextIndex方法会返回当前元素的前一个元素的下标
                //而previousIndex方法只会返回当前元素的下标
                index0 = listIterator.nextIndex();
                index1 = listIterator.previousIndex();
                print("元素3的下一个元素下标：" + index0);
                print("元素3的前一个元素下标：" + index1);

                //修改元素3为s
                listIterator.set("s");
            }

            //移除元素6
            if("6".equals(obj.toString())){
                listIterator.remove();
            }
        }
        print();
        print("ListIterator 顺序方式遍历完成");
        print("元素3的下一个元素：" + list.get(index0));
        print("元素3的前一个元素：" + list.get(index1));
        //插入元素
        listIterator.add("a");
        print("成功添加元素 a");

        while (listIterator.hasPrevious()){
            Object obj = listIterator.previous();
            printnb(obj);
            if("3".equals(obj.toString())){
                print();
                index0 = listIterator.nextIndex();
                //逆序遍历元素的时候previousIndex方法会返回当前元素的前一个元素的下标
                //而nextIndex方法只会返回当前元素的下标
                index1 = listIterator.previousIndex();
                print("元素3的下一个元素下标：" + index0);
                print("元素3的前一个元素下标：" + index1);
            }
        }
        print();
        print("ListIterator 逆序方式遍历完成");
        print("元素3的下一个元素：" + list.get(index0));
        print("元素3的前一个元素：" + list.get(index1));

        while (listIterator.hasNext()){
            printnb(listIterator.next());
        }
        print();

        //查看原list中的元素是否也被修改
        for (Object obj : list
             ) {
            printnb(obj);
        }
        print();
        //测试证明修改迭代器中的元素是会修改原容器中的元素
        //ListIterator在ArrayList中的实现为内部类方式，与ArrayList公用elementData属性，
        //所有对迭代器中的元素的操作都是在操作elementData元素，因此原容器中的元素也会同时更改

        //以下测试从指定位置(包含指定下标元素)返回ListIterator对象
        ListIterator listIterator2 = list.listIterator(3);
        while (listIterator2.hasNext()){
            printnb(listIterator2.next());
        }
        testListIterator();
    }


    public static void testListIterator(){
        print();
        List list = new ArrayList();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        //listIterator方法默认游标为0，如需逆序查看元素，则需要指定从逆序的那个位置开始
        //调用listIterator方法，实际创建启内部类对象，如果不指定从哪个位置开始逆序遍历则默认为0
        // public boolean hasPrevious() { return cursor != 0; }
        ListIterator listIter = list.listIterator(list.size());
        while (listIter.hasPrevious()){
            printnb(listIter.previous());
        }
    }
}
