package com.huangrx.design.prototype.controller;

import com.huangrx.design.prototype.shaps.Circle;
import com.huangrx.design.prototype.shaps.Rectangle;
import com.huangrx.design.prototype.shaps.Shape;

import java.util.ArrayList;
import java.util.List;

/**
 * 控制器
 *
 * @author    hrenxiang
 * @since     2022/5/16 1:52 PM
 */
public class Api {

    /**
     * 测试
     */
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        List<Shape> shapesCopy = new ArrayList<>();

        Circle circle = new Circle();
        circle.x = 10;
        circle.y = 20;
        circle.radius = 15;
        circle.color = "red";
        shapes.add(circle);

        Circle anotherCircle = (Circle) circle.clone();
        shapes.add(anotherCircle);
        System.out.println(anotherCircle);

        Rectangle rectangle = new Rectangle();
        rectangle.width = 10;
        rectangle.height = 20;
        rectangle.color = "blue";
        shapes.add(rectangle);

        cloneAndCompare(shapes, shapesCopy);
    }

    private static void cloneAndCompare(List<Shape> shapes, List<Shape> shapesCopy) {
        for (Shape shape : shapes) {
            shapesCopy.add(shape.clone());
        }
        System.out.println(shapes);
        System.out.println(shapesCopy);

        for (int i = 0; i < shapes.size(); i++) {
            // == 比较的是引用，equals比较的是重写的具体逻辑
            if (shapes.get(i) != shapesCopy.get(i)) {
                System.out.println(i + ": Shapes are different objects (yay!)");
                if (shapes.get(i).equals(shapesCopy.get(i))) {
                    System.out.println(i + ": And they are identical (yay!)");
                } else {
                    System.out.println(i + ": But they are not identical (booo!)");
                }
            } else {
                System.out.println(i + ": Shape objects are the same (booo!)");
            }
        }
    }
}