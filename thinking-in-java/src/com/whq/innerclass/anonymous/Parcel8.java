package com.whq.innerclass.anonymous;

import static com.whq.util.Print.print;

/**
 * @author: wanghuanqing
 * @date: Create in 2018/6/15 14:38
 * @desc: 匿名内部类，构造器带参
 */
public class Parcel8 {
    public P8Contents contents(int x){
        return new P8Contents(x){
            //内部类返回对象引用向上转型，此处自定义方法如何调用？
            public int getSuperi(){
                return getI();
            }
        };
    }

    public static void main(String[] args) {
        Parcel8 parcel8 = new Parcel8();

        print(parcel8.contents(1000).getI());
    }
}
