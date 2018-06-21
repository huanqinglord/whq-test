package com.whq.innerclass.anonymous;

import static com.whq.util.Print.print;

/**
 * @author: wanghuanqing
 * @date: Create in 2018/6/15 10:19
 * @desc:
 */
public class Parcel6 {
    public String internalTracking(boolean b){
        if(b){
            class TrackingSlip{
                private String id;
                TrackingSlip(String id){this.id = id;}

                String getSlip(){return id;}
            }

            TrackingSlip trackingSlip = new TrackingSlip("WHQ anonymous inner class test!");

            return trackingSlip.getSlip();
        }
        //因为内部类 TrackingSlip作用域为if内，以下不可用
        //TrackingSlip trackingSlip = new TrackingSlip("sd");
        return Boolean.toString(b);
    }

    public static void main(String[] args) {
        Parcel6 parcel6 = new Parcel6();

        print(parcel6.internalTracking(true));
        print(parcel6.internalTracking(false));
    }
}
