package com.whq.innerclass.callback;

import static com.whq.util.Print.print;

/**
 * @author: wanghuanqing
 * @date: Create in 2018/6/19 15:32
 * @desc: 与接口Incrementable具有相同的接口方法
  */
public class MyIncrement {
    public void increment(){
        print("other operation!");
    }

    static void f(MyIncrement myIncrement){myIncrement.increment();}
}
