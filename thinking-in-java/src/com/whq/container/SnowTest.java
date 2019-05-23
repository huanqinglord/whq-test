package com.whq.container;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

/**
 * @author: wanghuanqing
 * @date: Create in 2018/6/22 9:00
 * @desc:
 */
public class SnowTest<T> {
    public static void main(String[] args) {
        List<Snow> snows = Arrays.asList(
                new Crusty(), new Slush(), new Powder()
        );
        //以下注释掉的部分，其中Light只能向上转型为Powder，无法再向上转型为Snow
        //为何不能再向上转型？

        /*List<Snow> snows1 = Arrays.asList(
                new Light(), new Heavy()
        );*/

        //泛型，显式参数类型说明
        List<Snow> list2 = Arrays.<Snow>asList(
                new Light(), new Heavy(), new Crusty()
        );
        //以下测试显式参数类型说明
        SnowTest snowTest = new SnowTest();
    }
}
