package com.whq.innerclass.anonymous;

import static com.whq.util.Print.print;

/**
 * @author: wanghuanqing
 * @date: Create in 2018/6/15 14:58
 * @desc: 匿名内部类参数初始化，匿名内部类无法定义命名构造器，因为匿名内部类没有名字
 */
public class Parcel9 {
    //此处参数为何要定义为final？
    //如果定义一个匿名内部类，并且希望它使用一个在其外部定义的对象
    //如果参数在匿名内部类中被使用，则要求必须是final的
    public Destination destination(final String dest){
        return new Destination() {
            private String label = dest;
            @Override
            //此处编写自己对接口的实现细节
            public String readLabel() {
                return this.label;
            }
        };
    }

    public static void main(String[] args) {
        print(new Parcel9().destination("Parcel9 WHQ anonymous inner class test!").readLabel());
    }
}
