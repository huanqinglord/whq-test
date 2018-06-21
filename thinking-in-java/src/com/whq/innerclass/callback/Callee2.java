package com.whq.innerclass.callback;

import static com.whq.util.Print.print;

/**
 * @author: wanghuanqing
 * @date: Create in 2018/6/19 15:34
 * @desc: 此类要求既要继承MyIncrement类，并且需要实现Incrementable接口
 */
public class Callee2 extends MyIncrement{
    private int i;
    @Override
    public void increment() {
        super.increment();
        i++;
        print(i);
    }

    public void b(){
        print(getClass().getSimpleName());
    }

    //重写的方法名与接口Incrementable中的方法名相同，此处必须用内部类实现
    private class Closure implements Incrementable{
        @Override
        public void increment() {
            //此方法调用外围类的方法increment
            Callee2.this.increment();
            //如果方法名不同，可以直接调用
            b();
        }
    }

    public Closure getClosure(){
        //因为是私有的内部类，因此只能通过外围类对象引用调用方法创建Closure对象引用
        return new Closure();
    }
}
