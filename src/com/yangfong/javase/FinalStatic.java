package com.yangfong.javase;

/**
 * Created by dell on 2017-05-22.
 */
public class FinalStatic {

    static final int CONSTANT = 8;
    static int staticval = 8;//静态变量，
    final int finalval;//final变量，必须在定义时或者空构造中进行初始化，否则编译报错：Variable "finalval" meight not have been initialized

    public FinalStatic() {
        finalval = 8;
    }

    public FinalStatic(int val) {
        finalval = 8;//在此处初始化finalval，并不能
    }

    public static void main(String[] args){
        FinalStatic fs = new FinalStatic();
        staticval = 9;
//        fs.finalval = 9;//编译报错：can not asign a value to final variable "finalval"
        System.out.println("尝试第二次赋值，静态变量值为staticval = " + staticval);//staticval = 9
        add2();
        System.out.println("经过五次叠加，静态变量值为staticval = " + staticval);//staticval = 11（9 + 2）
    }

    public static void add2() {
        staticval += 2;
    }
}
