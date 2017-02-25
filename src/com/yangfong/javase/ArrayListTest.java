package com.yangfong.javase;

import com.yangfong.utils.MyException;
import junit.framework.TestCase;
import org.junit.Test;

import java.util.Arrays;
import java.util.Stack;

/**
 * Created by Bruce.Jiao on 17-2-23.
 */
public class ArrayListTest extends TestCase{

    @Test
    public void testArrayList(){
        try {
            ArrayListV00 arrayList = new ArrayListV00(0);
            arrayList.add("aaa");
            arrayList.add("bbb");
            arrayList.add("ccc");
            arrayList.add("fff");
            arrayList.add("ggg");
            System.out.println("集合下标2处的元素："+arrayList.get(2));
            System.out.println("是否包含ccc这个元素："+arrayList.contains("ccc"));
            System.out.println("是否包含ddd这个元素："+arrayList.contains("ddd"));
            System.out.println("删除前集合大小为："+arrayList.size());
            System.out.println("删除下标2处元素前底层数组："+arrayList);
            arrayList.remove(2);
            System.out.println("删除下标2处元素后底层数组："+arrayList);
            System.out.println("删除一个元素后集合大小为："+arrayList.size());
            arrayList.remove(2);
            System.out.println("再删除下标2处元素后底层数组："+arrayList);
            System.out.println("集合为："+ Arrays.toString(arrayList.toArray()));
            System.out.println("集合底层数组长度："+ arrayList.arrayLength());
//            System.out.println("集合下标-1处的元素："+arrayList.get(-1));
        } catch (MyException e) {
            System.out.println("发生异常>>>"+e);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
