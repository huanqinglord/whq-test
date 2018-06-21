package com.whq.innerclass.nestedclass;

import com.whq.innerclass.anonymous.Contents;
import com.whq.innerclass.anonymous.Destination;

/**
 * @author: wanghuanqing
 * @date: Create in 2018/6/19 11:54
 * @desc: 嵌套类，如果不希望内部类与外围类之间有联系，可以将内部类定义为static，称为嵌套类
 */
public class Parcel11 {

    public static class ParcelContents implements Contents{
        @Override
        public int value() {
            return 0;
        }
    }

    protected static class ParcelDestination implements Destination{
        private String label;
        public ParcelDestination(String label){
            this.label = label;
        }
        @Override
        public String readLabel() {
            return label;
        }

        //嵌套类（nested class）可以存在其他静态元素
        public static void f(){}
        static int x = 10;
        static class AnotherLevel{
            public static void f(){}
            static int x = 10;
        }
    }

    public static Destination destination(String s){
        return new ParcelDestination(s);
    }

    public static Contents contents(){
        return new ParcelContents();
    }

    public static void main(String[] args) {
        Contents contents = contents();
        Destination destination = destination("WHQ");
    }
}
