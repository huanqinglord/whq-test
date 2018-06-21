package com.whq.innerclass;

/**
 * @author: wanghuanqing
 * @date: Create in 2018/6/20 11:27
 * @desc:
 */
public class SchoolMate1 extends Friends.FriendSter1 {
    public static void main(String[] args) {
        //如果继承的是嵌套类（public static）则无需初始化外围类，因为嵌套类与外围类没有联系
        //继承会自动调用嵌套类的构造函数
        SchoolMate1 schoolMate1 = new SchoolMate1();
        schoolMate1.f();
    }
}
