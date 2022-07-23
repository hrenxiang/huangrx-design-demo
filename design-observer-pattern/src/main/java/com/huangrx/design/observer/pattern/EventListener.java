package com.huangrx.design.observer.pattern;

import java.io.File;

/**
 * 通用观察者接口
 * @author    hrenxiang
 * @since     2022/7/23 18:15
 */
public interface EventListener {
    void update(String eventType, File file);
}