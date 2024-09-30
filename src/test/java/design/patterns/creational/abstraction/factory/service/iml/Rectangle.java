package design.patterns.creational.abstraction.factory.service.iml;

import design.patterns.creational.abstraction.factory.service.Shape;

public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}