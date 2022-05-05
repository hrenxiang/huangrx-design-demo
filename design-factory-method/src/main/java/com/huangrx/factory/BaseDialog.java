package com.huangrx.factory;

import com.huangrx.buttons.Button;

/**
 * Base factory class.
 * Note that "factory" is merely a role for the class.
 * It should have some core business logic which needs different products to be created.
 *
 * @author hrenxiang
 * @since 2022-05-05 2:14 PM
 */
public abstract class BaseDialog {

    public void renderWindow() {
        // ... other code ... 具体逻辑

        Button okButton = createButton();
        okButton.render();
    }

    /**
     * Subclasses will override this method in order to create specific button objects.
     *
     * @return specific button objects
     * 创建特定的按钮对象
     */
    public abstract Button createButton();
}
