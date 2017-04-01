package com.yangfong.javase;

public class Sync4Thread3 implements Runnable{
    int b = 8;
    public synchronized void m1() throws Exception{
        b = 100;
        Thread. sleep(1000);
        System.out.println( "m1中 b = "+b );
    }

    public synchronized void m2() throws Exception{
        b = 200;
        Thread. sleep(200);
        System.out.println( "m2中 b = "+b );
    }

    public void run() {
        try {
            m1();
        } catch (Exception e) {}
    }

    /**
     * 运行结果：
     * m2中 b = 200
     * m1中 b = 100
     */
    public static void main(String[] args) throws Exception{
        Sync4Thread3 r = new Sync4Thread3();
        Thread thread = new Thread(r);
        thread.start();
        r.m2();
    }
}
