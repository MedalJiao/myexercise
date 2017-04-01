package com.yangfong.javase;

import org.junit.Test;

/**
 * 测试在自定义属性赋值为null时候，是否会报错
 */
public class SetNullToAttribute {

    @Test
    public void test(){
        UserInfo ui = new UserInfo();
        ui.setLoginName(null);
        ui.setPassword(null);
        System.out.println(ui.toString());//当前对象字段值为：loginName = null; password = null
        UserInfo ui2 = new UserInfo();
        ui2.setLoginName(ui.getLoginName());
        System.out.println(ui2.toString());//当前对象字段值为：loginName = null; password = null
    }
}
