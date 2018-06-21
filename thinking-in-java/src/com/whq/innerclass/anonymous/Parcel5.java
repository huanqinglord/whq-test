package com.whq.innerclass.anonymous;

import static com.whq.util.Print.print;

/**
 * @author: wanghuanqing
 * @date: Create in 2018/6/15 9:51
 * @desc: 局部内部类：在方法作用域内（而非类作用域）创建一个完整的类
 */
public class Parcel5 {
    public static Destination destination(String s) {
        class PDestination implements Destination {
            private String label;
            PDestination(String label) { this.label = label;}
            @Override
            public String readLabel() {return this.label;}
            public String toString() {return this.label;}
        }
        return new PDestination(s);
    }

    public static void main(String[] args) {
        print(destination("Anonymous inner class test!"));
    }
}
