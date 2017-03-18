package com.yangfong.javase;

import org.apache.commons.lang3.concurrent.BasicThreadFactory;
import org.junit.Before;
import org.junit.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by Bruce.Jiao on 17-3-17.
 */
public class MultiThread {

    //公共资源
    private int total;
    private ExecutorService executors;

    @Before
    public void initTotal(){
        total = 100;
        executors = new ThreadPoolExecutor(10,10,6000, TimeUnit.MILLISECONDS,new LinkedBlockingQueue<Runnable>(),
                new BasicThreadFactory.Builder().build(),new ThreadPoolExecutor.AbortPolicy());
    }

    @Test
    public void testThread(){
        MyThread mt0 = new MyThread(total);
        MyThread mt1 = new MyThread(total);
        MyThread mt2 = new MyThread(total);
        mt0.start();
        mt1.start();
        mt2.start();
    }

    @Test
    public void testRunnable(){
        MyRunnable mr = new MyRunnable(total);
        executors.execute(mr);
//        Thread t0 = new Thread(mr);
//        Thread t1 = new Thread(mr);
//        Thread t2 = new Thread(mr);
//        t1.start();
//        t0.start();
//        t2.start();
    }

    private class MyThread extends Thread{

        private int total;

        public MyThread(int total){
            this.total = total;
        }

        @Override
        public void run() {
            while(total > 0){
                System.out.println("线程"+Thread.currentThread().getName()+"的第"+(total--)+"次打印");
            }
        }
    }

    private class MyRunnable implements Runnable{

        private int total;

        public MyRunnable(int total){
            this.total = total;
        }

        @Override
        public void run() {
            while(total > 0){
                System.out.println("线程"+Thread.currentThread().getName()+"的第"+(total--)+"次打印");
            }
        }
    }
}
