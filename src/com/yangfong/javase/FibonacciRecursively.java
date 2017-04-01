package com.yangfong.javase;

import java.util.Arrays;

import org.junit.Test;

/**
 * Created by Bruce.Jiao on 17-3-24.
 */
public class FibonacciRecursively {

    /**
     * 普通递归获取元素
     * @param i
     * @return
     */
    public int getElement (int i) {
        return i < 3 ? 1:getElement(i-1)+getElement(i-2);
    }

    /**
     * 尾递归获取元素
     * @return
     */
    public int getElementRecursively (int i, int acc1, int acc2) {
        if (i == 0) {
            return acc1;
        }
        return getElementRecursively(i-1, acc2, acc1 + acc2);
    }

    public int[] get(int n){
        if(n < 1) {
            return null;
        }
        int[] data = new int[n];
        for (int i = 1; i <= n; i++) {
            data[i-1] = getElement(i);
        }
        return data;
    }

    public int[] get2(int n){
        if(n < 1) {
            return null;
        }
        int[] data = new int[n];
        for (int i = 1; i <= n; i++) {
            data[i-1] = getElementRecursively(i, 0, 1);
        }
        return data;
    }

    @Test
    public void test01 () {
        FibonacciRecursively fl = new FibonacciRecursively();
        int[] ints = fl.get(10);
        System.out.println(Arrays.toString(ints));
    }

    @Test
    public void test02 () {
        FibonacciRecursively fl = new FibonacciRecursively();
        int[] ints = fl.get2(10);
        System.out.println(Arrays.toString(ints));
    }
}
