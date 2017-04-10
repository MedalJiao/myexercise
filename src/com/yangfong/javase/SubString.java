package com.yangfong.javase;

import org.junit.Test;

/**
 * Created by Bruce.Jiao on 17-4-7.
 */
public class SubString {

    @Test
    public void test() {
        String str = "abcdef";
        System.out.println(str.substring(0,3));//abc,前闭后开
    }
}
