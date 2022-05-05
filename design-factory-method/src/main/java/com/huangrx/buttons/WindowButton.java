package com.huangrx.buttons;

import lombok.extern.slf4j.Slf4j;

/**
 * Window button implementation.
 * window窗口按钮实现
 *
 * @author hrenxiang
 * @since 2022-05-05 2:11 PM
 */
@Slf4j
public class WindowButton implements Button {
    @Override
    public void render() {
        log.info("{}", "Window Test Button");
        onclick();
    }

    @Override
    public void onclick() {
        log.info("{}", "Click! Window Button says - 'Hello World!");
    }
}
