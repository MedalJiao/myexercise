package com.yangfong.javase;

import org.junit.Test;

/**
 * Created by Bruce.Jiao on 17-3-20.
 */
public class SynchronizedTest {

    @Test
    public void test(){
        MyThread mt = new MyThread();
        Thread t1 = new Thread(mt, "A");
        Thread t2 = new Thread(mt, "B");
        t1.start();
        t2.start();//从打印结果可以看出
    }

    public static void main(String[] args) {
        //一下规则对其他对象锁也有效
        //1,验证多个线程操作synchronized方法,从打印结果可以看出A执行完成后，才会执行B线程
//        MyThread mt = new MyThread();
//        Thread t1 = new Thread(mt, "A");
//        Thread t2 = new Thread(mt, "B");
//        t1.start();
//        t2.start();
        //2,验证多个线程操作同一个对象的synchronized和非synchronized方法，
        //结果：C线程执行print1和D线程执行print2交叉进行，但是只有在C线程执行完print1方法后，D线程才会开始执行print3方法
        //结论：（1）当一个线程访问object的一个synchronized(this)同步代码块时，另一个线程仍然可以访问该object中的非synchronized(this)同步代码块，
        //（2）当一个线程访问object的一个synchronized(this)同步代码块时，其他线程对object中所有其它synchronized(this)同步代码块的访问将被阻塞。
        //也就是说，当一个线程访问object的一个synchronized(this)同步代码块时，它就获得了这个object的对象锁。结果，其它线程对该object对象所有同步代码部分的访问都被暂时阻塞
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                SynchDemo.print1();
            }
        }, "C");
        Thread t4 = new Thread(new Runnable() {
            @Override
            public void run() {
                SynchDemo.print2();
                SynchDemo.print3();
            }
        }, "D");
        Thread t5 = new Thread(new Runnable() {
            @Override
            public void run() {
                SynchDemo.print3();
            }
        }, "E");
        t3.start();
        t4.start();
//        t5.start();
    }

    private static class MyThread implements Runnable{

        @Override
        public void run() {
            synchronized (this) {
                for (int i = 1; i < 51; i++) {
                    System.out.println(Thread.currentThread().getName()+"线程loop："+i);
                }
            }
        }
    }

    private static class SynchDemo{

        public static synchronized void print1() {
            for (int i = 1; i < 51; i++) {
                System.out.println(Thread.currentThread().getName()+"线程print1："+i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        public static void print2() {
            for (int i = 1; i < 51; i++) {
                System.out.println(Thread.currentThread().getName()+"线程print2："+i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        public static synchronized void print3() {
            for (int i = 1; i < 51; i++) {
                System.out.println(Thread.currentThread().getName()+"线程print3："+i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
