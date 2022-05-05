package com.huangrx.design.buttons;

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
    public void paint() {
        log.info("{}", "You have created HTMLButton.");
    }

}
