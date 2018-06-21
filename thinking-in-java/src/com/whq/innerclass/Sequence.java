package com.whq.innerclass;

import static com.whq.util.Print.print;

/**
 * @author: wanghuanqing
 * @date: Create in 2018/6/14 14:02
 * @desc:
 */
public class Sequence {
    private Object[] items;
    private int next = 0;

    public Sequence(int size){
        this.items = new Object[size];
    }

    public void add(Object x){
        if (next < items.length){
            items[next++] = x;
        }
    }
    //内部类，正序遍历元素
   public class SequenceSelector implements Selector{
        private int i = 0;
        @Override
        public boolean end() {
            return i == items.length;
        }

        @Override
        public Object current() {
            return items[i];
        }

        @Override
        public void next() {
            if(i < items.length){
                i++;
            }
        }
    }

    public class ReverseSelector implements Selector{
        private int i = 0;
        @Override
        public boolean end() {
            return i == items.length;
        }

        @Override
        public Object current() {
            return items[items.length - i -1];
        }

        @Override
        public void next() {
            if(i < items.length){
                i++;
            }
        }
    }

    public Selector getSelector(){
        return new SequenceSelector();
    }

    public static void main(String[] args) {
        Sequence sequence = new Sequence(10);
        for (int i = 0; i < 10; i++) {
            sequence.add(i);
        }
        //以下正序遍历集合
        //Selector s = sequence.getSelector();
        Selector s = sequence.new SequenceSelector();
        //Sequence.SequenceSelector sss = sequence.new SequenceSelector();
        while (!s.end()){
            print(s.current());
            s.next();
        }
        print("正序遍历结束！");
        //以下逆序遍历集合
        Selector reverseSelector = sequence.new ReverseSelector();
        while (!reverseSelector.end()){
            print(reverseSelector.current());
            reverseSelector.next();
        }
        print("逆序遍历结束！");
    }
}

