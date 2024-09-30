package design.patterns.creational.builder.interfaces.imp;

import design.patterns.creational.builder.interfaces.ItemInterface;
import design.patterns.creational.builder.interfaces.PackingInterface;

public abstract class BurgerImpl implements ItemInterface {

    @Override
    public PackingInterface packing() {
        return new WrapperImpl();
    }

    @Override
    public abstract float price();
}