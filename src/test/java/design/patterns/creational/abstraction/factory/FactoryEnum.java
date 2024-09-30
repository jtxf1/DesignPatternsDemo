package design.patterns.creational.abstraction.factory;


import design.patterns.creational.abstraction.factory.service.Color;
import design.patterns.creational.abstraction.factory.service.Shape;
import design.patterns.creational.abstraction.factory.service.iml.*;

import java.util.Objects;

public enum FactoryEnum {
    CIRCLE(new Circle(), "CIRCLE"),
    RECTANGLE(new Rectangle(), "RECTANGLE"),
    SQUARE(new Square(), "SQUARE"),
    RED(new Red(), "RED"),
    GREEN(new Green(), "GREEN"),
    BLUE(new Blue(), "BLUE"),
    SHAPE(new ShapeFactory(), "SHAPE"),
    COLOR(new ColorFactory(), "COLOR");

    // 成员变量
    private Shape shape;
    private Color color;
    private AbstractFactory abstractFactory;
    private String name;

    // 普通方法
    public static Shape getShape(String name) {
        for (FactoryEnum c : FactoryEnum.values()) {
            if (Objects.equals(c.name, name)) {
                return c.shape;
            }
        }
        return null;
    }

    // 普通方法
    public static Color getColor(String name) {
        for (FactoryEnum c : FactoryEnum.values()) {
            if (Objects.equals(c.name, name)) {
                return c.color;
            }
        }
        return null;
    }

    // 普通方法
    public static AbstractFactory getAbstractFactory(String name) {
        for (FactoryEnum c : FactoryEnum.values()) {
            if (Objects.equals(c.name, name)) {
                return c.abstractFactory;
            }
        }
        return null;
    }

    // 构造方法
    FactoryEnum(Shape shape, String name) {
        this.shape = shape;
        this.name = name;
    }

    // 构造方法
    FactoryEnum(Color color, String name) {
        this.color = color;
        this.name = name;
    }
    // 构造方法
    FactoryEnum(AbstractFactory abstractFactory, String name) {
        this.abstractFactory = abstractFactory;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Shape getShape() {
        return shape;
    }


    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public Color getColor() {
        return color;
    }


    public void setColor(Color color) {
        this.color = color;
    }

    public AbstractFactory getAbstractFactory() {
        return abstractFactory;
    }


    public void setAbstractFactory(AbstractFactory abstractFactory) {
        this.abstractFactory = abstractFactory;
    }


    public void setName(String name) {
        this.name = name;
    }
}