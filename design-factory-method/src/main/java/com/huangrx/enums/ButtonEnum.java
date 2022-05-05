package com.huangrx.enums;

import lombok.Getter;

/**
 * buttons enum.
 *
 * @author hrenxiang
 * @since 2022-05-05 2:24 PM
 */
public enum ButtonEnum {

    HTML("HTML"),
    WINDOW("Window");

    @Getter
    private String property;

    ButtonEnum(String property) {
        this.property = property;
    }
}
