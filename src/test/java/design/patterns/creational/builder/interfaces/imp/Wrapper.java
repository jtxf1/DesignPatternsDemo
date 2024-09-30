package design.patterns.creational.builder.interfaces.imp;

import design.patterns.creational.builder.interfaces.Packing;

public class Wrapper implements Packing {

    @Override
    public String pack() {
        return "Wrapper";
    }
}