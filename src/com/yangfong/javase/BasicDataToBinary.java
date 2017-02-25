package com.yangfong.javase;

import org.junit.Test;

import java.util.Arrays;

/**
 * 8中基本数据类型的二进制表达式
 * Created by Bruce.Jiao on 17-2-23.
 */
public class BasicDataToBinary {

    @Test
    public void runing () {
        getTheBinaryValue(168);
        getTheBinaryValue(168l);
        getTheBinaryValue(0.75f);
        getTheBinaryValue(0.75d);
    }

    public static byte[] intToByte4(int sum) {
        byte[] arr = new byte[4];
        arr[0] = (byte) (sum >> 24);
        arr[1] = (byte) (sum >> 16);
        arr[2] = (byte) (sum >> 8);
        arr[3] = (byte) (sum & 0xff);
        return arr;
    }
    
    private void getTheBinaryValue (Object value) {
        short s;
        int i = 0;
        long l = 0;
        float f = 0.0f;
        double d = 0.0;
        if (value instanceof Short) {
            s = (short) value;
        } else if (value instanceof Integer) {
            i = (int) value;
            String s1 = Integer.toBinaryString(i);
            System.out.println("int数据168的二进制："+s1);//10101000 = 8+32+128
        } else if (value instanceof Long) {
            l = (long) value;
            String s2 = Long.toBinaryString(l);
            System.out.println("long数据168的二进制："+s2);//10101000
        } else if (value instanceof Float) {
            f = (float) value;
            int s3 = Float.floatToIntBits(f);
            System.out.println("float数据0.75的二进制："+Integer.toBinaryString(s3));//111111010000000000000000000000
        } else if (value instanceof Double) {
            d = (double) value;
            long s4 = Double.doubleToLongBits(d);
            System.out.println("double数据0.75的二进制："+Long.toBinaryString(s4));//11111111101000000000000000000000000000000000000000000000000000
        }
    }
}
