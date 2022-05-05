package com.huangrx.buttons;

/**
 * Common interface for all buttons.
 * 通用产品接口
 *
 * @author hrenxiang
 * @since 2022-05-05 2:06 PM
 */
public interface Button {

    /**
     * render 渲染
     */
    void render();

    /**
     * click 点击
     */
    void onclick();
}
