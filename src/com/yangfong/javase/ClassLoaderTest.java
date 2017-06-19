package com.yangfong.javase;

/**
 * JVM在运行时会产生三个Class Loader：根装载器、ExtClassLoader、AppClassLoader
 * 根装载器不是Class Loader的子类，它使用C++编写，在java中看不到它，它负责装在JRE的核心类库；
 * ExtClassLoader、AppClassLoader都是Class Loader的子类，
 * ExtClassLoader负责装载JRE扩展目录ext中的jar包；
 * AppClassLoader负责装载Class path 路径下的类包。
 * 根装载器是ExtClassLoader的父类装载器，ExtClassLoader是ppClassLoader的父类装载器
 * Created by Bruce.Jiao on 2017/5/16.
 */
public class ClassLoaderTest {

    public static void main(String[] args){
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        System.out.println("current:"+loader);
        System.out.println("parent:"+loader.getParent());
        System.out.println("grandparent:"+loader.getParent().getParent());
    }
}
