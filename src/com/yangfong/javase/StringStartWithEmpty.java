package com.yangfong.javase;

import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Bruce.Jiao on 17-4-11.
 */
public class StringStartWithEmpty {

    @Test
    public void test() {
        String st = StringUtils.EMPTY;
        String str = "abc";
        Assert.assertEquals(true, str.startsWith(st));
    }
}
