package com.whq.innerclass.callback;

import static com.whq.util.Print.print;

/**
 * @author: wanghuanqing
 * @date: Create in 2018/6/19 15:30
 * @desc: Incrementable 接口简单实现
 */
public class Callee1 implements Incrementable {
    private int i;
    @Override
    public void increment() {
        i++;
        print(i);
    }
}
