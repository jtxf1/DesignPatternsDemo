package design.patterns.creational.builder.interfaces.imp;

import design.patterns.creational.builder.interfaces.Item;
import design.patterns.creational.builder.interfaces.Packing;

public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}