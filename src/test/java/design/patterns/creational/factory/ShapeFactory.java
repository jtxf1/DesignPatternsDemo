package design.patterns.creational.factory;

import design.patterns.creational.factory.iml.Circle;
import design.patterns.creational.factory.iml.Rectangle;
import design.patterns.creational.factory.iml.Square;

public class ShapeFactory {

    //使用 getShape 方法获取形状类型的对象
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        return switch (shapeType) {
            case "CIRCLE" -> new Circle();
            case "RECTANGLE" -> new Rectangle();
            case "SQUARE" -> new Square();
            default -> null;
        };
    }
}