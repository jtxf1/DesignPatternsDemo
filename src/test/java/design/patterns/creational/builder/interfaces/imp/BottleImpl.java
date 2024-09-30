package design.patterns.creational.builder.interfaces.imp;

import design.patterns.creational.builder.interfaces.PackingInterface;

public class BottleImpl implements PackingInterface {

    @Override
    public String pack() {
        return "Bottle";
    }
}