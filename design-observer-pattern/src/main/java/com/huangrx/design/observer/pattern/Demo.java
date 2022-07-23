package com.huangrx.design.observer.pattern;

public class Demo {
    public static void main(String[] args) {
        Editor editor = new Editor();
        // 发布者将事件和订阅者进行绑定
        editor.events.subscribe("open", new LogOpenListener("D:\\jetbrains\\workspace\\huangrx-design-demo\\design-observer-pattern\\src\\main\\resources\\static\\abc.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("admin@example.com"));

        try {
            // 发布者打开文件时
            editor.openFile("abc.txt");
            // 发布者保存文件时
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}