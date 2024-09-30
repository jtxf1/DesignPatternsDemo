package design.patterns.creational.builder.interfaces.imp;

import design.patterns.creational.builder.interfaces.Packing;

public class Bottle implements Packing {

    @Override
    public String pack() {
        return "Bottle";
    }
}