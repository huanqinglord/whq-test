package com.whq.innerclass;

import static com.whq.util.Print.print;

/**
 * @author: wanghuanqing
 * @date: Create in 2018/6/19 13:55
 * @desc: 接口中也可以放置内部类代码，同时接口中的内部类默认为嵌套类（意味着是public static的，与外围类没有联系）
 */
public interface InterfaceInnerClass {
    void f();
    class Test implements InterfaceInnerClass{
        @Override
        public void f() {
            print(getClass().getInterfaces()[0].getSimpleName() + " " + getClass().getSimpleName());
        }

        public static void main(String[] args) {
            new Test().f();
        }
    }
}
