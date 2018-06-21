package com.whq.innerclass.anonymous;

import static com.whq.util.Print.print;

/**
 * @author: wanghuanqing
 * @date: Create in 2018/6/15 14:25
 * @desc: 匿名内部类,内部类构造器为无参构造器
 */
public class Parcel7 {
    public Contents contents(){
        return new Contents() {
            private int i;
            @Override
            public int value() {
                return i;
            }
        };
    }

    public static void main(String[] args) {
        Parcel7 parcel7 = new Parcel7();
        //int 默认值0
        print(parcel7.contents().value());
    }
}

//Parcel7类的另一种写法
//内部类定义到了方法域中，可以定义在类域中
class Parcel7b{
    public Contents contents(){
        class BContents implements Contents{
            private int i = 11;
            @Override
            public int value() {
                return i;
            }
        }

        return new BContents();
    }

    public static void main(String[] args) {
        Parcel7b parcel7b = new Parcel7b();
        print(parcel7b.contents().value());
    }
}
