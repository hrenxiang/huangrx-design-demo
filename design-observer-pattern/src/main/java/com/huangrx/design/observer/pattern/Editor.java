package com.huangrx.design.observer.pattern;

import java.io.File;

/**
 * 具体发布者， 由其他对象追踪
 * @author    hrenxiang
 * @since     2022/7/23 18:15
 */
public class Editor {
    public EventManager events;
    private File file;

    public Editor() {
        this.events = new EventManager("open", "save");
    }

    public void openFile(String filePath) {
        this.file = new File(filePath);
        // 打开文件时 发布消息给监听相应操作的 订阅者
        events.notify("open", file);
    }

    public void saveFile() throws Exception {
        if (this.file != null) {
            // 打开文件时 发布消息给监听相应操作的 订阅者
            events.notify("save", file);
        } else {
            throw new Exception("Please open a file first.");
        }
    }
}