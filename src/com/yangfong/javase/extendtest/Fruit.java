package com.yangfong.javase.extendtest;

/**
 * Created by Bruce.Jiao on 17-4-7.
 */
public class Fruit {

    private String name;
    private int size;

    public Fruit(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public void addSize() {
        this.size++;
    }

    public void printSize() {
        System.out.println("size of " + name + " = " + size);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
