package design.patterns.creational.factory;

public class FactoryPatternDemo {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        //获取 Circle 的对象，并调用它的 draw 方法
        Shape shape1 = shapeFactory.getShape("CIRCLE");

        //调用 Circle 的 draw 方法
        shape1.draw();

        //获取 Rectangle 的对象，并调用它的 draw 方法
        Shape shape2 = shapeFactory.getShape("RECTANGLE");

        //调用 Rectangle 的 draw 方法
        shape2.draw();

        //获取 Square 的对象，并调用它的 draw 方法
        Shape shape3 = shapeFactory.getShape("SQUARE");

        //调用 Square 的 draw 方法
        shape3.draw();

        /*使用枚举类 优化*/
        if (Factory.getShape("CIRCLE") != null) {
            Factory.getShape("CIRCLE").draw();
        }
        if (Factory.getShape("RECTANGLE") != null) {
            Factory.getShape("RECTANGLE").draw();
        }
        if (Factory.getShape("SQUARE") != null) {
            Factory.getShape("SQUARE").draw();
        }
    }
}