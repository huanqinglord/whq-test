package com.whq.container.list;

import java.util.LinkedList;
import java.util.Stack;

import static com.whq.util.Print.*;

/**
 * @author: wanghuanqing
 * @date: Create in 2018/6/26 15:21
 * @desc: Stack extends Vector
 */
public class TestStack {
    private class StackWhq<T>{
        private LinkedList<T> storage = new LinkedList<T>();
        public void push(T t){storage.addFirst(t);}
        public T peek(){return storage.getFirst();}
        public T pop(){return storage.poll();}
        public boolean empty(){return storage.isEmpty();}
        public String toString(){return storage.toString();}
    }

    public static void main(String[] args) {
        TestStack testStack = new TestStack();
        TestStack.StackWhq<Integer> stackWhq = testStack.new StackWhq<Integer>();
        //添加元素，顺序为0~9
        for (int i = 0; i < 10; i++) {
            stackWhq.push(i);
        }
        print();
        //查看元素顺序
        for (Integer i: stackWhq.storage
             ) {
            printnb(i);
        }
        print();
        //栈的属性为“后进先出”
        print(stackWhq.peek());
        //获取容器中的元素的顺序为9~0
        while (!stackWhq.storage.isEmpty()){
            //poll方法会移除元素
            printnb(stackWhq.pop());
        }
        print();
        //通过poll方法移除第一个元素后查看集合元素
        if(stackWhq.storage.size() == 0){
            print("NoSuchElements in stackWhq!");
        }else {
            for (Integer i: stackWhq.storage
                    ) {
                printnb(i);
            }
        }

    }
}
