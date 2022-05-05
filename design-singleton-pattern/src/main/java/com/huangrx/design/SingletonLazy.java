package com.huangrx.design;

/**
 * 单例 懒加载
 *
 * @author hrenxiang
 * @since 2022-05-05 5:12 PM
 */
public class SingletonLazy {

    private static SingletonLazy instance;
    public static SingletonLazy getInstance() {
        if (instance == null) {
            instance = new SingletonLazy();
        }
        return instance;
    }

}
