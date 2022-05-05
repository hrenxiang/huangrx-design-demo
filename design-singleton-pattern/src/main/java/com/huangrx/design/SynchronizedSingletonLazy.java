package com.huangrx.design;

/**
 * 单例 懒加载 安全
 *
 * @author hrenxiang
 * @since 2022-05-05 5:25 PM
 */
public class SynchronizedSingletonLazy {
    private static SingletonLazy instance;
    public static synchronized SingletonLazy getInstance() {
        if (instance == null) {
            instance = new SingletonLazy();
        }
        return instance;
    }
}
