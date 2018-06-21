package com.whq.innerclass.anonymous;

import static com.whq.util.Print.print;

/**
 * @author: wanghuanqing
 * @date: Create in 2018/6/19 9:08
 * @desc: 匿名内部类的基类
 */
public abstract class Base {
    public Base(int i){
        print("abstract constructor!" + i);
    }

    public abstract void f();
}
