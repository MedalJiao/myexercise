package com.yangfong.javase;

import org.junit.Test;

import java.util.Arrays;

/**
 * Created by Bruce.Jiao on 17-3-6.
 */
public class StringLength {

    @Test
    public void testLength(){
        System.out.println("中国".length());
        System.out.println(Arrays.toString("中国".toCharArray()));
        System.out.println("中国".toCharArray().length);
        System.out.println("zhong".length());
        System.out.println("zhong".toCharArray().length);
        String str = "CriteriaQuery<Long> query = builder.createQuery(Long.class);Root<Tariff> root=query.from(Tariff.class);Predicatewhere=ilder.and(builder.equal(root.get(\"partner\").get(\"id\"),endorCompanyConfigId),builder.equal(root.get(\"tariffType\"), TariffType.BUYING));测试字符数";
        System.out.println(str.length());
    }
}
