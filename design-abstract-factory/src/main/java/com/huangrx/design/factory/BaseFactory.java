package com.huangrx.design.factory;

import com.huangrx.design.buttons.Button;
import com.huangrx.design.checkbox.CheckBoxes;

/**
 * Base factory class.
 * Abstract factory knows about all (abstract) product types.
 *
 * @author hrenxiang
 * @since 2022-05-05 2:14 PM
 */
public abstract class BaseFactory {

    /**
     * Subclasses will override this method in order to create specific button objects.
     *
     * @return specific button objects
     * 创建特定的按钮对象
     */
    public abstract Button createButton();

    /**
     * Subclasses will override this method in order to create specific checkboxes objects.
     *
     * @return specific button objects
     * 创建特定的复选框对象
     */
    public abstract CheckBoxes createCheckBox();
}
