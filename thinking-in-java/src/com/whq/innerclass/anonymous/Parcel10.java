package com.whq.innerclass.anonymous;

import static com.whq.util.Print.print;

/**
 * @author: wanghuanqing
 * @date: Create in 2018/6/19 9:56
 * @desc: 匿名内部类初始化
 */
public class Parcel10 {
    public Destination destination(final String dest, final float f){
        return new Destination() {
            private String label = dest;

            private float aFloat;
            //以下部分代码是在实例初始化之后执行的
            {
                //此处先初始化aFloat变量，然后再使用它
                aFloat = f;
                if(f > 100){
                    print("Parcel10 class aFloat = " + aFloat);
                }
            }

            @Override
            public String readLabel() {
                return label;
            }
        };
    }

    public static void main(String[] args) {
        Parcel10 parcel10 = new Parcel10();
        parcel10.destination("whq", 101.213f);
    }
}
