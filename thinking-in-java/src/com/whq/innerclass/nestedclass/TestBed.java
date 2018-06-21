package com.whq.innerclass.nestedclass;

import static com.whq.util.Print.print;

/**
 * @author: wanghuanqing
 * @date: Create in 2018/6/19 14:13
 * @desc:
 */
public class TestBed {
    public void f(){
        print(getClass().getSimpleName());
    }

    public static class Tester{
        //嵌套类中不能通过外围类+.this获取外围类对象引用
        //public void b(){TestBed.this.f();}
        public static void main(String[] args) {
            TestBed testBed = new TestBed();
            testBed.f();
        }
    }
}
