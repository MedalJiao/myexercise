package com.yangfong.javase;

import org.junit.Test;

import java.util.LinkedHashMap;

/**
 * Created by Bruce.Jiao on 17-4-9.
 */
public class MapPutNull {

    @Test
    public void test(){
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        map.put("a", null);
        System.out.print(map.get("a"));
    }
}
