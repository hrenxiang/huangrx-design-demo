package com.huangrx.design.controller;

import com.huangrx.design.buttons.Button;
import com.huangrx.design.checkbox.CheckBoxes;
import com.huangrx.design.enums.ButtonEnum;
import com.huangrx.design.factory.BaseFactory;
import com.huangrx.design.factory.HtmlFactory;
import com.huangrx.design.factory.WindowFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 控制器
 *
 * @author hrenxiang
 * @since 2022-05-05 2:21 PM
 */
@RestController
@Slf4j
public class ApiController {

    @Value("${app.type}")
    private String sysProperty;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test() {
        BaseFactory baseFactory = this.configure();
        Button button = baseFactory.createButton();
        button.paint();
        log.info("{}", "=============");
        CheckBoxes checkBox = baseFactory.createCheckBox();
        checkBox.paint();
        return "The access succeeded. Please view the log!";
    }

    /**
     * The concrete factory is usually chosen depending on configuration or environment options.
     */
    private BaseFactory configure() {
        if (ButtonEnum.WINDOW.getProperty().equals(sysProperty)) {
            return new WindowFactory();
        } else {
            return new HtmlFactory();
        }
    }

}
