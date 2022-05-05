package com.huangrx.design.buttons;

/**
 * Common interface for all buttons.
 * 通用产品接口
 *
 * 抽象工厂假设你有几个系列的产品，结构成单独的类层次结构(按钮/复选框)。
 * 同一家族的所有产品都有共同的接口。
 *
 * @author hrenxiang
 * @since 2022-05-05 2:06 PM
 */
public interface Button {

    /**
     * paint 风格
     */
    void paint();

}
