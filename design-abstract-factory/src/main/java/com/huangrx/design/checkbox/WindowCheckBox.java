package com.huangrx.design.checkbox;

import lombok.extern.slf4j.Slf4j;

/**
 * All products families have the same varieties (HTMl/Windows).
 *
 * @author hrenxiang
 * @since 2022-05-05 3:26 PM
 */
@Slf4j
public class WindowCheckBox implements CheckBoxes{
    @Override
    public void paint() {
        log.info("{}", "You have created WindowCheckBox.");
    }
}
