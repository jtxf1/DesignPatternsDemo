package design.patterns.creational.abstraction.factory;

import design.patterns.creational.abstraction.factory.service.Color;
import design.patterns.creational.abstraction.factory.service.Shape;

import java.util.Objects;

public class ShapeFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        return Objects.requireNonNull(FactoryEnum.getShape(shapeType));
    }

    @Override
    public Color getColor(String color) {
        return null;
    }
}