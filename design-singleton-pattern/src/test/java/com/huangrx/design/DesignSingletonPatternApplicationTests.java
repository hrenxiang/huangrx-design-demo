package com.huangrx.design;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class DesignSingletonPatternApplicationTests {

    @Autowired
    private hh hh;

    @Test
    void contextLoads() {
        List<com.huangrx.design.hh.gg> hobby = hh.getHobby();
        System.out.println(hobby.get(0));
    }

}
