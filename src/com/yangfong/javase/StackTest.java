package com.yangfong.javase;

import com.yangfong.utils.MyException;
import junit.framework.TestCase;
import org.junit.Test;

import java.util.Stack;

/**
 * Created by Bruce.Jiao on 17-2-24.
 */
public class StackTest extends TestCase {

    @Test
    public void testStack(){
        try {
            StackV00 stack = new StackV00();
            stack.push("ccc");
            stack.push(null);
            stack.push("bbb");
            stack.push("aaa");
            System.out.println("栈的大小："+stack.size());
            System.out.println("栈是否为空："+stack.isEmpty());
            System.out.println("栈是否为空："+stack);
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            stack.clear();
            System.out.println("清空后，栈大小："+stack.size());
            System.out.println("栈是否为空："+stack.isEmpty());
        } catch (MyException e) {
            System.out.println(e);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
