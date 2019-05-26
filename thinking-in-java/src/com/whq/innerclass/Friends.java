package com.whq.innerclass;

import static com.whq.util.Print.print;

/**
 * @author: wanghuanqing
 * @date: Create in 2018/6/19 11:15
 * @desc: 内部类中访问外围类
 */
public class Friends {
    private String name;
    private String tel;

    public String getTel(){return this.tel;}
    public String getName(){
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public class FriendSter{
        private String friendSterName;

        FriendSter(){}
        FriendSter(String tel){Friends.this.tel = tel;}

        public Friends getOutClass(){
            return Friends.this;
        }

        public void setName(String name, String friendSterName){
            Friends.this.name = name;
            this.friendSterName = friendSterName;
        }

        public void f(){
            print("method f()!");
        }
    }

    public static class FriendSter1{
        public FriendSter1(){
            print("FriendSter1 class!");
        }
        public void f(){
            print(getClass().getSuperclass().getSimpleName() + getClass().getSuperclass().getMethods()[0]);
        }
    }

    public static void main(String[] args) {
        Friends friends = new Friends();

        Friends.FriendSter friendSter = friends.new FriendSter();
        //内部类访问外围类属性并赋值
        friendSter.setName("WHQ", "home");
        //内部类访问自身对象
        print(friendSter.friendSterName);
        //内部类返回外围类对象引用，外围类对象引用访问其自身属性
        print(friendSter.getOutClass().name);
        //外围类访问自身属性
        print(friends.name);
    }
}
