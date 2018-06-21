package com.whq.innerclass.anonymous;

import static com.whq.util.Print.print;

/**
 * @author: wanghuanqing
 * @date: Create in 2018/6/19 9:11
 * @desc: 内部类使用Base作为基类
 */
public class AnonymousConstructor {
    //此处匿名内部类中未使用参数i因此参数i不必定义为final
    public Base getBase(int i){
        return new Base(i) {
            @Override
            public void f() {
                print("AnonymousConstructor class !");
            }
        };
    }


    public static void main(String[] args) {
        AnonymousConstructor anonymousConstructor = new AnonymousConstructor();

        anonymousConstructor.getBase(10).f();
    }
}
