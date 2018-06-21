package com.whq.innerclass.callback;

/**
 * @author: wanghuanqing
 * @date: Create in 2018/6/19 15:40
 * @desc:
 */
public class Caller {
    private Incrementable callback;
    Caller(Incrementable incrementable){
        this.callback = incrementable;
    }

    void go(){
        callback.increment();
    }
}
