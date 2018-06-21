package com.whq.innerclass;

import static com.whq.util.Print.print;

/**
 * @author: wanghuanqing
 * @date: Create in 2018/6/20 9:16
 * @desc: 继承内部类
 */
public class SchoolMate extends Friends.FriendSter {
    //内部类和外围类有关联，它可以访问外围类的所有成员。
    //在使用继承的时候会先初始化父类成员变量，然后调用父类初始化方法
    SchoolMate(Friends friends){
        //继承内部类需要明确调用外围类初始化方法
        friends.super();
    }

    SchoolMate(Friends friends, String tel){
        //此处super方法指的是内部类中的构造方法
        friends.super(tel);
    }

    //继承自内部类后，无法自动调用父类的构造方法，必须手动调用，进行父类的初始化
    SchoolMate(){
        new Friends().super();
        //不能使用如下方式进行初始化
        //以下方式只是新建了一个内部类FriendSter的对象引用，无法将基类与导出类相关联
        new Friends().new FriendSter();
    }

    public static void main(String[] args) {
        //此行代码对内部类的外围类进行了初始化并创建外围类对象引用
        Friends friends = new Friends();

        //通过外围类对象引用调用其内部类的构造函数，完成父类（继承自内部类）的初始化
        SchoolMate schoolMate = new SchoolMate(friends);
        schoolMate.f();

        //内部类中初始化外围类相关变量
        SchoolMate schoolMate1 = new SchoolMate(friends, "15645954");
        schoolMate1.f();
        print(schoolMate1.getOutClass().getTel());

        SchoolMate schoolMate2 = new SchoolMate();
        schoolMate2.f();
    }
}
