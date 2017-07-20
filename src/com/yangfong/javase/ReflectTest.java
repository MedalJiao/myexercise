package com.yangfong.javase;

import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class ReflectTest {

    @Test
    public void testReflect() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        //获取UserInfo类
        Class clazz = Class.forName("com.yangfong.javase.UserInfo");
        //创建Class对象所所表示的类的一个实例，
        //newInstance默认调用了UserInfo的空构造
        Object o = clazz.newInstance();
        //获取属性
        Field[] fields = clazz.getDeclaredFields();
        //定义可变长的字符串，用来存储属性
        StringBuffer sb = new StringBuffer();
        //通过追加的方法，将每个属性拼接到次字符串中
        sb.append(Modifier.toString(clazz.getModifiers())+"class"+clazz.getSimpleName()+"{\n");
        //里面的每一个属性
        for(Field field : fields){
            //空格
            sb.append("\t");
            //获得属性的修饰符，例如public,static等等
            sb.append(Modifier.toString(field.getModifiers())+" ");
            //属性的类型的名字
            sb.append(field.getType().getSimpleName()+" ");
            //属性的名字+回车
            sb.append(field.getName()+";\n");
        }
        sb.append("}");
        System.out.println(sb);
    }
}
