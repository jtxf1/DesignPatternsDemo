package design.patterns.creational.builder.interfaces.imp;

import design.patterns.creational.builder.interfaces.ItemInterface;
import design.patterns.creational.builder.interfaces.PackingInterface;

public abstract class ColdDrinkImpl implements ItemInterface {

    @Override
    public PackingInterface packing() {
        return new BottleImpl();
    }

    @Override
    public abstract float price();
}