package design.patterns.creational.abstraction.factory.service.iml;

import design.patterns.creational.abstraction.factory.service.Color;

public class Blue implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }
}