package com.yangfong.javase;

import org.junit.Test;

/**
 * Created by Bruce.Jiao on 17-3-22.
 */
public class StringFirm {

    @Test
    public void testEmptyString() {
        String str = "      ";
        System.out.println("str.length()="+str.length()+"; str.trim().length()="+str.trim().length());//str.length()=6; str.trim().length()=0
    }
}
