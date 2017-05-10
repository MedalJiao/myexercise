package com.yangfong.javase;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Bruce.Jiao on 2017/4/25.
 */
public class SimpleDateFormatTest {

    @Test
    public void testBasicMethod() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        Date d = new Date();
        String str = null;
        try {
            date = sdf.parse("2017-04-25");
            str = sdf.format(d);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        System.out.println(date);
        System.out.println(str);
    }
}
