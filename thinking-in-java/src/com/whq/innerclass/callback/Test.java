package com.whq.innerclass.callback;

/**
 * @author: wanghuanqing
 * @date: Create in 2018/6/19 15:41
 * @desc:
 */
public class Test {
    public static void main(String[] args) {
        Callee1 callee1 = new Callee1();
        Callee2 callee2 = new Callee2();
        //callee2继承自MyIncrement类，向上转型可直接调用f方法
        MyIncrement.f(callee2);

        Caller caller1 = new Caller(callee1);
        Caller caller2 = new Caller(callee2.getClosure());

        caller1.go();
        caller1.go();
        caller2.go();
        caller2.go();
    }
}
