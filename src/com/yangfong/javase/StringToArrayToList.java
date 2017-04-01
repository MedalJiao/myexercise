package com.yangfong.javase;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Bruce.Jiao on 17-4-1.
 */
public class StringToArrayToList {

    @Test
    public void test() {
        String str = "sfasdgsgevdfds";
        char[] array = str.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        List<char[]> list = Arrays.asList(array);//得到的list泛型不实用
        for(int i = 0; i < array.length; i++) {
            char temp = array[i];
            if (!map.containsKey(temp)) {
                map.put(temp, 1);
            } else {
                int count = map.get(temp);
                map.put(temp, ++count);//此处不能写作count++，因为加1必须在put之前
            }
        }
        System.out.println(map.toString());
    }
}
