package com.yangfong.javase;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Test;

import java.util.Random;

/**
 * 生产随机字符串
 * Created by dell on 2017-07-13.
 */
public class RandomString {

    @Test
    public void getRandomString() {
        //调用org.apache.commons.lang3.RandomStringUtils的API方法
        String s = RandomStringUtils.randomAlphanumeric(6);
        System.out.println(s);
    }

    @Test
    public void testMethod() {
//        System.out.println(Math.round(3.6f));//4
//        System.out.println(Math.round(3.3f));//3
        System.out.println(Math.round(3.5f));//4
        String randomString1 = getRandomString1(6);
        System.out.println("方法1：" + randomString1);
        String randomString2 = getRandomString2(6);
        System.out.println("方法2：" + randomString2);
    }

    public String getRandomString1(int length) {
        String base = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random = new Random();
        StringBuffer sbf = new StringBuffer();
        for(int i = 0;i < length; i++) {
            int number = random.nextInt(62);
            sbf.append(base.charAt(number));
        }
        return sbf.toString();
    }

    /**
     * ASCII表中：A(65) - Z(90),a(97) - z(122),0(48) - 9(57)
     * @param length
     * @return
     */
    public String getRandomString2(int length) {
        Random random=new Random();
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<length;i++){
            int number=random.nextInt(3);
            long result=0;
            switch(number){
                case 0:
                    //Math.random()系统随机选取大于等于0.0且小于1.0的伪随机double值
                    //Math.round()可以把一个数字四舍五入为最接近的整数
                    result=Math.round(Math.random()*25+65);//生成[65,90]之间的伪随机数
                    sb.append(String.valueOf((char)result));
                    break;
                case 1:
                    result=Math.round(Math.random()*25+97);//生成[97,122]之间的伪随机数
                    sb.append(String.valueOf((char)result));
                    break;
                case 2:
                    sb.append(String.valueOf(new Random().nextInt(10)));//生成[0,9]之间的伪随机数
                    break;
            }
        }
        return sb.toString();
    }
}
