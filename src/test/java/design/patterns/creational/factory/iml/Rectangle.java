package design.patterns.creational.factory.iml;

import design.patterns.creational.factory.Shape;

public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}