package design.patterns.creational.factory;

import java.util.Objects;

public class FactoryPatternDemo {

    public static void main(String[] args) {
        /*使用枚举类 优化*/
        Objects.requireNonNull(FactoryEnum.getShape("CIRCLE")).draw();
        Objects.requireNonNull(FactoryEnum.getShape("RECTANGLE")).draw();
        Objects.requireNonNull(FactoryEnum.getShape("SQUARE")).draw();
    }
}