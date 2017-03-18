package com.yangfong.javase;

import org.junit.Test;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * Created by Bruce.Jiao on 17-3-16.
 */
public class HashMapHashTable {

    @Test
    public void test(){
        final Executor executor = Executors.newCachedThreadPool();
        Map<Integer, Integer> hashMap = new HashMap<>();
        Map<Integer, Integer> hashTable = new Hashtable<>();
        for (int i = 0; i < 6; i++) {
            final int f = i;
            executor.execute(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 1000; j++) {
                        hashMap.put(j,j);
                        hashTable.put(j,j);
                    }
                    System.out.println("线程"+f+"拿到的HashMap中456值："+hashMap.get(456));
                    System.out.println("线程"+f+"拿到的HashTable中456值："+hashTable.get(456));
                }
            });
        }
    }

    @Test
    public void testHashMap(){
        Map<Integer, Integer> hashMap = new HashMap<>();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int j = 0; j < 1000; j++) {
                    hashMap.put(j,j);
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int j = 0; j < 1000; j++) {
                    hashMap.put(j,j);
                }
            }
        });
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int j = 0; j < 1000; j++) {
                    hashMap.put(j,j);
                }
            }
        });
        Thread t4 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程4拿到的HashMap中456值："+hashMap.get(456));
            }
        });
        Thread t5 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程5拿到的HashMap中456值："+hashMap.get(456));
            }
        });
        Thread t6 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程6拿到的HashMap中456值："+hashMap.get(456));
            }
        });
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
    }

}
