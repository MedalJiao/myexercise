package com.yangfong.javase;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by dell on 2017-07-13.
 */
public class ListUtilTest {

    List<UserInfo> list;

    /*
    得到一个伪随机字符串
     */
    public static String getRandomString(int length) {
        String base = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random = new Random();
        StringBuffer sbr = new StringBuffer();
        for (int i = 0; i < length; i++) {
            int number = random.nextInt(base.length());
            sbr.append(base.charAt(number));
        }
        return sbr.toString();
    }

    @Before
    public void initList() {
        list = new ArrayList<>();
        UserInfo ui;
        for(int i = 1; i < 29; i++) {
            ui = new UserInfo();
            ui.setLoginName(i + getRandomString(5));
            ui.setPassword(getRandomString(8));
            list.add(ui);
        }
    }

    @Test
    public void testSplitList() {
        List<List<UserInfo>> lists = ListUtil.splitList(list, 10);
        Assert.assertEquals(3, lists.size());
        Assert.assertTrue(lists.get(0).size() == lists.get(1).size());
        Assert.assertEquals(8, lists.get(2).size());
        Assert.assertEquals(28, lists.get(0).size() + lists.get(1).size() + lists.get(2).size());
    }
}
