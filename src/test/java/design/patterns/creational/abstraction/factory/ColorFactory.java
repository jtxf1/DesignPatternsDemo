package design.patterns.creational.abstraction.factory;

import design.patterns.creational.abstraction.factory.service.Color;
import design.patterns.creational.abstraction.factory.service.Shape;

import java.util.Objects;

public class ColorFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType) {
        return null;
    }

    @Override
    public Color getColor(String color) {
        if (color == null) {
            return null;
        }
        return Objects.requireNonNull(FactoryEnum.getColor(color));
    }
}