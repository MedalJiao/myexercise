package com.yangfong.javase;

import org.junit.Test;

/**
 * 实现多线程的两种方式：继承Thread和实现Runnable接口。
 * 二者区别：
 * （1）继承只能单继承，实现却可以多实现，因此实现Runnable接口灵活性高；
 * （2）继承Thread实现的多线程可以直接调用Thread的静态方法start启动线程，实现Runnable的多线程没有start方法，
 * 需要借助Thread的一个构造函数public Thread(Runnable targer)来调用Thread的start方法；
 * （3）使用Runnable实现的多线程，同一个实例可以多次传入Thread构造函数来启动新线程，从而达到多个线程共享同一个资源的目的，
 * 继承Thread实现的多线程实例，如果同一个实例多次调用start方法，会抛出异常java.lang.IllegalThreadStateException.
 *
 * 注意：juint测试时，可能存在测试线程没有执行完成，但主线程已经运行完成的情况，导致控制台输出的数量并不是预期的数量，
 * 如果需要查看完整的打印可以用main方法来进行测试
 * Created by Bruce.Jiao
 */
public class ThreadContrastRunnable {

   public static void main(String[] args) {
        int total = 100;
        MyThread mt0 = new MyThread(total, "A");
        MyThread mt1 = new MyThread(total, "B");
        MyThread mt2 = new MyThread(total, "C");
        mt0.start();
        mt1.start();
        mt2.start();

        MyRunnable mr = new MyRunnable();
        Thread t0 = new Thread(mr, "X");
        Thread t1 = new Thread(mr, "Y");
        Thread t2 = new Thread(mr, "Z");
//        t1.start();
//        t0.start();
//        t2.start();
    }


    @Test
    public void testThread(){
        int total = 100;
        MyThread mt0 = new MyThread(total, "A");
        MyThread mt1 = new MyThread(total, "B");
        MyThread mt2 = new MyThread(total, "C");
        mt0.start();//一旦调用start方法，jvm会找到线程的run方法去执行
        mt1.start();
        mt2.start();//3个线程分别有一份资源，总共300次打印
    }

    @Test
    public void testRunnable(){
        MyRunnable mr = new MyRunnable();
        Thread t0 = new Thread(mr, "X");
        Thread t1 = new Thread(mr, "Y");
        Thread t2 = new Thread(mr, "Z");
        t1.start();
        t0.start();
        t2.start();//3个线程共用同一份资源，总共100次打印
    }

    private static class MyThread extends Thread{

        private int total;

        public MyThread(int total, String name){
            super(name);
            this.total = total;
        }

        public void run() {
            while(total > 0){
                System.out.println("线程"+Thread.currentThread().getName()+"的第"+(total--)+"次打印");
            }
        }
    }

    private static class MyRunnable implements Runnable{

        private int total = 100;

        public MyRunnable(){}

        @Override
        public void run() {
            while(total > 0){
                System.out.println("线程"+Thread.currentThread().getName()+"的第"+(total--)+"次打印");
            }
        }
    }
}
