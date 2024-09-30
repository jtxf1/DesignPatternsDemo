package design.patterns.creational.builder.interfaces.imp;

import design.patterns.creational.builder.interfaces.PackingInterface;

public class WrapperImpl implements PackingInterface {

    @Override
    public String pack() {
        return "Wrapper";
    }
}