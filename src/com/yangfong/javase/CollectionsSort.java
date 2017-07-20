package com.yangfong.javase;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by dell on 2017-06-28.
 */
public class CollectionsSort {

    List<DemoDomain> originList;
    @Before
    public void createList() {
        originList = new ArrayList<>();
        originList.add(new DemoDomain(1,7));
        originList.add(new DemoDomain(2,6));
        originList.add(new DemoDomain(3,9));
        originList.add(new DemoDomain(4,8));
        originList.add(new DemoDomain(5,5));
    }

    @Test
    public void testSort() {
        Collections.sort(originList,new Comparator<DemoDomain>(){

            @Override
            public int compare(DemoDomain o1, DemoDomain o2) {
                if(o1.getAge() > o2.getAge()) {
                    return 1;
                } else if (o1.getAge() < o2.getAge()) {
                    return -1;
                }
                return 0;
            }
        });
        for(int i = 0; i< originList.size(); i++) {
            System.out.println(originList.get(i).toString());
        }
    }
}
