package com.huangrx.design;

/**
 * 单例调用
 *
 * @author hrenxiang
 * @since 2022-05-05 5:07 PM
 */
public class Api {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        instance.test();
    }
}
