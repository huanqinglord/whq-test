package com.whq.container.list;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author: wanghuanqing
 * @date: Create in 2019/6/16 23:01
 * @desc: Queue 消息队列，Linkedlist实现了Queue接口，先进先出
 *        LinkedList对象存储数据主要依靠Node<E>内部类，
 *        此类中拥有三个属性：
 *          E item;         当前元素
            Node<E> next;   下一个元素
            Node<E> prev;   上一个元素
            相比与ArrayList，插入删除元素方便就因为新增或者删除一个元素只需要改变一个Node对象而已
            而ArrayList需要改变一个数据，必要时还需要对数组进行扩容
 */
public class TestQueue {
    public static void getQueueMessage(Queue q){
        /*
        *     public E peek() {
                    final Node<E> f = first;
                    return (f == null) ? null : f.item;
                }
        * peek 防范判断第一个元素是否存在
        * */
        while (q.peek() != null){
            System.out.print(q.remove());
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Queue<Integer> integerQueue = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            //offer方法实际调用的依然是add方法
            integerQueue.offer(i);
        }

        Queue<Character> queueChar = new LinkedList<>();
        for (Character chars : "whq".toCharArray()
             ) {
            queueChar.offer(chars);
        }

        getQueueMessage(integerQueue);
        getQueueMessage(queueChar);
    }
}
