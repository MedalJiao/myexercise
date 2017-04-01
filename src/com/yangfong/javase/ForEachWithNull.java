package com.yangfong.javase;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * 验证一个for循环中，会不会拿到null对象
 */
public class ForEachWithNull {

    @Test
    public void testNullElement(){
        UserInfo u1 = new UserInfo("aaa","123456");
        UserInfo u2 = new UserInfo("bbb","123456");
        UserInfo u3 = null;
        UserInfo u4 = new UserInfo("ccc","123456");
        List<UserInfo> list = new ArrayList<>();
        list.add(u1);
        list.add(u2);
        list.add(u3);
        list.add(u4);
        for(UserInfo u : list) {
            System.out.println(u.getLoginName() + " : " + u.getPassword());
        }
    }

    @Test
    public void testEmptyNullList() {
        List<UserInfo> list = new ArrayList<>();
        System.out.println("测试循环遍历空集合");
        for(UserInfo u : list) {//不会报错
            System.out.println(u.getLoginName() + " : " + u.getPassword());
        }
        List<UserInfo> list00 = null;
        System.out.println("测试循环遍历null");
        for(UserInfo u : list00) {//会抛java.lang.NullPointerException
            System.out.println(u.getLoginName() + " : " + u.getPassword());
        }
    }
}
