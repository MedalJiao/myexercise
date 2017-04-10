package com.yangfong.javase.extendtest;

import org.junit.Test;

/**
 * Created by Bruce.Jiao on 17-4-7.
 */
public class RunMe {

    @Test
    public void test(){
        Apple apple = new Apple();
        Banana banana = new Banana();
        apple.printSize();
        banana.printSize();
    }
}
