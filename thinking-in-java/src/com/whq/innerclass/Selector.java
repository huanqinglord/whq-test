package com.whq.innerclass;

/**
 * @author: wanghuanqing
 * @date: Create in 2018/6/14 14:01
 * @desc: 选择器接口
 */
public interface Selector {
    boolean end();
    Object current();
    void next();
}
