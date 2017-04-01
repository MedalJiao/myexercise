package com.yangfong.javase;

import org.junit.Test;

/**
 * Created by Bruce.Jiao on 17-3-30.
 */
public class IfElseEquals {

    private static final int MAX = 100;
    private static final int MIN = 1;

    @Test
    public void test() {
        print(101);
    }

    private void print(int i) {
        if (i <= MAX) {
            System.out.println("i <= Max");
        } else if (i < MAX) {//该分支永远不会到
            System.out.println("i < Max");
        } else {
            System.out.println("i > Max");
        }
    }
}
