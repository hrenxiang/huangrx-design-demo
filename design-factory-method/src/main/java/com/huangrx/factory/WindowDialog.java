package com.huangrx.factory;

import com.huangrx.buttons.Button;
import com.huangrx.buttons.WindowButton;

/**
 * Window Dialog will produce HTML buttons.
 *
 * @author hrenxiang
 * @since 2022-05-05 2:19 PM
 */
public class WindowDialog extends BaseDialog {

    @Override
    public Button createButton() {
        return new WindowButton();
    }

}
