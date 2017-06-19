package com.yangfong.javase;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bruce.Jiao on 2017/5/10.
 */
public class MergeTwoList {

    private List<DemoDomain> list1;
    private List<DemoDomain> list2;

    @Before
    public void initData() {
        list1 = new ArrayList<>();
        DemoDomain d1 = new DemoDomain(1, "aaa", "111");
        DemoDomain d2 = new DemoDomain(2, "bbb", "222");
        DemoDomain d3 = new DemoDomain(3, "ccc", "333");
        list1.add(d1);
        list1.add(d2);
        list1.add(d3);
        list2 = new ArrayList<>();
        DemoDomain d4 = new DemoDomain(2, 22);
        DemoDomain d5 = new DemoDomain(3, 33);
        DemoDomain d6 = new DemoDomain(5, 55);
        list2.add(d4);
        list2.add(d5);
        list2.add(d6);
    }

    /**
     * 测试将两个list集合的元素进行整合
     * 思路：两个DemoDomain的list，list1中的对象只有id、name、pwd属性值，list2中的对象只有id、age属性值
     * 现在要通过一个方法，将list1和list2中都有的对象，属性值合并，对于两者特有的那些属性，就添加到结果集中
     * 得到的结果集元素如下：
     * demo1(1, "aaa", "111", 0)
     * demo2(2, "bbb", "222", 22)
     * demo3(3, "ccc", "333", 33)
     * demo4(5, "", "", 55)
     */
    @Test
    public void test(){
        List<DemoDomain> demoDomains = mergeList(list1, list2);
        for (DemoDomain dd: demoDomains) {
            System.out.println(dd);
        }
    }

    public List<DemoDomain> mergeList(List<DemoDomain> list1, List<DemoDomain> list2) {
        List<DemoDomain> result = new ArrayList<>();
        List<Integer> ids1 = new ArrayList<>();
        List<Integer> ids2 = new ArrayList<>();
        for (DemoDomain d1: list1) {
            ids1.add(d1.getId());
        }
        for (DemoDomain d2: list2) {
            ids2.add(d2.getId());
        }
        for (DemoDomain d11: list1) {
            for (DemoDomain d22: list2) {
                if (d11.getId() != 0 && d22.getId() != 0 && d11.getId()== d22.getId()) {
                    d11.setAge(d22.getAge());
                } else if (!ids1.contains(d22.getId()) &&  !result.contains(d22)) {
                    result.add(d22);
                }
            }
        }
        result.addAll(list1);
        return result;
    }
}
