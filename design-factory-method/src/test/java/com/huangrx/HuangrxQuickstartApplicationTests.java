package com.huangrx;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootTest
class HuangrxQuickstartApplicationTests {

    @Test
    void contextLoads() {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            Date parse = simpleDateFormat.parse("2022-05-01 15:00:00");
            System.out.println(parse.getTime());
            Date parse1 = simpleDateFormat.parse("2022-04-29 00:00:00");
            System.out.println(parse1.getTime());
            long l = parse.getTime() - parse1.getTime();
            long nd = 1000 * 24 * 60 * 60;
            Long days = l / nd;
            System.out.println(days.intValue());
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }

}
