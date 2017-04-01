package com.yangfong.javase;

import org.junit.Test;

/**
 * 验证switch是否支持String
 * 结论：jdk1.8中switch支持String
 */
public class SwitchString {

    @Test
    public void test() {
        String s1 = "aaaaaaaa";
        String s2 = "bbbbbbbb";
        String s3 = "cccccccc";
        this.switchs(s2);
    }

    private static void switchs(String s) {
        switch (s) {
        case "aaaaaaaa":
            System.out.println("第一个字符串");
            break;
        case "bbbbbbbb":
            System.out.println("第二个字符串");
            break;
        case "cccccccc":
            System.out.println("第三个字符串");
            break;
        }
    }
}
