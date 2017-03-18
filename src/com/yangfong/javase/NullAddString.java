package com.yangfong.javase;

import org.junit.Test;

/**
 * Created by Bruce.Jiao on 17-3-14.
 */
public class NullAddString {

    @Test
    public void test() {
        String s1 = getNullStr();
        String s2 = "aa";
        String s3 = "123";
        System.out.println(s1 + s2 + s3);//nullaa123
    }

    private String getNullStr() {
        return null;
    }
}
