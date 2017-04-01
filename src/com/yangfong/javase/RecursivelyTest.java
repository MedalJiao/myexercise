package com.yangfong.javase;

import org.junit.Test;

/**
 * 比较递归和尾递归
 * java虚拟机栈是线程私有的，它的生命周期与线程相同。
 * 虚拟机栈描述的是java方法执行的内存模型：每个方法在执行的同时都会创建一个栈帧(Stack Frame)用于存储局部变量表、
 * 操作数栈、动态链接、方法出口等信息。
 * 每一个方法从调用直至执行完成的过程，就对应着一个栈帧在虚拟机栈中入栈到出栈的过程。
 * Created by Bruce.Jiao on 17-3-23.
 */
public class RecursivelyTest {

    @Test
    public void testRecursion() {
        long start = System.currentTimeMillis();
        int result = calculate(15);
        long end = System.currentTimeMillis();
        System.out.println("递归结果："+result+"; 花费时间："+(end-start));
    }

    @Test
    public void testTailRecursion() {
        long start = System.currentTimeMillis();
        int result = calculate(15, 1);
        long end = System.currentTimeMillis();
        System.out.println("尾递归结果："+result+"; 花费时间："+(end-start));
    }

    /**
     * 普通递归方法
     * 会开启多个函数栈帧，造成内存空间的浪费
     * @param n
     * @return
     */
    private int calculate(int n){
        if (n < 1) {
//            throw new MyException("");
        }
        if (n == 1) {
            return 1;
        }
        return n*calculate(n-1);
    }

    /**
     * 尾递归
     * 会服用栈帧，即一直是一个栈帧，节约内存
     * @param n
     * @param result 初始值需要是1
     * @return
     */
    private int calculate(int n, int result) {
        if (n < 0) {
//            throw new MyException("");
        }
        if (n == 0) {
            return result;
        }
        return calculate(n-1, n*result);
    }
}
