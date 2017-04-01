package com.yangfong.javase;

/**
 * Created by Bruce.Jiao on 17-3-23.
 */
public enum  EnumDemo {

        //1,枚举实例写在构造函数之前，实例后边写";"
        SPRING(1, "spring"), SUMMER(), AUTOMN(3, "automn"), WINTER(4, "winter");

        private int id;
        private String name;

        private EnumDemo() {}

        /**
         * 2,枚举类的构造函数必须是private的，不让外界通过new来创建新的枚举对象
         * @param id
         * @param name
         */
        private EnumDemo(int id, String name) {
            this.id = id;
            this.name = name;
        }

}
