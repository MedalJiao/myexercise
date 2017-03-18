package com.yangfong.javase;

import java.math.BigDecimal;

/**
 * 验证浮点数
 * Created by Bruce.Jiao on 16-2-23.
 */
public class FloatDoubleBigdecimal {
    public static void main (String[] args) {
//        accumulation();
//
    }

    /**
     * 目的：用来验证float，double，BigDecimal等类型表示的小数累加运算
     * 原因：有些十进制小数例如0.1无法用二进制准确表示
     * 一：0.1转换为书面二进制表示为：0.00011001100...后边1100循环
     * 二：浮点数是指：用符号、尾数、基数、指数这四部分来表示的小数，
     *    使用与实际小数点位置不同的书写方式来表示小数的形式成为浮点数，
     *    浮点数与定点数对应，定点数为常见的小数，例如：100.6和0.00068，
     *    对应的浮点数为0.1006*10^3,0.68*10(-3)
     * 三：在计算机中，双精度浮点数类型用64位、单精度浮点数用32位来表示全体小数
     *    计算机中使用“将小数点前面的值固定为1的正则表达式”，由于整数第一位都是1二位以后都是0，
     *    因此仅保留小数部分
     *
     * TODO 验证 float类型4字节32位，截取32位
     */
    private static void accumulation(){
        float f = 0.1f;
        double d = 0.1d;
        BigDecimal b = new BigDecimal("0.1");
        BigDecimal bd = new BigDecimal(0.1d);
        BigDecimal bf = new BigDecimal(0.1f);
        BigDecimal bds = new BigDecimal(String.valueOf(0.1d));
        BigDecimal bfs = new BigDecimal(String.valueOf(0.1f));
        for (int i = 1;i<100;i++) {
            f += 0.1;
            d += 0.1;
            b = b.add(new BigDecimal("0.1"));
            bd = bd.add(new BigDecimal(0.1d));
            bf = bf.add(new BigDecimal(0.1f));
            bds = bds.add(new BigDecimal(String.valueOf(0.1d)));
            bfs = bfs.add(new BigDecimal(String.valueOf(0.1f)));
        }
        System.out.println("将float类型0.1累加100次后，结果为："+f);//运算结果为10.000002
        System.out.println("将float类型0.1累加100次后，结果为："+d);//运算结果为9.99999999999998
        System.out.println("Stirng型0.1的BigDecimal数值累加100次后，结果为："+b);//运算结果为10.0
        System.out.println("double型0.1的BigDecimal数值累加100次后，结果为："+bd);//运算结果为10.0000000000000005551115123125782702118158340454101562500
        System.out.println("float型0.1的BigDecimal数值0.1累加100次后，结果为："+bf);//运算结果为10.000000149011611938476562500
        System.out.println("double型0.1的BigDecimal数值累加100次后，结果为："+bds);//运算结果为10.0
        System.out.println("float型0.1的BigDecimal数值0.1累加100次后，结果为："+bfs);//运算结果为10.0
    }

}
