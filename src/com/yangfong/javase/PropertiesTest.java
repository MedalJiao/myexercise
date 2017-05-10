package com.yangfong.javase;

import org.junit.Test;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by Bruce.Jiao on 2017/4/25.
 * 1、测试Properties的使用
 * 2、配置文件路径：
 * 绝对路径---一个文件的完整路径，一般带有盘符。有局限性，例如根据windows的盘符路径在linux中不存在
 * 相对路径---相对于当前程序所在的路径。当前路径就是运行java命令的时候，控制台所在的路径。
 * 类文件路径---使用了classpath的路径找对应的资源文件。需要使用类文件路径，首先要获得一个class对象。
 * web服务器路径---
 */
public class PropertiesTest {

    @Test
    public void test() {
        try {
            Properties properties = new Properties();
            //此处使用相对路径，以项目myexercise为基准
            properties.load(new FileReader("db.properties"));
            System.out.println("当前路径为："+new File(".").getAbsolutePath());
            System.out.println("用户名："+properties.getProperty("name")+"；密码："+properties.getProperty("password"));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        //此处使用类文件路径，“/”代表了classpath路径
        Properties properties = new Properties();
        Class clazz = PropertiesTest.class;
        InputStream inputStream = clazz.getResourceAsStream("/db.properties");
        try {
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("2、当前路径为："+new File(".").getAbsolutePath());
        System.out.println("2、用户名："+properties.getProperty("name")+"；密码："+properties.getProperty("password"));
    }
}
