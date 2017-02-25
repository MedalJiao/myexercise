package com.yangfong.javase;

/**
 * 验证对null进行强制类型转换
 * 查看是否会抛空指针，如果没有异常，查看结果
 * Created by Bruce.Jiao on 15-5-23.
 */
public class TypeChangeInNull {
    public static void main (String[] args) {
        System.out.println("将null强制转换为String类型，结果为："+(String) null);//结果为null
        System.out.println("将null强制转换为自定义的Person类型，结果为："+(Person) null);//结果为null
    }

    private class Person {
        private String name;
        private int age;
        private Person(){}
        private Person(String name, int age){
            this.name = name;
            this.age = age;
        }
    }
}
