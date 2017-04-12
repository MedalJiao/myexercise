package com.yangfong.javase;

import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Bruce.Jiao on 17-4-11.
 */
public class CommonLang3 {

    @Test
    public void testStringUtils() {
        String str1 = null;
        String str2 = "     ";
        String str3 = "  1   ";
        Assert.assertEquals(true, StringUtils.isBlank(str1));
        Assert.assertEquals(true, StringUtils.isBlank(str2));
        Assert.assertEquals(false, StringUtils.isBlank(str3));
        Assert.assertEquals(true, StringUtils.isEmpty(str1));
        Assert.assertEquals(false, StringUtils.isEmpty(str2));
        Assert.assertEquals(false, StringUtils.isEmpty(str3));
    }
}
