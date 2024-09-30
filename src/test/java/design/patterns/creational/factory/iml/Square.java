package design.patterns.creational.factory.iml;

import design.patterns.creational.factory.Shape;

public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}