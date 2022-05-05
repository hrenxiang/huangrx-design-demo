package com.huangrx.buttons;

import lombok.extern.slf4j.Slf4j;

/**
 * HTML button implementation.
 * H5页面按钮实现
 *
 * @author hrenxiang
 * @since 2022-05-05 2:08 PM
 */
@Slf4j
public class HtmlButton implements Button {
    @Override
    public void render() {
      log.info("{}", "HTML Test Button");
      onclick();
    }

    @Override
    public void onclick() {
        log.info("{}", "Click! HTML Button says - 'Hello World!");
    }
}
