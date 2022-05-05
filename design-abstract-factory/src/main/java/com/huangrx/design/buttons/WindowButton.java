package com.huangrx.design.buttons;

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
    public void paint() {
        log.info("{}", "You have created WindowButton.");
    }
}
