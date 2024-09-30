package design.patterns.creational.builder.interfaces.imp;

import design.patterns.creational.builder.interfaces.Item;
import design.patterns.creational.builder.interfaces.Packing;

public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}