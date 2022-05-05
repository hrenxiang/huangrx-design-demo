package com.huangrx.controller;

import com.huangrx.enums.ButtonEnum;
import com.huangrx.factory.BaseDialog;
import com.huangrx.factory.HtmlDialog;
import com.huangrx.factory.WindowDialog;
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
public class ApiController {

    @Value("${button}")
    private String property;

    private static BaseDialog dialog;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test() {
        this.configure();
        runBusinessLogic();
        return "The access succeeded. Please view the log!";
    }

    /**
     * The concrete factory is usually chosen depending on configuration or environment options.
     */
    void configure() {
        if (ButtonEnum.WINDOW.getProperty().equals(property)) {
            dialog = new WindowDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    /**
     * All the client code should work with factories and products through abstract interfaces.
     * This way it does not care which factory it works with and what kind of product it returns.
     */
    static void runBusinessLogic() {
        dialog.renderWindow();
    }

}
