package design.patterns.creational.abstraction.factory;

import design.patterns.creational.abstraction.factory.service.Color;
import design.patterns.creational.abstraction.factory.service.Shape;

public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape);
}