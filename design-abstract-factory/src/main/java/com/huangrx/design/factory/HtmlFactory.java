package com.huangrx.design.factory;

import com.huangrx.design.buttons.Button;
import com.huangrx.design.buttons.HtmlButton;
import com.huangrx.design.checkbox.CheckBoxes;
import com.huangrx.design.checkbox.HtmlCheckBox;

/**
 * Each concrete factory extends basic factory and responsible for creating products of a single variety.
 * 每个具体工厂都扩展了基本工厂，负责创建单一品种的产品。
 *
 * @author hrenxiang
 * @since 2022-05-05 2:19 PM
 */
public class HtmlFactory extends BaseFactory {


    @Override
    public Button createButton() {
        return new HtmlButton();
    }

    @Override
    public CheckBoxes createCheckBox() {
        return new HtmlCheckBox();
    }
}
