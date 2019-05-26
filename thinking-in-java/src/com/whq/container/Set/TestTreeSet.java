package com.whq.container.Set;

import com.whq.container.Powder;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import static com.whq.util.Print.print;


/**
 * @author: wanghuanqing
 * @date: Create in 2018/6/27 8:09
 * @desc:
 */
public class TestTreeSet {
    //创建匿名内部类做为测试实体类
    private class Custom{
        private String name;
        private int age;

        public Custom() {
        }

        public Custom(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
    //编写比较方式
    //以下比较方式为数字比较。更复杂的比较方式只要保证compare方法的返回值为-1，0，1即可
    private static class ComparatorWhq implements Comparator<Custom>{
        @Override
        public int compare(Custom o1, Custom o2) {
            return o2.getAge() - o1.getAge();
        }
    }
    public static void main(String[] args) {
        Set<Custom> stringSet = new TreeSet<>(new ComparatorWhq());
        //以下以匿名内部类实现
        /*Set<Custom> stringSet = new TreeSet<>(new Comparator<Custom>() {
            @Override
            public int compare(Custom o1, Custom o2) {
                return o2.getAge() - o1.getAge();
            }
        });*/
        //以下以java8lambda表达式实现
        //Set<Custom> stringSet = new TreeSet<>((Custom o1 , Custom o2) -> o2.getAge() - o1.getAge());

        TestTreeSet testTreeSet = new TestTreeSet();
        Custom c1 = testTreeSet.new Custom("a" , 25);
        Custom c2 = testTreeSet.new Custom("b" , 10);
        Custom c3 = testTreeSet.new Custom("c" , 24);

        stringSet.add(c1);
        stringSet.add(c2);
        stringSet.add(c3);

        Iterator<Custom> customIterator = stringSet.iterator();
        while (customIterator.hasNext()){
            Custom custom = customIterator.next();
            print(custom.getAge() + ":" + custom.getName());
        }
     }
}
