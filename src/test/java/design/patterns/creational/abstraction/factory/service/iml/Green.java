package design.patterns.creational.abstraction.factory.service.iml;

import design.patterns.creational.abstraction.factory.service.Color;

public class Green implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}