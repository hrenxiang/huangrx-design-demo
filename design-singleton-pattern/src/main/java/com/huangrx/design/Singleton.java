package com.huangrx.design;

/**
 * 单例实现
 *
 * @author hrenxiang
 * @since 2022-05-05 5:06 PM
 */
public class Singleton {

    private static Singleton singleton = new Singleton();

    public static Singleton getInstance() {
        return singleton;
    }

    public void test() {
        System.out.println("hello java!");
    }
}
